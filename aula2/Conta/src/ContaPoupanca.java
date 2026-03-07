public class ContaPoupanca implements Conta {
    private float saldo=0;
	private String nome;
	private float percentualDeRendimento;

    public ContaPoupanca(String nome, float percentualDeRendimento) {
        this.nome = nome;
        this.percentualDeRendimento = percentualDeRendimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
        return "ContaPoupanca [nome=" + nome + ", percentualDeRendimento=" + percentualDeRendimento + ", saldo=" + saldo
                + "]";
    }
    
}
