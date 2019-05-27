package ru.jh0n.javastart.lesson1;

import java.util.Random;

public class Treadmill extends Barrier {
    private String action;
    private int barrier;

    public Treadmill() {
        Random rnd = new Random();
        this.barrier = 60 + rnd.nextInt(40);
        this.action = "run";
    }

    public String getAction() {
        return action;
    }

    public int getBarrier() {
        return this.barrier;
    }

    @Override
    public void setBarrier(int barrier) {
        this.barrier = barrier;

    }
}

