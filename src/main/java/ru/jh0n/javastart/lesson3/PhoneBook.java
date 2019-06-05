package ru.jh0n.javastart.lesson3;

import java.util.ArrayList;


public class PhoneBook {
    private  ArrayList<Record> RecordBook = new ArrayList<>();

    public PhoneBook() {

    }

    public void add(Record rec){
       RecordBook.add(rec);
    }

    public void get (String name) {
        int i;
        ArrayList<String> printPhoneNumber =new ArrayList<>();


            for (i=0;i<RecordBook.size();i++) {
                if (RecordBook.get(i).getName().equals(name)) {

                    printPhoneNumber.add(RecordBook.get(i).getPhonenumber());
                }

            }
            if (printPhoneNumber.size()!=0)
            System.out.println("Номер абонента "+name+" "+printPhoneNumber.toString());
            else System.out.println("Абонента "+name+"не существует");
            //System.out.println(name);
    }

}
