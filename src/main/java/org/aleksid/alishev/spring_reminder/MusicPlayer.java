package org.aleksid.alishev.spring_reminder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> playList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public void play(){
        for(Music music : playList){
            System.out.println("Playing " + music.getSong());
        }
    }

    @Autowired
    public MusicPlayer(Music ... playList) {
        this.playList = Arrays.asList(playList);
    }

    public static MusicPlayer getInstance(){
        return new MusicPlayer();
    }

    private MusicPlayer() {
    }

    public void setPlayList(List<Music> music) {
        this.playList = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
