package ex10;

import java.util.ArrayList;

public interface IPlaylist {

    public void adicionar(Musica musica);

    public void remover(Musica musica);

    public ArrayList<Musica> listarMusicas();
}
