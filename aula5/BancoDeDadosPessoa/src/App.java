
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        BancoDeDadosPessoa bancoDeDados = new BancoDeDadosPessoa();
		Pessoa joao = new Pessoa("Joao da silva", "2342346457");
		Pessoa maria = new Pessoa("Maria da Gloria", "4356568789");
		bancoDeDados.salvarPessoa(joao);
		bancoDeDados.salvarPessoa(maria);
		
		ArrayList<Pessoa> pessoa1 = bancoDeDados.buscarPessoasPorNome("joao");
		Pessoa pessoa2 = bancoDeDados.buscarPessoaPorCpf("4356568789");
		ArrayList<Pessoa> pessoa3 = bancoDeDados.buscarPessoasPorNome("miguel");
		Pessoa joaoTeste = new Pessoa("Joao da Silva", "32342342");
		Pessoa pessoa4 = bancoDeDados.buscarPessoa(joaoTeste);
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(pessoa4);
		
		System.out.println(bancoDeDados);
		bancoDeDados.removerPessoa(pessoa4);
		System.out.println(bancoDeDados);


    }
}
