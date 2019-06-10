package ru.jh0n.javastart.lesson5;



public class Method3 {
    static final int size = 10000000;
    static final int half = size/2;
    static float [] arr = new float [size];

    static class CountArray1  extends Thread {
        public int od_ev;

        public CountArray1(int odd_even) {
            this.od_ev=odd_even;

        }

        @Override
        public void run (){
            int i;
            i=od_ev;
            while (i<arr.length) {

                arr[i]=(float) (arr[i]*Math.sin(0.2f+i/5)+Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
                //System.out.println(i+" "+od_ev);
                i=i+2;
            }

        }
    }

    public static void main() {
        for (int i=0;i<arr.length;i++) arr[i]=1;

        long a= System.currentTimeMillis();

        Thread count1 = new Thread(new CountArray1(0));
        Thread count2 = new Thread(new CountArray1(1));
        count1.start();
        count2.start();
        do {} while (count1.isAlive()||count2.isAlive());



        System.out.println(System.currentTimeMillis()-a);
    }



}
