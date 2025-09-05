package ex08;

public class Carrinhos {
    private String modelo;
    private String cor;
    private int ano;

    public Carrinhos(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrinhos{");
        sb.append("modelo=").append(modelo);
        sb.append(", cor=").append(cor);
        sb.append(", ano=").append(ano);
        sb.append('}');
        return sb.toString();
    }

}
