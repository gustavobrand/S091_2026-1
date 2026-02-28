package s110.professoraluno;

public class Aluno extends Pessoa {
    private int serie;

    public Aluno(String nome, int idade, String endereco, String telefone, int serie) {
        super(nome, idade, endereco, telefone);
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie; 
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", serie=" + serie + ", idade=" + idade + ", endereco=" + endereco
                + ", telefone=" + telefone + "]";
    }

    
    
}
