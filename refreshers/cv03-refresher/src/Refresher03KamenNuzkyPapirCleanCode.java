import java.util.Random;
import java.util.Scanner;

public class Refresher03KamenNuzkyPapirCleanCode {
    public static void main(String[] args) {
        final int KAMEN = 1;
        final int NUZKY = 2;
        final int PAPIR = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 = KAMEN");
        System.out.println("2 = NUZKY");
        System.out.println("3 = PAPIR");
        System.out.println("Zadej svoji volbu:");
        int volbaUzivatele = scanner.nextInt();

        Random generatorCisel = new Random();
        int volbaPC = generatorCisel.nextInt(1, 4);
        System.out.println("Volba PC: " + volbaPC);

        // Remiza
        if (volbaUzivatele == volbaPC) {
            System.out.println("Remiza");
        // TODO: Vyhra uzivatele pri vsech kombinacich
        } if ((volbaUzivatele == KAMEN && volbaPC == NUZKY) || (volbaUzivatele == NUZKY && volbaPC == PAPIR)) {
            System.out.printf("Vyhra");
        // Cokoliv jineho: Prohra
        } else {
            System.out.printf("Prohra");
        }
    }
}