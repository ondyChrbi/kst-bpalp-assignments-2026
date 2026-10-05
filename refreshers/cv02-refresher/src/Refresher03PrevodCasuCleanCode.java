import java.util.Scanner;

public class Refresher03PrevodCasuCleanCode {

    public static void main(String[] args) {
        // TODO: Clean code, vytvorit konstanty
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej pocet vterin: ");
        int pocetVterin = scanner.nextInt();
        System.out.println("Zadany pocet vterin: " + pocetVterin);

        int dnyVteriny = 86400; // 1 den ve vterinach
        System.out.println("1 den = " + dnyVteriny + " vterin");

        int hodinyVteriny = 3600; // 1 hodina ve vterinach
        System.out.println("1 hodina = " + hodinyVteriny + " vterin");

        int minutaVteriny = 60; // 1 minuta ve vterinach
        System.out.println("1 minuta = " + minutaVteriny + " vterin");

        int pocetDnu = pocetVterin / dnyVteriny;
        System.out.println("Dny: " + pocetDnu);

        pocetVterin = pocetVterin % dnyVteriny;
        int pocetHodin = pocetVterin / hodinyVteriny;
        System.out.println("Hodiny: " + pocetHodin);

        pocetVterin = pocetVterin % hodinyVteriny;
        int pocetMinut = pocetVterin / minutaVteriny;
        System.out.println("Minuty: " + pocetMinut);

        pocetVterin = pocetVterin % minutaVteriny;
        System.out.println("Vteriny: " + pocetVterin);
    }
}
