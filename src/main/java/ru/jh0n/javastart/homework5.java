package ru.jh0n.javastart;

public class homework5 {
    private static sotrudnik[] sotrArr;


    public static void main(String[] args) {
        sotrArr=new sotrudnik[5];
        sotrArr[0]=new sotrudnik("Иванов Иван","инженер","ivan@company.ru","890000324", (float) 556.12f, 25);
        sotrArr[1]=new sotrudnik("Петров Егор","директор","egor@company.ru","890000326", (float) 556.12f, 55);
        sotrArr[2]=new sotrudnik("Сидоров Олег","бухгалтер","oleg@company.ru","890000328", (float) 556.12f, 41);
        sotrArr[3]=new sotrudnik("Козлов Федор","менеджер","fedor@company.ru","890000322", (float) 556.12f, 40);
        sotrArr[4]=new sotrudnik("Ослов Петр","системный администратор","petr@company.ru","890000320", (float) 556.12f, 33);
        for (int i=0;i<sotrArr.length;i++){
            if (sotrArr[i].voszrast>40) sotrArr[i].printInfo();
        }


    }

}
