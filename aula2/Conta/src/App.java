public class App {
    public static void main(String[] args) throws Exception {

        ContaCorrente cc = new ContaCorrente(1000, "Joao", 10);
		ContaPoupanca cp = new ContaPoupanca("Maria", 1);

		cc.depositar(100);
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
