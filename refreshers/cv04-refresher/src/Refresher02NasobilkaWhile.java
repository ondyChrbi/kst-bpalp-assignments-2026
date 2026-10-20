import java.util.Scanner;

public class Refresher02NasobilkaWhile {
    public static void main(String[] args) {
        // Program nacte cislo a vypise jeho nasobilku od 1 do 10.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej cislo: ");
        int cislo = scanner.nextInt();

        int nasobitel = 1;
        while (nasobitel <= 10) {
            System.out.println(cislo + " * " + nasobitel + " = " + (cislo * nasobitel));
            // TODO: Doplnit zvyseni nasobitele o 1 (bez toho se cyklus nikdy neukonci).
        }
    }
}
