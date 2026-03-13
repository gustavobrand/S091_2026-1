public class App {
    public static void main(String[] args) throws Exception {

        ContaCorrente cc = new ContaCorrente(1000, 10, "Joao");
		ContaPoupanca cp = new ContaPoupanca(1, "Maria");

		cc.depositar(102);
		System.out.println(cc);
		cc.sacar(50);
		System.out.println(cc);
        cc.sacar(500);
		System.out.println(cc);
		cc.sacar(1000);
		System.out.println(cc);

		cp.depositar(500);
		System.out.println(cp);
		cp.sacar(100);
		System.out.println(cp);
		cp.sacar(500);
		System.out.println(cp);
    }
}
