package CP3;

public class Coordenador extends Registro {

    private String curso;

    public Coordenador(String nome, String ra, String curso) {
        super(nome, ra);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    Coordenador () {

    }

    Coordenador(String nome, String ra, String curso) {
        super(nome, ra);
        this.curso = curso;
    }

}
