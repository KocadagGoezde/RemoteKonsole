import java.util.Scanner;
import java.util.*;
public class Eingabe {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        a = sc.nextInt();

        System.out.println("Geben Sie die zweite Zahl ein: ");
        b = sc.nextInt();

        try
        {
            c=a+b;
            System.out.println("Die Summe der Zahlen beträgt: "+c);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Sie haben einen ungültigen Wert eingegeben.");
        }
    }
}
