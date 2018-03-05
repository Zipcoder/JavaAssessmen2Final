package com.zipcodewilmington.assessment2.part3;

public abstract class RockEvaluator implements Evaluator {

        public RockEvaluator() {}

        public boolean canBeatPaper() {
            return false;
        }

        public boolean canBeatScissors() {
            return true;
        }
    }
