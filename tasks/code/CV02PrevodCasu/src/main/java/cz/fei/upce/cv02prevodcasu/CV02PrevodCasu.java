package cz.fei.upce.cv02prevodcasu;

import java.util.Scanner;

public class CV02PrevodCasu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej pocet vterin: ");
        int pocetVterin = scanner.nextInt();
        System.out.println("Zadany pocet vterin: " + pocetVterin);

        int dnyVteriny = 24 * 60 * 60; // 1 den ve vterinach
        System.out.println("1 den = " + dnyVteriny + " vterin");

        int hodinyVteriny = 60 * 60; // 1 hodina ve vterinach
        System.out.println("1 hodina = " + hodinyVteriny + " vterin");

        int minutaVteriny = 60; // 1 minuta ve vterinach
        System.out.println("1 minuta = " + minutaVteriny + " vterin");

        int pocetDnu = pocetVterin / dnyVteriny;
        System.out.println("Dny: " + pocetDnu);

        pocetVterin = pocetVterin % dnyVteriny; // Ziskam zbytek po odecteni dnu
        int pocetHodin = pocetVterin / hodinyVteriny;
        System.out.println("Hodiny: " + pocetHodin);

        pocetVterin = pocetVterin % hodinyVteriny; // Ziskam zbytek po odecteni hodin
        int pocetMinut = pocetVterin / minutaVteriny;
        System.out.println("Minuty: " + pocetMinut);

        pocetVterin = pocetVterin % minutaVteriny; // Ziskam zbytek po odecteni minut
        System.out.println("Vteriny: " + pocetVterin);
    }
}
