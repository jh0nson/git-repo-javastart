package ru.jh0n.javastart;

import java.util.Random;

public class App2 {

    public static void main(String[] args) {

        //пункт 1 дз
        int [] binarray={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0;i<binarray.length;i++){
            if (binarray[i] ==0)
                {binarray[i]=1;}
            else
                {binarray[i]=0;}
            System.out.print(binarray[i] +" ");
            }
        //пункт 2 дз
        System.out.println();
        int [] arr0=new int [8];
        for (int i=0;i<8;i++){
            arr0[i]=i*3;
            System.out.print(arr0[i]+" ");
        }

        //пункт 3 дз
        System.out.println();
        int []arr1={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]<6) {
                arr1[i]=arr1[i]*2;
            }
            System.out.print(arr1[i]+" ");
        }

        //пункт 4 дз
        int [][] arr3=new int[4][4];
        for (int i=0;i<4;i++){
            arr3[i][i]=1;
            arr3[4-i-1][i]=1;
        }

        //пункт 5 дз
        System.out.println();
        int arr4[]=new int [10];
        int min,max;
        for (int i=0;i<10;i++){
            Random rnd=new Random();
            arr4[i]=rnd.nextInt(101);
        }
        min=arr4[0];
        max=arr4[0];
        for (int i=0;i<10;i++){
            if (min>arr4[i]){
                min=arr4[i];
            }
            if (max<arr4[i]){
                max=arr4[i];
            }
            System.out.print(arr4[i]+" ");
        }
        System.out.println("Max="+max+"; Min="+min+";");

        //пункт 6 дз

    }
}
