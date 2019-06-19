package ru.jh0n.javastart.lesson5;

public class Method1 {
    static final int size = 10000000;
    static final int half = size/2;


    public static void main() {
        float [] arr = new float [size];
        for (int i=0;i<arr.length;i++) arr[i]=1;
        long a= System.currentTimeMillis();

        for (int i=0;i<size;i++){
            arr[i]=(float) (arr[i]*Math.sin(0.2f+i/5)+Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
        System.out.println(System.currentTimeMillis()-a);
    }

}
