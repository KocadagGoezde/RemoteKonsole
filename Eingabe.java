import java.util.Scanner;
import java.util.*;

public class Eingabe {

    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);    //Scanner für die Benutzereingabe

        try     //Anfang vom Try Block
        {
            System.out.println("Berechnung mit Integer Werten");
            System.out.println("Geben Sie die erste Zahl ein: ");
            a = sc.nextInt();               //Einlesen des ersten Int Wertes

            System.out.println("Geben Sie die zweite Zahl ein: ");
            b = sc.nextInt();               //Einlesen des zweiten Int Wertes

            c = a + b;
            System.out.println("Die Summe der Zahlen beträgt: "+c); //Ausgabe der Summe
        }
        catch (InputMismatchException e) //Anfang vom Catch Block
        {
            System.out.println("Sie haben einen ungültigen Wert eingegeben."); //Ausgabe bei Error
        }

        System.out.println("Berechnung mit Double Werten");
        double aa,bb,cc;

        Scanner scc = new Scanner(System.in);   //Zweiter Scanner für die Eingabe

        System.out.println("Geben Sie eine Kommazahl ein: ");
        aa = scc.nextDouble();                          //Einlesen des ersten Double Wertes

        System.out.println("Geben Sie die zweite Kommazahl ein: ");
        bb = scc.nextDouble();                          //Einlesen des zweiten Double Wertes

        cc = aa+bb;
        System.out.println("Die Summe der zwei Kommazahlen beträgt: "+cc);          //Ausgabe der Summe

    }
}
