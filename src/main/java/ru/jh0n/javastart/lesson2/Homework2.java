package ru.jh0n.javastart.lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("������� ��� ����� ������ �������");
        x = in.nextInt();
        y = in.nextInt();
        String[][] ar1 = new String[x][y];
        FillArray(ar1, x, y);
        PrintArray(ar1, x, y);
        try {
            System.out.println("��������� �������� " + ConvertArray(ar1, x, y));
        } catch (MyArraySizeException e) {
            System.out.println("������������ ������ �������. ������ ���� 4�4");
        } catch (MyArrayDataException e) {

            System.out.println("������ ������� �� �������� ������.");
        System.out.println(MyArrayDataException.result());
        }


        }
        private static void FillArray (String[][]array,int x, int y){
            int i, n;
            Scanner in = new Scanner(System.in);
            for (i = 0; i < x; i++) {
                for (n = 0; n < y; n++) {
                    System.out.println("������� ������");
                    array[i][n] = in.next();
                }
            }
        }

        private static void PrintArray (String[][]array,int x, int y){
            int i, n;
            Scanner in = new Scanner(System.in);
            for (i = 0; i < x; i++) {
                System.out.println();
                for (n = 0; n < y; n++) {
                    System.out.print(array[i][n] + " ");

                }
            }
            System.out.println();
        }

    private static int ConvertArray (String [][] array, int x, int y) throws MyArraySizeException, MyArrayDataException {
        int i,n,lstring,sresult = 0;

            if (x!=4||y!=4)throw new MyArraySizeException("SizeException");
            // ���� �� ��, ����� �� �������
            for (i=0;i<x;i++){
                for (n=0;n<y;n++){
                    //������ ������ � ����� ���������� ��� ������������� �����������
                    if (array[i][n].length()==0) {sresult=sresult+0; break;} //���� ������ ������, �� ����� ���������� ����
                    else for (lstring=0;lstring<array[i][n].length();lstring++){
                        //��������� ��� ����� � ������
                        if (!Character.isDigit(array[i][n].charAt(lstring))) throw new MyArrayDataException ("MyArrayDataException",i,n);

                    }
                    sresult=sresult+Integer.valueOf(array[i][n]); //���� ��� ���������� �� ��������� �������� ������

                }
            } return sresult;



    }
}
