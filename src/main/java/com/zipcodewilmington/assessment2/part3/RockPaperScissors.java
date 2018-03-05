package com.zipcodewilmington.assessment2.part3;

import sun.plugin.net.proxy.PluginAutoProxyHandler;
import sun.security.krb5.internal.PAData;

public enum RockPaperScissors {

    ROCK ("rock"),
    PAPER ("paper"),
    SCISSORS("scissors");

    private final String sign;

    RockPaperScissors(String sign) {
        this.sign = sign;
    }


    public RockPaperScissors getWinningSign() {
        if (this.name().equals("ROCK")){
            return PAPER;
        }
        else if (this.name().equals("PAPER")) {
            return SCISSORS;
        }
        else if (this.name().equals("SCISSORS")){
            return ROCK;
        }
        return null;
    }

    public RockPaperScissors getLosingSign() {
        if (this.name().equals("PAPER")){
            return ROCK;
        }
        else if (this.name().equals("SCISSORS")) {
            return PAPER;
        }
        else if (this.name().equals("ROCK")){
            return SCISSORS;
        }
        return null;
    }
}
