package cz.upce.fei.cv09;

public class Kino {
    private String jmeno;
    private final int pocetRad;
    private final int pocetSedadel;
    private final boolean[][] sedadla;

    public Kino(String jmeno, int pocetRad, int pocetSedadel) {
        this.jmeno = jmeno;
        this.pocetRad = pocetRad;
        this.pocetSedadel = pocetSedadel;
        this.sedadla = new boolean[pocetRad][pocetSedadel];
    }

    public boolean rezervujSedadlo(int rada, int sedadlo) {
        if (!jeSedadloVolne(rada, sedadlo)) {
            return false;
        }

        sedadla[rada-1][sedadlo-1] = true;

        return true;
    }

    public boolean jeSedadloVolne(int rada, int sedadlo) {
        if (rada <= 0 || sedadlo <= 0) {
            return false;
        }

        if (rada > pocetRad || sedadlo > pocetSedadel) {
            return false;
        }

        return !sedadla[rada-1][sedadlo-1];
    }

    public void vypisRadySouvislaMista(int pocetSouvislychMist) {
        for (int rada = 1;  rada <= pocetRad; rada++) {
            int sum = 0;
            for (int sedadlo = 1;  sedadlo <= pocetSedadel;  sedadlo++) {
                if (jeSedadloVolne(rada, sedadlo)) {
                    ++sum;
                } else {
                    sum = 0;
                }

                if (sum >= pocetSouvislychMist) {
                    System.out.print(rada + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void vypisSedadla() {
        System.out.println(this);
    }

    public int getPocetRad() {
        return pocetRad;
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.jmeno);

        sb.append("\n  ");

        for (int i = 0; i < pocetSedadel; i++) {
            sb.append((i+1));
            sb.append(" ");
        }

        sb.append("\n");

        for (int rada = 0; rada < pocetRad; rada++) {
            sb.append(rada+1);
            sb.append(" ");
            for (int sedadlo = 0; sedadlo < pocetSedadel; sedadlo++) {
                sb.append(sedadla[rada][sedadlo] ? "X " : "_ ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
