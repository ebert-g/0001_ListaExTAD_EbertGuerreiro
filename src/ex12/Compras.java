package ex12;

import java.util.ArrayList;
import java.util.Date;

public class Compras {
    private ArrayList<Item> listaItens;
    private Date date;
    private float valorTotal;

    public Compras(Date date, ArrayList<Item> listaItens, float valorTotal) {
        this.date = date;
        this.listaItens = listaItens;
        this.valorTotal = valorTotal;
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    @Override
    public String toString() {
        return "Compras [listaItens=" + listaItens + ", date=" + date + ", valorTotal=" + valorTotal + "]";
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

}
