package CP3

public class Professor extends Registro {
    private String disciplina;

    public Professor(String nome, String ra, String disciplina) {
        super(nome, ra);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    Professor () {

    }

    Professor(String nome, String ra, String disciplina) {
        super(nome, ra);
        this.disciplina = disciplina;
    }


    
}
