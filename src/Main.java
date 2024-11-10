import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("podaj liczbe ");

        Scanner sc = new Scanner(System.in);

        String tekst = sc.nextLine();
        double liczba = Double.parseDouble(tekst);
        double liczbakwadrat = liczba*liczba;

        System.out.println("kwadrat liczby " + liczba + " to " + liczbakwadrat);

        sc.close();





    }
}