public class ContaBancaria implements Conta {
    protected float saldo;
	private String nome;
	
    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    @Override
	public boolean sacar(float valor) {
        if ( (valor > 0) && (valor <= saldo)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaBancaria [nome=" + nome + ", saldo=" + saldo + "]";
    }
}
