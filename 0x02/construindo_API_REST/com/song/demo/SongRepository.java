package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.stream().filter(song -> song.getId() == id).findFirst().orElse(null);
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        this.list.forEach(song -> {
            if (song.getId().equals(s.getId())){
                song.setArtista(s.getArtista());
                song.setAlbum(s.getAlbum());
                song.setAnoLancamento(s.getAnoLancamento());
            }
        });
    }

    public void removeSong(Song s) {
        System.out.println("Removing: " + list.remove(s));
    }
}