public class App {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco("Rua A", "123");
        Pessoa pessoa = new Pessoa("João", endereco);
        System.out.println(pessoa);
    }
}
