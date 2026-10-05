import java.util.Scanner;

public class Refresher01BankovkyInput {
    public static void main(String[] args) {
        // Program vypočítá kolik získám 5000 CZK (Masaryků) z mého obnosu peněz.
        // TODO Umoznit uzivatelovi vlozit obnos (uzivatelsky vstup)

        System.out.println("Zadejte obnos: ");
        int celkovyObnos = scanner.nextInt();

        int pocetBankovek = celkovyObnos / 5000;
        int kVraceni = celkovyObnos - (pocetBankovek * 5000);

        System.out.println("Pocet bankovek: " + pocetBankovek);
        System.out.println("Vratit: " + kVraceni);
    }
}
