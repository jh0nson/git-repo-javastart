package ru.jh0n.javastart.lesson3;


import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        int i,c;





// Задание 1
        HashMap<String,Integer> countWords =new HashMap<>();
        String[] array = new String[]{"apple", "pineapple", "mango", "pear", "lemon", "banana", "mango", "melon", "orange", "apple", "peach", "lime", "melon", "kiwifruit", "plum", "apple", "pomegranate"};

        HashSet<String> printArray =new HashSet<String>();
        for (i=0;i<array.length;i++) {
            if (printArray.contains(array[i])) {
                if (countWords.containsKey(array[i])) {
                    c=countWords.get(array[i])+1;
                    countWords.put(array[i],c);
                } else countWords.put(array[i],2);
            }
            printArray.add(array[i]);

        }
        System.out.println(printArray);
        System.out.println(countWords);

//Задание 2
        PhoneBook pb = new PhoneBook();
        Record rec1=new Record("petrov","1111");
        Record rec2=new Record("petrov","2222");
        Record rec3=new Record("ivanov","3333");
        Record rec4=new Record("sidorov","4444");
        Record rec5=new Record("ivanova","4444");//на одном номере сидят
        Record rec6=new Record("petrova","5555");
        Record rec7=new Record("sidorova","6666");
        Record rec8=new Record("pyatrovich","7777");
        Record rec9=new Record("petrovich","8888");
        pb.add(rec1);
        pb.add(rec2);
        pb.add(rec3);
        pb.add(rec4);
        pb.add(rec5);
        pb.add(rec6);
        pb.add(rec7);
        pb.add(rec8);
        pb.add(rec9);

        pb.get("petrova33");


    }

}
