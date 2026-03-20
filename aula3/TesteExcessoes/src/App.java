public class App {
    private int id;

	public App(int id) {
		this.id = id;
	}
	public int buscaChave(String id) {
		if (id == null || id == "") {
			return -1;
		}
		return 0;
	}
	public int buscaChaveComExcessao(String id) throws Exception {
		if (id == null) {
			throw new Exception("Parametro invalido - id nulo");
		}
		if (id == "") {
			throw new Exception("Parametro invalido - id vazio");
		}
        int number = Integer.parseInt(id.trim());
        if (number < 0) {
			throw new Exception("Parametro invalido - id negativo");
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		App verificacaoDeExcessao = new App(10);
		System.out.println("Executando programa");
//		int retorno = verificacaoDeExcessao.buscaChave("");
//		if (retorno < 0) {
//			System.out.println("Erro ao executar a busca pela chave");
//		}
		try {
			verificacaoDeExcessao.buscaChaveComExcessao("a");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de array");
		} catch (NumberFormatException e) {
			System.out.println("Erro: numero invalido");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Erro com excessao ao executar a busca pela chave");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}
}
