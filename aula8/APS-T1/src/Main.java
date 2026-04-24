import javax.swing.JOptionPane;

public class Main {

	private static PessoaService pessoaService;
	private static SalarioService salarioService;

	public static void main(String[] args) {
		BancoDados bancoDados = selecionarBancoDados();
		if (bancoDados == null) {
			JOptionPane.showMessageDialog(null, "opcao invalida para salvamento");
			System.exit(1);
		}
		pessoaService = new PessoaServiceImpl(bancoDados);
		salarioService = new SalarioServiceImpl(bancoDados);

		while (true) {
			executarOpcao(JOptionPane.showInputDialog(menuPrincipal()));
		}
	}

	private static BancoDados selecionarBancoDados() {
		String opcao = JOptionPane.showInputDialog("Selecione a forma de armazenamento\n1.Lista\n2.Mapa");
		if ("1".equals(opcao)) {
			return new BancoDadosLista();
		}
		if ("2".equals(opcao)) {
			return new BancoDadosMapa();
		}
		return null;
	}

	private static void executarOpcao(String opcao) {
		if ("1".equals(opcao)) {
			cadastrarPessoaFisica();
			return;
		}
		if ("2".equals(opcao)) {
			cadastrarPessoaJuridica();
			return;
		}
		if ("3".equals(opcao)) {
			mostrarSalarios();
			return;
		}
		if ("4".equals(opcao)) {
			removerPessoa();
			return;
		}
		if ("5".equals(opcao)) {
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, "opcao invalida");
	}

	private static void removerPessoa() {
		try {
			String idPessoa = JOptionPane.showInputDialog("Qual id da pessoa para remover");
			pessoaService.remover(Integer.parseInt(idPessoa));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "erro ao remover pessoa");
		}
	}

	private static void mostrarSalarios() {
		JOptionPane.showMessageDialog(null, salarioService.calcularSalario());
	}

	private static void cadastrarPessoaJuridica() {
		try {
			String nome = JOptionPane.showInputDialog("Qual nome da empresa");
			String endereco = JOptionPane.showInputDialog("Qual endereco da empresa");
			String cnpj = JOptionPane.showInputDialog("Qual cnpj da empresa");

			PessoaJuridica pessoaJuridica = new PessoaJuridica();
			pessoaJuridica.setNome(nome);
			pessoaJuridica.setEndereco(endereco);
			pessoaJuridica.setCnpj(cnpj);
			pessoaService.salvar(pessoaJuridica);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "erro ao salvar pessoa");
		}
	}

	private static void cadastrarPessoaFisica() {
		try {
			String nome = JOptionPane.showInputDialog("Qual nome da pessoa");
			String endereco = JOptionPane.showInputDialog("Qual endereco da pessoa");
			String cpf = JOptionPane.showInputDialog("Qual cpf da pessoa");
			String salario = JOptionPane.showInputDialog("Qual salario da pessoa");

			PessoaFisica pessoaFisica = new PessoaFisica();
			pessoaFisica.setNome(nome);
			pessoaFisica.setEndereco(endereco);
			pessoaFisica.setCpf(cpf);
			pessoaFisica.setSalario(Float.parseFloat(salario));
			pessoaService.salvar(pessoaFisica);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "erro ao salvar pessoa");
		}
	}

	public static String menuPrincipal() {
		StringBuilder menu = new StringBuilder();
		menu.append("selecione uma opcao\n");
		menu.append("1. cadastro pessoa fisica\n");
		menu.append("2. cadastro pessoa juridica\n");
		menu.append("3. mostra salario pessoa fisica\n");
		menu.append("4. remover uma opcao\n");
		menu.append("5. sair\n");
		return menu.toString();
	}

}
