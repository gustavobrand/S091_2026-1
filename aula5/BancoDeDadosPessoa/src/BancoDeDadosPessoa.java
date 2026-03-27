import java.util.ArrayList;

public class BancoDeDadosPessoa {

	protected ArrayList<Pessoa> pessoas;

	public BancoDeDadosPessoa() {
		this.pessoas = new ArrayList<>();
	}

	public void salvarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public boolean removerPessoa(Pessoa pessoa) {
		return pessoas.remove(pessoa);
	}

	public ArrayList<Pessoa> buscarPessoas() {
		return new ArrayList<>(pessoas);
	}

	public Pessoa buscarPessoaPorCpf(String cpf) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf() != null && pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}

	public ArrayList<Pessoa> buscarPessoasPorNome(String nome) {
		ArrayList<Pessoa> pessoasEncontradas = new ArrayList<>();
		if (nome == null || nome.isBlank()) {
			return pessoasEncontradas;
		}

		String nomeBuscado = nome.toLowerCase();
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome() != null && pessoa.getNome().toLowerCase().contains(nomeBuscado)) {
				pessoasEncontradas.add(pessoa);
			}
		}
		return pessoasEncontradas;
	}

	public Pessoa buscarPessoa(Pessoa pessoaBuscada) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.equals(pessoaBuscada)) {
				return pessoa;
			}
		}
		return null;
	}

    @Override
    public String toString() {
		return "BancoDeDadosPessoa{" +
				"pessoas=" + pessoas +
				'}';
    } 

}
