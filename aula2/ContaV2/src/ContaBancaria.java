public class ContaBancaria {
    protected float saldo;
	private String nome;
	
    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }
    // protected void setSaldo(float valor) {
    //     saldo = valor;
    // }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ContaBancaria [nome=" + nome + ", saldo=" + saldo + "]";
    }
}
