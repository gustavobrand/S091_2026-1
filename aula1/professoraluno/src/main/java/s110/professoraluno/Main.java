package s110.professoraluno;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Smith", 45, "123 Main St", "555-1234", "Matemática");
        Aluno aluno = new Aluno("João", 20, "456 Elm St", "555-5678", 3);

        System.out.println(professor);
        System.out.println(aluno);
    }
}