public class ConfigSistema {
    private String nome;
    private String pathComImagens;    
    private static ConfigSistema instancia;

    private ConfigSistema() {
        System.out.println("Criando um objeto de "
				+ this.getClass().getSimpleName());
    }

    public static ConfigSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfigSistema();
        }
        return instancia;
    }
    public static ConfigSistema getInstancia(String nome, String pathComImagens) {
        instancia = getInstancia();
        instancia.nome = nome;
        instancia.pathComImagens = pathComImagens;
        return instancia;
    }

    public String getNome() {
        return nome;
    }
    public String getPathComImagens() {
        return pathComImagens;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPathComImagens(String pathComImagens) {
        this.pathComImagens = pathComImagens;
    }
}