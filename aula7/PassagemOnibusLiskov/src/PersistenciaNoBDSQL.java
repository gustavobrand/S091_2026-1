public class PersistenciaNoBDSQL implements RegistrarPassagem {

	@Override
	public void gravar(Passagem passagem) {
		System.out.println("Persistindo informação no banco de dados SQL...");
	}

}
