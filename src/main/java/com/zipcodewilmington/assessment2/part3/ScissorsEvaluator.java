package com.zipcodewilmington.assessment2.part3;

public abstract class ScissorsEvaluator implements Evaluator {

    public ScissorsEvaluator() {}

    public boolean canBeatPaper() {
        return true;
    }

    public boolean canBeatRock() {
        return false;
    }
}

