package org.aleksid.alishev.spring_reminder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = new MusicPlayer(
                context.getBean("classicalMusic", Music.class),
                context.getBean("rockMusic", Music.class),
                context.getBean("electronicMusic", Music.class)
        );
        musicPlayer.play();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
