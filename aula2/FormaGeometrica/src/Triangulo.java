public class Triangulo extends FormaGeometrica {
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calculaArea() {
		return (base*altura)/2f;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", calculaArea()=" + calculaArea() + "]";
	}

}
