package org.aleksid.alishev.spring_reminder;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Bogemian Rapsody";
    }
}
