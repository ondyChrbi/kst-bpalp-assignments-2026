public class App {
    public static void main(String[] args) {
        Bydliste prvniBysliste = new Bydliste();
        prvniBysliste.cisloPopisne = 1024;
        prvniBysliste.nazevUlice = "Vodičkova";
        prvniBysliste.postovniSmerovaciCislo = 11000;

        System.out.println(prvniBysliste);
    }
}
