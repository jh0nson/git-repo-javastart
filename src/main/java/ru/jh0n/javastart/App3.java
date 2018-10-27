package ru.jh0n.javastart;

import java.util.Random;
import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rnd=new Random();
        int i,n=0;
        String enterword ="";
        String showword ="";
        i = rnd.nextInt(words.length);
        System.out.println("Угадай фрукт");
        while (n < words[i].length()) {
            Scanner scanner = new Scanner(System.in);
            enterword = scanner.nextLine();

            if (enterword.equals(words[i])) {
                System.out.println("ВЫ угадали");
                break;
            }

            showword = showword+String.valueOf(words[i].charAt(n));
            System.out.println("Неверно. Подсказка:");
            System.out.println(showword + "***************");
            //System.out.println("n= "+n+ " enter "+enterword+" words[i] "+words[i]);
            n++;
        }
        if (!enterword.equals(words[i])) System.out.println("Не повезло. Попытки кончились.");



    }

}