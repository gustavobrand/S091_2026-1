public class ContaPoupanca extends ContaBancaria implements Conta {
	private float percentualDeRendimento;

    public ContaPoupanca(float percentualDeRendimento, String nome) {
        super(nome);
        this.percentualDeRendimento = percentualDeRendimento;
    }

    public float getPercentualDeRendimento() {
        return percentualDeRendimento;
    }
    public void setPercentualDeRendimento(float percentualDeRendimento) {
        this.percentualDeRendimento = percentualDeRendimento;
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
        return "ContaPoupanca [percentualDeRendimento=" + percentualDeRendimento + ", nome=" + getNome() + ", saldo=" + getSaldo() + "]";
    }
    
}
