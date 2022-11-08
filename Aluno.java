package CP3;

public class Aluno  extends Registro{
    private String curso;

    public Aluno(String nome, String ra, String curso) {
        super(nome, ra);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    Aluno () {

    }

    Aluno(String nome, String ra, String curso) {
        super(nome, ra);
        this.curso = curso;
    }


}
