package ex03;

public class Professor {
    private String nome;
    private int codigoDiciplina;

    public Professor(int codigoDiciplina, String nome) {
        this.codigoDiciplina = codigoDiciplina;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDiciplina() {
        return codigoDiciplina;
    }

    public void setCodigoDiciplina(int codigoDiciplina) {
        this.codigoDiciplina = codigoDiciplina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor{");
        sb.append("nome=").append(nome);
        sb.append(", codigoDiciplina=").append(codigoDiciplina);
        sb.append('}');
        return sb.toString();
    }

}
