package org.aleksid.alishev.spring_reminder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingleJanreMusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
//    @Qualifier("rockMusic")
//    @Qualifier("electronicMusic")
    private Music music;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SingleJanreMusicPlayer musicPlayer = context.getBean("singleJanreMusicPlayer", SingleJanreMusicPlayer.class);
        musicPlayer.play();
        context.close();
    }

    private void play() {
        System.out.println("Playing " + music.getSong());
    }
}
