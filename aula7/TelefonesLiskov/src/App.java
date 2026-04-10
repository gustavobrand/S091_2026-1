public class App {
    public static void main(String[] args) throws Exception {
        Nokia5120 nokia = new Nokia5120();
        Nokia6120i nokia2 = new Nokia6120i();
        Iphone4 iphone = new Iphone4();
        SamsungGalaxy samsung = new SamsungGalaxy();

        Voz   FoneBasico;
        Mensagens  FoneComSMS;
        Dados FoneComDados;
        IA    FoneComIA;

        // Todos os telefones podem realizar ligações com a interface Voz
        FoneBasico = nokia;
        FoneBasico.realizarLigacao("123456789");
        FoneBasico = nokia2;
        FoneBasico.realizarLigacao("123456789");
        FoneBasico = iphone;
        FoneBasico.realizarLigacao("123456789");
        FoneBasico = samsung;
        FoneBasico.realizarLigacao("123456789");

        // Apenas os telefones com suporte a mensagens podem enviar SMS
        FoneComSMS = nokia2;
        FoneComSMS.enviarMensagemSMS("123456789", "Olá, Nokia6120i!");
        FoneComSMS = iphone;
        FoneComSMS.enviarMensagemSMS("123456789", "Olá, iPhone4!");
        FoneComSMS = samsung;
        FoneComSMS.enviarMensagemSMS("123456789", "Olá, Samsung Galaxy!");
        
        FoneComDados = iphone;
        FoneComDados.enviarDados("123456789", "Enviando dados do iPhone4");
        FoneComDados.enviarWhatsapp("123456789", "Enviando WhatsApp do iPhone4");
        FoneComDados = samsung;
        FoneComDados.enviarDados("123456789", "Enviando dados do Samsung Galaxy");
        FoneComDados.enviarWhatsapp("123456789", "Enviando WhatsApp do Samsung Galaxy");

        FoneComIA = samsung;
        FoneComIA.conversarComChatGPT("Olá, ChatGPT!");        
    }
}
