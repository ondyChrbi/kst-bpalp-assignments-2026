import java.util.Scanner;

public class Refresher01FeiTaxiPlus {
    public static void main(String[] args) {
        // Program nacte cenu jizdy a zjisti, zda ma uzivatel predplatne Fei Taxi Plus (Y/N).
        // Predplatitelum Fei Taxi Plus se od ceny jizdy odecita sleva 10 %.
        final double SLEVA_FEI_TAXI_PLUS = 0.10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FEI TAXI ===");
        System.out.println("Zadej cenu jizdy (CZK): ");
        double cenaJizdy = scanner.nextDouble();

        System.out.println("Vlastnis predplatne Fei Taxi Plus? (Y/N): ");
        boolean maPredplatne = scanner.next().charAt(0) == 'Y';

        // TODO: Uprav program tak, aby se odecetla pouze uzivateli, ktery predplatne
        double sleva = cenaJizdy * SLEVA_FEI_TAXI_PLUS;
        double cenaKUhrade = cenaJizdy - sleva;

        System.out.println("\n--- Vypocet ---");
        System.out.printf("Cena jizdy: %.2f CZK%n", cenaJizdy);
        System.out.printf("Sleva: %.2f CZK%n", sleva);
        System.out.printf("K uhrade: %.2f CZK%n", cenaKUhrade);
    }
}
