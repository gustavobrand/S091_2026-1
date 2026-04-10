public class Nokia6120i implements Voz, Mensagens {
    @Override
    public void realizarLigacao(String numero) {
        System.out.println("Realizando ligação para " + numero);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void enviarMensagemSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }

    @Override
    public String receberMensagemSMS(String numero) {
        return "Recebendo SMS de " + numero;
    }

}
