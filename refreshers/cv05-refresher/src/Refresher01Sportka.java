import java.util.Random;

public class Refresher01Sportka {
    // Program pro sazkovou kancelar. Vygeneruje náhodná čísla 1–49 do pole a vypíše je jako tah sportky.
    public static void main(String[] args) {
        Random generator = new Random();

        // TODO: Inicializuj pole cisla tak, aby mělo 5 prvků.
        int[] cisla;

        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = generator.nextInt(49) + 1;
        }

        System.out.print("A stastnym vyhercem se stava: ");
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i] + " ");
        }

        System.out.println();
    }
}
