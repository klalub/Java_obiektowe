// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//
//        House domStefana = new House();
//        domStefana.area = 150;
//        domStefana.garage = true;
//        domStefana.rooms = 6;
//        domStefana.garden = false;
//        domStefana.floors = 2;
//        System.out.println(domStefana.getPrice());
//
//        House domSylwii = new House();
//        domSylwii.area = 175;
//        domSylwii.garage = false;
//        domSylwii.rooms = 4;
//        domSylwii.garden = true;
//        domSylwii.floors = 2;
//        System.out.println(domSylwii.getPrice());
//
//        Pies a = new Pies();
//        a.nazwa = "Rex";
//        a.rasa = "Husky";
//        a.wiek = 6;
//        a.dajGlos();
//
//        Pies b = new Pies();
//        b.nazwa = "Kredo";
//        b.rasa = "Doberman";
//        b.wiek = 13;
//        b.dajGlos();
//
//        Samochod a = new Samochod();
//        a.marka = "Audi";
//        a.model = "A6";
//        a.predkosc = 60;
//        System.out.println(a.przyspiesz(40));
//        System.out.println(a.zwolnij(120));
//
//
//        Samochod b = new Samochod();
//        b.marka = "Citroen";
//        b.model = "C4 Picasso";
//        b.predkosc = 30;
//        System.out.println(b.zwolnij(120));
//        System.out.println(b.przyspiesz(40));

        KontoBankowe a = new KontoBankowe();
        a.saldo = 50000;
        a.wplac(1000);
        System.out.println(a.saldo);
        a.wyplac(6000000);
        

public class House {
    public int area; //powierzchnia domu
    public boolean garage; //czy ma garaż
    public int rooms; // liczba pokoi
    public boolean garden; //czy ma garaz
    public int floors; //liczba pieter

    public double getPrice() {
        return area * 3000;
    }

    
public class Pies {
    public String nazwa;
    public String rasa;
    public int wiek;

    public void dajGlos(){
        System.out.println(nazwa + ": HAU HAU");
    }

    
    public class Samochod {
    public String marka;
    public String model;
    public int predkosc;

    public int przyspiesz(int a) {
        return predkosc + a;
    }

    public int zwolnij(int a) {
        if (predkosc - a < 0)
        {
            return 0;
        }
        return predkosc - a;
    }

        public class KontoBankowe {
    public double saldo;

    public void wplac(double kwota)
    {
        saldo+=kwota;
    }
     public void wyplac(double kwota)
    {
        if (saldo - kwota < 0) {
            System.out.println("Nie można wypłacić danej kwoty");
        }
        else {
            saldo-=kwota;
        }
    }

}

}


}

    
}



    }
}
