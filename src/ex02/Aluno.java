package ex02;

public class Aluno {
    private String nome;
    private int semestre;

    public Aluno(String nome, int semestre) {
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", semestre=" + semestre + "]";
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
