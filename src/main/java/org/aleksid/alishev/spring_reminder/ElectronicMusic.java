package org.aleksid.alishev.spring_reminder;

import org.springframework.stereotype.Component;

@Component
public class ElectronicMusic implements Music {
    @Override
    public String getSong() {
        return "PopCorn";
    }
}
