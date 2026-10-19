package cz.fei.upce.cv01kalkulackakvadr;

public class CV01KalkulackaKvadr {

    public static void main(String[] args) {
        System.out.println("Ahoj Feikari 2026/27");
        
        int a = 2;
        int b = 5;
        int c = 1;
        
        System.out.println("Strana a: " + a);
        System.out.println("Strana b: " + b);
        System.out.println("Strana c: " + c);
        
        int objem = a * b * c;
        System.out.println("Objem: " + objem);
        
        int povrch = 2 * (a*b + b*c + c*a);
        System.out.println("Povrch: " + povrch);
    }
}
