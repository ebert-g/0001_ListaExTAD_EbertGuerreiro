package ex16;

import java.util.Date;

public class Anatocao {
    private Date date;
    private String titulo;
    private String anotacaoConteudo;

    @Override
    public String toString() {
        return "Anatocao [date=" + date + ", titulo=" + titulo + ", anotacaoConteudo=" + anotacaoConteudo + "]";
    }

    public Anatocao(String anotacaoConteudo, Date date, String titulo) {
        this.anotacaoConteudo = anotacaoConteudo;
        this.date = date;
        this.titulo = titulo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnotacaoConteudo() {
        return anotacaoConteudo;
    }

    public void setAnotacaoConteudo(String anotacaoConteudo) {
        this.anotacaoConteudo = anotacaoConteudo;
    }

}
