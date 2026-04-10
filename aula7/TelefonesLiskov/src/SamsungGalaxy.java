public class SamsungGalaxy implements Voz, Mensagens, Dados, IA {
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

    @Override
    public void enviarDados(String numero, String dados) {
        System.out.println("Enviando dados para " + numero + ": " + dados);
    }

    @Override
    public void enviarWhatsapp(String numero, String mensagem) {
        System.out.println("Enviando WhatsApp para " + numero + ": " + mensagem);
    }

    @Override
    public void conversarComChatGPT(String mensagem) {
        System.out.println("Conversando com ChatGPT: " + mensagem);
    }

    @Override
    public void processarToken(String token) {
        System.out.println("Processando token: " + token);
    }

}
