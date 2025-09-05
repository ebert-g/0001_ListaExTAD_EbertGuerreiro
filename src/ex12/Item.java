package ex12;

public class Item {
    private String nome;
    private float valor;

    public Item(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Iten [nome=" + nome + ", valor=" + valor + "]";
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
