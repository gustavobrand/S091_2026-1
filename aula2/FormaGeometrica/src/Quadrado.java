public class Quadrado extends FormaGeometrica {
	private float lado;
	
	public Quadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calculaArea() {
		return (lado*lado);
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", calculaArea()=" + calculaArea() + "]";
	}	
}
