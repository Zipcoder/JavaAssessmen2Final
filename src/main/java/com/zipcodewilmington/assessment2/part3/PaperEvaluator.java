package com.zipcodewilmington.assessment2.part3;

public abstract class PaperEvaluator implements Evaluator {

        public PaperEvaluator() {}

        public boolean canBeatRock() {
            return true;
        }

        public boolean canBeatScissors() {
            return false;
        }
    }

