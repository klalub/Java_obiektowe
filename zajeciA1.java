import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*Napisz program, który wczytuje ze standardowego wejścia cztery liczby wymierne,
     a następnie wypisuje ich sumę na standardowym wyjściu.
 */
    static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę wymierną: ");
        double liczba1 = scanner.nextDouble();
        System.out.println("podaj drugą liczbę wymierną: ");
        double liczba2 = scanner.nextDouble();
        System.out.println("podaj trzecią liczbę wymierną: ");
        double liczba3 = scanner.nextDouble();
        System.out.println("podaj czwartą liczbę wymierną: ");
        double liczba4 = scanner.nextDouble();

        System.out.println("Liczby to: " + (liczba1 + liczba2 + liczba3 + liczba4));
    }

    /*Napisz program, który przyjmuje trzy liczby całkowite jako argumenty i zwraca największą z nich.
    Zastosuj instrukcje warunkowe do porównania liczb.*/
    static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.println("podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();
        System.out.println("podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();

        int max = liczba1;
        if (liczba1 <= liczba2)
            max = liczba2;
        if (liczba2 <= liczba3)
            max = liczba3;

        System.out.println("liczba max to" + max);
    }

    /*Napisz program, który na podstawie podanego jako argument numeru dnia tygodnia (od 1 do 7)
    wypisze nazwę tego dnia tygodnia. Dla przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać
    “Poniedziałek”. Jeżeli podana liczba nie jest z zakresu od 1 do 7, program powinien wyświetlić komunikat
    “Niepoprawny numer dnia tygodnia”.*/
    static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę dnia tygodnia: ");
        int liczba = scanner.nextInt();

        if (liczba == 1)
            System.out.println("Poniedziałek");
        else if (liczba == 2)
            System.out.println("Wtorek");
        else if (liczba == 3)
            System.out.println("Środa");
        else if (liczba == 4)
            System.out.println("Czwartek");
        else if (liczba == 5)
            System.out.println("Piątek");
        else if (liczba == 6)
            System.out.println("Sobota");
        else if (liczba == 7)
            System.out.println("Niedziela");
        else
            System.out.println("Nie ma takiego dnia tygodnia");
    }

    /*Napisz program, który będzie sprawdzał, czy podany rok jest rokiem przestępnym. Rok jest przestępny,
    jeśli jest podzielny przez 4, ale nie jest podzielny przez 100, chyba że jest podzielny przez 400*/
    static void zadanie4() {
        System.out.println("podaj rok: ");
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();

        if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0)
            System.out.println("rok jest przestępny");
        else
            System.out.println("Rok nie jest przestępny");
    }

    /*Napisz program, który oblicza sumę cyfr dowolnej wprowadzonej liczby.
    Program powinien akceptować liczbę jako input od użytkownika.*/
    static void zadanie5()
    {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int sum = 0;

        while (liczba != 0)
        {
            sum += liczba%10;
            liczba = liczba / 10;

        }
        System.out.println("suma cyfr z liczby to: " + sum);
    }

    /*Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych,
    a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia.*/


    /*Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n.
    Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n,
    gdzie każdy poziom piramidy składa się z podanego znaku.*/
    static void zadanie10()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak");
        String znak = scanner.next();
        System.out.println("Podaj wysokosc choinki");
        int wysokosc = scanner.nextInt();
        for (int i = 0; i<wysokosc; i++){
            StringBuilder sb = new StringBuilder();
            int liczbaspacji = wysokosc - i - 1;
            int liczbaznakow = 2*i +1;
            while (liczbaspacji-- >0)
                sb.append(' ');
            while (liczbaznakow-- >0)
                sb.append(znak);
            System.out.println(sb.toString());
        }
    }

    static void zadanie11() {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while (liczba != 0) {
            sb.append(liczba % 10);
            liczba = liczba / 10;
        }
        System.out.println(sb.toString());
    }
    //lub
    static void zadanie11b(){
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int reverse = 0;
        while (liczba!=0)
        {
            reverse = reverse*10 + liczba%10;
            liczba /= 10;
        }
        System.out.println(reverse );
    }


    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie10();
        zadanie11b();

    }



}
