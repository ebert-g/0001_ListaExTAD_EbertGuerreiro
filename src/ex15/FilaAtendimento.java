package ex15;

public class FilaAtendimento {
    private String nomePaciente;
    private String prioridade;
    private String horarioChegada;

    public FilaAtendimento(String horarioChegada, String nomePaciente, String prioridade) {
        this.horarioChegada = horarioChegada;
        this.nomePaciente = nomePaciente;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "FilaAtendimento [nomePaciente=" + nomePaciente + ", prioridade=" + prioridade + ", horarioChegada="
                + horarioChegada + "]";
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }
}
