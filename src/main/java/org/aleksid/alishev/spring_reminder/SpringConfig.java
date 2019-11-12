package org.aleksid.alishev.spring_reminder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.aleksid.alishev.spring_reminder")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public SingleJanreMusicPlayer sjMusicPlayer(){
        SingleJanreMusicPlayer singleJanreMusicPlayer = new SingleJanreMusicPlayer();
        singleJanreMusicPlayer.setMusic(classicalMusic());
        return singleJanreMusicPlayer;
    }

    @Bean
    public Music classicalMusic() {
        return new ClassicalMusic();
    }


}
