package ru.jh0n.javastart.lesson1;

public class Human {
    private String name;
    private int Age;
    private int maxjumpheight;
    private int maxrunlenght;

    public int getMaxjumpheight() {
        return maxjumpheight;
    }

    public void setMaxjumpheight(int maxjumpheight) {
        this.maxjumpheight = maxjumpheight;
    }

    public int getMaxrunlenght() {
        return maxrunlenght;
    }

    public void setMaxrunlenght(int maxrunlenght) {
        this.maxrunlenght = maxrunlenght;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void run () {
        System.out.println(this.name+" run");
    }
    public void jump (){
        System.out.println(this.name+" jump");

    }
}
