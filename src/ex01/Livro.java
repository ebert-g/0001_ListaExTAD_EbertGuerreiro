package ex01;

public class Livro {
    private String titulo;
    private String editora;
    private Integer anoPublicacao;

    public Livro(Integer anoPublicacao, String editora, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("titulo=").append(titulo);
        sb.append(", editora=").append(editora);
        sb.append(", anoPublicacao=").append(anoPublicacao);
        sb.append('}');
        return sb.toString();
    }

}
