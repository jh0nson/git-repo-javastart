package ru.jh0n.javastart.lesson3;

public class Record {
    private String name;
    private String phonenumber;

    public Record (String name, String phonenumber){
        this.name=name;
        this.phonenumber=phonenumber;
    }
    public String getName() {
        return name;
    }

    public void setData(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

}
