package cz.upce.fei.cv09;

public class CV09 {
    public static void main(String[] args) {
        Kino feiCinema = new Kino("Fei cinema", 2, 6);

        // Validni vstupy
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 2));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 5));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(2, 3));

        // Nevalidni vstupy
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(3, 5));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 12));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(-3, 5));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, -12));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(0, 5));
        System.out.println("Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 0));

        feiCinema.vypisSedadla();
        System.out.print("Rady ktere obsahuji 3 mista vedle sebe: ");
        feiCinema.vypisRadySouvislaMista(3);
    }
}