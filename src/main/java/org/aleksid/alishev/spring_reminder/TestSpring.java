package org.aleksid.alishev.spring_reminder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        MusicPlayer musicPlayer = new MusicPlayer(
//                context.getBean("classicalMusic", Music.class),
//                context.getBean("rockMusic", Music.class),
//                context.getBean("electronicMusic", Music.class)
//        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
