package ex07;

import java.util.Date;

public class Pets {
    private String nome;
    private String telefoneTutor;
    private Date date;
    private String raca;

    public Pets(String nome, String telefoneTutor, Date date, String raca) {
        this.nome = nome;
        this.telefoneTutor = telefoneTutor;
        this.date = date;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneTutor() {
        return telefoneTutor;
    }

    public void setTelefoneTutor(String telefoneTutor) {
        this.telefoneTutor = telefoneTutor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pets{");
        sb.append("nome=").append(nome);
        sb.append(", telefoneTutor=").append(telefoneTutor);
        sb.append(", date=").append(date);
        sb.append(", raca=").append(raca);
        sb.append('}');
        return sb.toString();
    }
}
