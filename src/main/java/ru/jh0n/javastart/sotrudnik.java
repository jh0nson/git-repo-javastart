package ru.jh0n.javastart;
//

public class sotrudnik {
    String FIO;
    String dolgnost;
    String email;
    String telefon;
    float zarplata;
    int voszrast;

    public sotrudnik(String name, String workpl, String mail, String phone, Float oklad, int age) {
        FIO=name;
        dolgnost=workpl;
        email=mail;
        telefon=phone;
        zarplata=oklad;
        voszrast=age;
    }
    public void printInfo(){
        System.out.println(FIO+" "+dolgnost+" "+email+" "+telefon+" "+zarplata+" "+voszrast);
    }

}
