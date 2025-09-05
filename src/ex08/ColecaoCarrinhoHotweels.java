package ex08;

import java.util.ArrayList;

public class ColecaoCarrinhoHotweels {
    private ArrayList<Carrinhos> colecaoCarrinhos;

    public ColecaoCarrinhoHotweels(ArrayList<Carrinhos> colecaoCarrinhos) {
        this.colecaoCarrinhos = colecaoCarrinhos;
    }

    public ArrayList<Carrinhos> getColecaoCarrinhos() {
        return colecaoCarrinhos;
    }

    public void setColecaoCarrinhos(ArrayList<Carrinhos> colecaoCarrinhos) {
        this.colecaoCarrinhos = colecaoCarrinhos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColecaoCarrinhoHotweels{");
        sb.append("colecaoCarrinhos=").append(colecaoCarrinhos);
        sb.append('}');
        return sb.toString();
    }

}
