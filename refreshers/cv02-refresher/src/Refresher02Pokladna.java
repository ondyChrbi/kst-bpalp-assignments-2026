public class Refresher02Pokladna {

    public static void main(String[] args) {
        // TODO vyresit chybu, dosly tokeny...
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== POKLADNA - KALKULÁTOR SLEVY ===");
        System.out.println("Zadej cenu zboží (Kč): ");
        double cena = scanner.nextDouble();

        System.out.println("Zadej slevu v procentech (%): ");
        double slevaProcenta = scanner.nextDouble();

        double velikostSlevy = cena * (slevaProcenta / 100);
        double cenaPoSlevě = cena - velikostSlevy;

        System.out.println("\n--- Výpočet ---");
        System.out.println("Původní cena: " + cena + " Kč");
        System.out.println("Sleva (" + slevaProcenta + "%): " + velikostSlevy + " Kč");
        System.out.println("Cena po slevě: " + cenaPoSlevě + " Kč");
    }
}
