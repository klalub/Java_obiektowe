import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
/*Napisz program, który tworzy listę tablicową 10 liczb całkowitych, a następnie wyświetla
je w konsoli w porządku odwrotnym do wprowadzenia*/
        ArrayList<Integer> listaliczb = new ArrayList<>();

        listaliczb.add(1); //dodawanie do listy tablicowej

        for (int i = 0; i < 9; i++) {
            listaliczb.add(random.nextInt(21)); //randomowe dodawnie liczb do listy tablicowej
        }


//        System.out.println(listaliczb);
//        odwrocArrayList(listaliczb);
//        Collections.reverse(listaliczb);

        /*zadanie2 - Napisz statyczną metodę average, która przyjmuje listę tablicową liczb
        zmiennoprzecinkowych jako argument i zwraca średnią arytmetyczną wszystkich liczb.
        Jeżeli lista tablicowa jest pusta, zwróć 0*/

        ArrayList<Double> zadanie2 = new ArrayList<>();
        for (int i = 0; i<10; i++){
            zadanie2.add(random.nextDouble(11));
        }
//        System.out.println(zadanie2);
//        System.out.println("Srednia " + Average(zadanie2));


        /*zadanie3 - Napisz statyczną metodę countZeros, która przyjmuje listę tablicową liczb całkowitych
        jako argument i zwraca liczbę wystąpień zera w liście tablicowej. Na przykład,
        dla [0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3*/

        ArrayList<Integer> zadanie3 = new ArrayList<>();
        for (int i = 0; i<7; i++){
            zadanie3.add(random.nextInt(11));
        }
        System.out.println(zadanie3);
        System.out.println("Ilosc zer = "+ countZeros(zadanie3));

        /*zadanie4 - Dany jest napis. Używając StringBuilder, napisz program, który usuwa wszystkie powtarzające
        się znaki, pozostawiając tylko pierwsze wystąpienie każdego znaku. Na przykład dla napisu “bananowy”,
        oczekiwany wynik to “banowy”.*/

        String S = "bananowy";
        removeRep(S);
    }


    public static void odwrocArrayList(ArrayList<Integer> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }
    }

    public static double Average(ArrayList<Double> lista) {
        double avg = 0;
        if (lista.isEmpty()) {
            return avg;
        }

        for (int i = 0; i < lista.size(); i++) {
            avg += lista.get(i);
        }
            avg /= lista.size();
        return avg;

    }

    public static int countZeros(ArrayList<Integer> lista)
    {
        int iloscZer = 0;
        for (int i = 0; i<lista.size(); i++)
        {
            if(lista.get(i).equals(0)) {
                iloscZer++;
            }
        }
        return iloscZer;
    }

    public static void removeRep(String s){
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> usedLetters = new ArrayList<Character>();
        for (int i = 0; i<s.length(); i++)
        {
            char currentLetter = string.charAt(i);
            if (!usedLetters.contains(currentLetter)){
                sb.append(currentLetter);
                usedLetters.add(currentLetter);
            }
        }
        System.out.println(sb.toString());
    }


}
