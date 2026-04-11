public class App {
    public static void main(String[] args) throws Exception {

        PersistenciaNaAWS gravacaoNaNuvem = new PersistenciaNaAWS();
        PersistenciaNoBDSQL gravacaoNoBanco = new PersistenciaNoBDSQL();
        PersistenciaNoDiscoLocal gravacaoNoHD = new PersistenciaNoDiscoLocal();
        
        Passagem passagem1 = new Passagem(50f, "Porto Alegre", "Rio de Janeiro");
		Passagem passagem2 = new Passagem(60f, "Porto Alegre","Sao Paulo");

        ServicoDePassagens servicoDePassagens = new ServicoDePassagens(gravacaoNaNuvem);
        servicoDePassagens.gravarPassagem(passagem1);
        servicoDePassagens.gravarPassagem(passagem2);

        servicoDePassagens.setRegistroDePassagem(gravacaoNoBanco);
        servicoDePassagens.gravarPassagem(passagem1);
        servicoDePassagens.gravarPassagem(passagem2);

        servicoDePassagens.setRegistroDePassagem(gravacaoNoHD);
        servicoDePassagens.gravarPassagem(passagem1);
        servicoDePassagens.gravarPassagem(passagem2);

    }
}
