package ru.jh0n.javastart.lesson1;

import java.util.Random;

public class Wall extends Barrier {
    private int barrier;
    private String action;

    public String getAction() {
        return action;
    }

    public Wall()
    {
        Random rnd=new Random();
        this.barrier = 120 + rnd.nextInt(50);
        this.action="jump";
    }
    public int getBarrier() {
        return barrier;
    }

    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public void setBarrier(int barrier) {
        this.barrier = barrier;
    }

    public static void main(String[] args) {
        
    }
}
