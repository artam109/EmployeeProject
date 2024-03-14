package Modeller.Departmanlar;

public class BilisimTeklonojileriDepartmani implements Department {

    final String departmanKodu = "BTD";

    // TODO Bu class'da sadece zam oranini belirtmelisiniz
    //      Başka bişeyi değiştirmeye gerek yok.
    final int zamOrani = 25;


    @Override
    public int getRaiseRate() {
        return zamOrani;
    }

    @Override
    public String getDepartmentCode() {
        return departmanKodu;
    }
}
