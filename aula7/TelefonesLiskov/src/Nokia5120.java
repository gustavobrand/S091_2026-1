public class Nokia5120 implements Voz {
    @Override
    public void realizarLigacao(String numero) {
        System.out.println("Realizando ligação para " + numero);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação...");
    }

    // Caso se a interface exigisse os metodos de mensagens
    // @Override
    // public void enviarMensagemSMS(String numero, String mensagem) {}

    // @Override
    // public String receberMensagemSMS(String numero) {return null;}
}
