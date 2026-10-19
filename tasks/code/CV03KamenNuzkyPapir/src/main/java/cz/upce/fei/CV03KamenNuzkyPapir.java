package cz.upce.fei;

import java.util.Random;
import java.util.Scanner;

public class CV03KamenNuzkyPapir {
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

        if (volbaUzivatele == KAMEN) { // Uzivatel zadal kamen=1 ?
            if (volbaPC == NUZKY) { // Vybral PC nuzky=2 ?
                System.out.println("Uzivatel vyhral!");
            } else if (volbaPC == PAPIR) { // Vybral PC papir=3 ?
                System.out.println("PC vyhral!");
            } else { // Vybral to same co ja?
                System.out.println("Remiza!");
            }
        }
    }
}