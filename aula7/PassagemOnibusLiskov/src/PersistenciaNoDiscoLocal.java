public class PersistenciaNoDiscoLocal implements RegistrarPassagem {
    @Override
    public void gravar(Passagem passagem) {
        System.out.println("Persistindo informação no disco local...");
    }

}
