package ex014;

import java.util.Date;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private Date date;

    public Funcionario(String cargo, Date date, String nome, float salario) {
        this.cargo = cargo;
        this.date = date;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", date=" + date + "]";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
