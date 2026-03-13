public class App {
    public static void main(String[] args) throws Exception {
        Quadrado forma1 = new Quadrado(10);
		Triangulo forma2 = new Triangulo(10, 5);
        Circulo forma3 = new Circulo(10);

		System.out.println(forma1);
		System.out.println(forma2);
		System.out.println(forma3);
        System.out.println();
		App.mostrar(forma1);
		App.mostrar(forma2);
		App.mostrar(forma3);
    }

	public static void mostrar(FormaGeometrica forma) {
		float resultado = forma.calculaArea();
        System.out.println("Area calculada: " + resultado);
	}
}
