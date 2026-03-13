public abstract class FormaGeometrica {
	
	public abstract float calculaArea();
	
	public static void mostrar(FormaGeometrica forma) {
		float resultado = forma.calculaArea();
		System.out.println("Area calculada: " + resultado);
	}
}
