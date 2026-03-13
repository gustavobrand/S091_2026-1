    public class Circulo implements FormaGeometrica {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
	public float calculaArea() {
		return (float)(Math.PI*Math.pow(raio, 2));
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", calculaArea()=" + calculaArea() +"]";
    }
    
}
