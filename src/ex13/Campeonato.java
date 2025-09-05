package ex13;

import java.util.ArrayList;

public class Campeonato {
    private String nome;
    private ArrayList<Time> times;
    private String sistemaPontuacao;

    public Campeonato(String nome, String sistemaPontuacao, ArrayList<Time> times) {
        this.nome = nome;
        this.sistemaPontuacao = sistemaPontuacao;
        this.times = times;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Campeonato [nome=" + nome + ", times=" + times + ", sistemaPontuacao=" + sistemaPontuacao + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public String getSistemaPontuacao() {
        return sistemaPontuacao;
    }

    public void setSistemaPontuacao(String sistemaPontuacao) {
        this.sistemaPontuacao = sistemaPontuacao;
    }

}
