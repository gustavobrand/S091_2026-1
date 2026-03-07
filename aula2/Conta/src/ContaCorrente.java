public class ContaCorrente implements Conta{
    private float saldo=0;
	private float limite;
	private String nome;
	private float tarifa;

    public ContaCorrente(float limite, String nome, float tarifa) {
        this.limite = limite;
        this.nome = nome;
        this.tarifa = tarifa;
    }

    public float getSaldo() {
        return saldo;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getTarifa() {
        return tarifa;
    }
    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    @Override
	public boolean sacar(float valor) {
        if ( (valor > 0) && (valor <= (saldo+limite))) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente [limite=" + limite + ", nome=" + nome + ", saldo=" + saldo + ", tarifa=" + tarifa
                + "]";
    }

}
