public class ServicoDePassagens {

    private RegistrarPassagem registroDePassagem;

	public ServicoDePassagens(RegistrarPassagem registroDePassagem) {
		this.registroDePassagem = registroDePassagem;
	}
	public void setRegistroDePassagem(RegistrarPassagem registroDePassagem) {
		this.registroDePassagem = registroDePassagem;
	}
	
	// Parte fundamental da solucao para mudar
	// o comportamento de como iremos persistir a informação
	public void gravarPassagem(Passagem passagem) {
		this.registroDePassagem.gravar(passagem);
	}
}
