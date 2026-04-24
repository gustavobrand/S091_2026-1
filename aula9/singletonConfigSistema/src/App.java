public class App {
    public static void main(String[] args) throws Exception {
        // Nao é possivel com um singleont
        // ConfigSistema sys = new ConfigSistema();

        ConfigSistema sys1 = ConfigSistema.getInstancia();

		System.out.println("Objeto 1: " + sys1);
		sys1.setNome("Sistema 1");
		sys1.setPathComImagens("/tmp/imgs");
		
		ConfigSistema sys2;
		sys2 = ConfigSistema.getInstancia("Sistema 2", "/tmp/newimgs");
		System.out.println("Objeto 2: " + sys2);
		
        // Nesse caso estamos comparando com o == se as referencias apontam para 
        // o mesmo objeto (local na memoria). Se quisessemos comparar o conteudo dos 
        // objetos deveriamos usar o metodo equals() 
		if (sys1 == sys2) {
			System.out.println("Ambas referencias estao apontando para o mesmo objeto.");
		}
    }
}
