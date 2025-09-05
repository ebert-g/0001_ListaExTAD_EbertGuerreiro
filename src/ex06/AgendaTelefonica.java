package ex06;

import java.util.ArrayList;

public class AgendaTelefonica implements IAgendaTelefonica {
    ArrayList<Contato> listaContatos;

    public AgendaTelefonica(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    @Override
    public String toString() {
        return "AgendaTelefonica [listaContatos=" + listaContatos + "]";
    }

    @Override
    public void adicionar(Contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void excluir(Contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public void atualizar(String nome, String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void remover(Contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

}
