public class PessoaValidator {

	public void validar(Pessoa pessoa) {
		verificaNulo(pessoa, "Pessoa esta null");
		verificaTextoPreenchido(pessoa.getNome(), "Nome da pessoa esta invalida");
		verificaTextoPreenchido(pessoa.getEndereco(), "Endereco da pessoa esta invalida");

		if (pessoa instanceof PessoaFisica) {
			validarPessoaFisica((PessoaFisica) pessoa);
		}
	}

	private void validarPessoaFisica(PessoaFisica pessoaFisica) {
		verificaNulo(pessoaFisica.getSalario(), "Salario da pessoa fisica esta invalida");
		verificaValorPositivo(pessoaFisica.getSalario(), "Salario da pessoa fisica esta invalida");
	}

	private void verificaNulo(Object valor, String mensagem) {
		if (valor == null) {
			throw new IllegalArgumentException(mensagem);
		}
	}

	private void verificaTextoPreenchido(String valor, String mensagem) {
		if (valor == null || valor.trim().isEmpty()) {
			throw new IllegalArgumentException(mensagem);
		}
	}

	private void verificaValorPositivo(Float valor, String mensagem) {
		if (valor < 0) {
			throw new IllegalArgumentException(mensagem);
		}
	}

}
