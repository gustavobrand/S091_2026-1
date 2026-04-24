public class CalculadoraSalarioPessoaFisica {
	private int faixaDeSalarioBaixa = 1000;
	private int faixaDeSalarioIntermediaria = 3000;
	private float comissaoNivel1 = 0.02f;
	private float comissaoNivel2 = 0.04f;
	private float comissaoNivel3 = 0.07f;

	public Float calcularSalarioTotal(Float salarioBase) {
		if (salarioBase < faixaDeSalarioBaixa) {
			return calcularComissao(salarioBase, comissaoNivel1);
		} else if (salarioBase < faixaDeSalarioIntermediaria) {
			return calcularComissao(salarioBase, comissaoNivel2);
		}
		return calcularComissao(salarioBase, comissaoNivel3);
	}

	private Float calcularComissao(float salarioBase, float nivelDeComissao) {
		return (float) ((salarioBase * nivelDeComissao) + salarioBase);
	}
}
