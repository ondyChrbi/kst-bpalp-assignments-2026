// Úkol: Výpočet tlaku vody na kohout z vodárenské věže
// Tlak se vypočítá jednoduše: pro každý metr výšky = 0.1 baru
// nebo: tlak (Pa) = výška (m) × 1000
//
// Vizualizace:
//                ╔════╗
//                ║ ░░░║  <- Voda ve věži
//        ╔═══════╣ ░░░║
//        ║ 30m   ║ ░░░║
//        ╚═══════╩════╝
//               /|||\      <- Tlak na kohout

public class Refresher03 {
    public static void main(String[] args) {
        int víškaVMetrech = 30;

        int TlakVPascalech = víškaVMetrech * 1000;
        int tlak_v_barech = víškaVMetrech / 10;

        System.out.println("Výška vodárenské věže: " + víškaVMetrech + " metrů");
        System.out.println("Tlak na kohout v pascalech: " + TlakVPascalech + " Pa");
        System.out.println("Tlak na kohout v barech: " + tlak_v_barech + " bar");
        System.out.println();
        System.out.println("Michalem vypočítaný tlak: " + tlak_v_barech + " bar");
    }
}
