import java.util.Scanner;
import java.util.*;
public class Eingabe {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Berechnung mit Integer Werten");
            System.out.println("Geben Sie die erste Zahl ein: ");
            a = sc.nextInt();

            System.out.println("Geben Sie die zweite Zahl ein: ");
            b = sc.nextInt();

            c = a + b;
            System.out.println("Die Summe der Zahlen beträgt: "+c);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Sie haben einen ungültigen Wert eingegeben.");
        }

        System.out.println("Berechnung mit Double Werten");
        double aa,bb,cc;
        Scanner scc = new Scanner(System.in);

        System.out.println("Geben Sie eine Kommazahl ein: ");
        aa = scc.nextDouble();
        System.out.println("Geben Sie die zweite Kommazahl ein: ");
        bb = scc.nextDouble();

        cc = aa+bb;
        System.out.println("Die Summe der zwei Kommazahlen beträgt: "+cc);

    }
}
