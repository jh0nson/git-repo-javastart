package ru.jh0n.javastart.lesson5;

class CountArray  extends Thread {
    private float [] arrCount;
    public CountArray (float [] arrCount){
        this.arrCount=arrCount;
    }

    @Override
    public void run (){
       // System.out.println(arrCount.length+ " "+ arrCount[2]);
        for (int i=0;i<arrCount.length;i++){
            arrCount[i]=(float) (arrCount[i]*Math.sin(0.2f+i/5)+Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
        //System.out.println(arrCount.length+ " "+ arrCount[4999999]);
    }
}

public class Method2 {
    static final int size = 10000000;
    static final int half = size/2;
    static float [] arr = new float [size];
    static float [] arr1 = new float [half];
    static float [] arr2 = new float[half];


    public static void main() {

        for (int i=0;i<arr.length;i++) arr[i]=1;

        long a= System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0,half);
        System.arraycopy(arr,half-1,arr2,0,half);

        Thread count1 = new Thread(new CountArray(arr1));
        Thread count2 = new Thread(new CountArray(arr2));
        count1.start();
        count2.start();
        do {} while (count1.isAlive()||count2.isAlive());

        System.arraycopy(arr1,0,arr,0,half);
        System.arraycopy(arr2,0,arr,half-1,half);

        System.out.println(System.currentTimeMillis()-a);
    }
}
