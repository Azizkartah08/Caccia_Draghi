import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("INSERISCI il numero di battiti di ali: ");
        int battiti = inTastiera.nextInt();
        Thread drago1 = new Thread(new Drago(battiti, "Argo"));
        drago1.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("main continua a fare cose...i = " + i);
        }
    }
}