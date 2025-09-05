package ex10;

import java.util.ArrayList;

public class Playlist implements IPlaylist {
    private ArrayList<Musica> playlist;

    public Playlist(ArrayList<Musica> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return "Playlist [playlist=" + playlist + "]";
    }

    @Override
    public void adicionar(Musica musica) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remover(Musica musica) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Musica> listarMusicas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Musica> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Musica> playlist) {
        this.playlist = playlist;
    }

}
