package s110.professoraluno;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String endereco, String telefone, String disciplina) {
        super(nome, idade, endereco, telefone);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", telefone=" + telefone + "]";
    }

}
