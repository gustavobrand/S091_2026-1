public class ContaCorrente extends ContaBancaria {
	private float limite;
	private float tarifa;

    public ContaCorrente(float limite, float tarifa, String nome) {
        super(nome);
        this.limite = limite;
        this.tarifa = tarifa;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public float getTarifa() {
        return tarifa;
    }
    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
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
        return "ContaCorrente [limite=" + limite + ", tarifa=" + tarifa + ", nome=" + getNome() + ", saldo=" + getSaldo() + "]";
    }

}
