
public class Refresher02Stit {
    // Hraci nabizeji penize za stit a stit ziska ten, kdo nabidl nejvic.
    public static void main(String[] args) {
        int[] nabidky = new int [5];

        // TODO: Uprav hodnotu pole tak ze stit ziska hrac s indexem 2 ktery nabidl 10 000 CZK ve zlate

        int nejvyssiNabidka = nabidky[0];
        int vitez = 0;

        for (int i = 1; i < nabidky.length; i++) { // Projdeme ostatni hrace a hledame nejvyssi nabidku
            System.out.println("Hráč číslo " + (i + 1) + " nabídl: " + nabidky[i]);
            if (nabidky[i] > nejvyssiNabidka) {
                nejvyssiNabidka = nabidky[i];
                vitez = i;
            }
        }

        System.out.println("Nejvyšší nabídnuta suma hradnímu pánovi: " + nejvyssiNabidka);
        System.out.println("Štít získává hráč číslo " + (vitez + 1));
    }
}
