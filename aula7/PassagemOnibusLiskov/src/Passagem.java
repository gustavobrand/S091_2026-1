public class Passagem {
    private float valor;
    private String origem;
	private String destino;
    
    public Passagem(float valor, String origem, String destino) {
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
    }

    public float getValor() {
        return valor;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Passagem [valor=" + valor + ", origem=" + origem + ", destino=" + destino + "]";
    }
}
