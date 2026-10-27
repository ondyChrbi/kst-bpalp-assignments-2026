import java.util.Scanner;

public class Refresher03CleanCode {
    public static void main(String[] args) {
        final int KONEC_APLIKACE = 0;
        final int ZOBRAZIT_OBSAZENOST = 1;
        final int PRIDANI_ZAKAZNIKU = 2;

        Scanner scanner = new Scanner(System.in);
        int[] chatky = new int[5];

        int volbaUzivatele = -1; // Uzivatel jeste nezvolil svoji moznost proto -1

        // Nekonecna smycka dokud uzivatel bude chtit aplikaci pouzivat
        while (volbaUzivatele != 0) {
            System.out.println("======= Rezervacni system chatek ======");
            // TODO: Odstranit odradkovani pomoci println() ale zachovat funkcionalitu
            System.out.println();
            System.out.println(KONEC_APLIKACE + " = Konec aplikace");
            System.out.println(ZOBRAZIT_OBSAZENOST + " = Zobrazit obsazenost chatek");
            System.out.println(PRIDANI_ZAKAZNIKU + " = Pridani zakazniku");
            System.out.println();

            // TODO: Zadání volby na stejném řádku jako výpis
            System.out.println("Zadej volbu: ");
            volbaUzivatele = scanner.nextInt();

            switch (volbaUzivatele) {
                case ZOBRAZIT_OBSAZENOST:

                    // TODO: Odstranit magicke cislo:
                    for (int i = 0; i < 5; i++) {
                        int obsazenostChatky = chatky[i];
                        System.out.println("Chatka c." + i + " => " + obsazenostChatky);
                    }

                    break;
                case PRIDANI_ZAKAZNIKU:
                    // Pridani obyvatel do chatek
                    System.out.println("Pridani obyvatel do chatky");

                    System.out.println("Zadej chatku: ");
                    int cisloChatky = scanner.nextInt();

                    System.out.println("Zadej pocet zakazniku: ");
                    int pocetZakazniku = scanner.nextInt();

                    chatky[cisloChatky] = pocetZakazniku;
                    break;
                // TODO: Pridat neplatnou volbu
            }
        }
    }
}