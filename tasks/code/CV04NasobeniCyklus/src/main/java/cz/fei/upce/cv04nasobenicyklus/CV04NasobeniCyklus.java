package cz.upce.fei.cv04nasobenicyklus;

import java.util.Scanner;

public class CV04NasobeniCyklus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej cislo A: ");
        int cisloA = scanner.nextInt(); // Nactu cislo A od uzivatele

        System.out.println("Zadej cislo B: ");
        int cisloB = scanner.nextInt(); // Nactu cislo B od uzivatele

        int vysledek = 0; // Vysledek nasobeni pomoci cyklu

        // Cyklus pro nasobeni
        // Zacni od 1; opakuj cyklus dokud i je mensi nez cisloB; po kazdem opakovani navys i o 1
        for (int i = 0; i < cisloB ; i++) {
            // Kod, ktery se bude opakovat dokud logicka podminka plati
            vysledek = vysledek + cisloA;
        }

        System.out.println(cisloA + " * " + cisloB + " = " + vysledek);
    }
}
