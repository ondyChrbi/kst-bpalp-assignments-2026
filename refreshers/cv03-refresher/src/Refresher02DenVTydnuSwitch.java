import java.util.Scanner;

public class Refresher02DenVTydnuSwitch {
    public static void main(String[] args) {
        // Program nacte cislo dne v tydnu (1 = pondeli ... 7 = nedele)
        // a vypise jeho nazev.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej cislo dne v tydnu (1-7): ");
        int cisloDne = scanner.nextInt();

        // TODO: Doplnit vikend (6 = sobota, 7 = nedele)

        switch (cisloDne) {
            case 1:
                System.out.println("Pondeli");
                break;
            case 2:
                System.out.println("Utery");
                break;
            case 3:
                System.out.println("Streda");
                break;
            case 4:
                System.out.println("Ctvrtek");
                break;
            case 5:
                System.out.println("Patek");
                break;
        }
    }
}
