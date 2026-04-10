public interface Mensagens {
    public void enviarMensagemSMS(String numero, String mensagem);
    public String receberMensagemSMS(String numero);
}
