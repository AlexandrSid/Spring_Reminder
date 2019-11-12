package org.aleksid.alishev.spring_reminder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingleJanreMusicPlayer {
    public void setMusic(Music music) {
        this.music = music;
    }

    //    @Qualifier("rockMusic")
//    @Qualifier("electronicMusic")
    private Music music;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SingleJanreMusicPlayer musicPlayer = context.getBean("sjMusicPlayer", SingleJanreMusicPlayer.class);
        musicPlayer.play();
        context.close();
    }

    private void play() {
        System.out.println("Playing " + music.getSong());
    }
}
