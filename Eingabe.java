import java.util.Scanner;
public class Eingabe {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        a = sc.nextInt();

        System.out.println("Geben Sie die zweite Zahl ein: ");
        b = sc.nextInt();
    }
}
