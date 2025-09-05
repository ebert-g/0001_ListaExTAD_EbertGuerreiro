package ex11;

public class Produto {
    private String nome;
    private int codigo;
    private long qtdEstoque;
    private float precoUnitario;

    public Produto(int codigo, String nome, float precoUnitario, long qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(long qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("nome=").append(nome);
        sb.append(", codigo=").append(codigo);
        sb.append(", qtdEstoque=").append(qtdEstoque);
        sb.append(", precoUnitario=").append(precoUnitario);
        sb.append('}');
        return sb.toString();
    }

}
