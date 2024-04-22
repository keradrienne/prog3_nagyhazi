package Codes;

/**
 * Egy tanárt reprezentál
 * @author GFVHSO
 */
public class Tanar extends Ember {
    /**
     * Tanított tantárgy
     */
    String targy;

    /**
     * Egy tanár inicializálása
     * @param targy Tanított tantárgy
     * @param nev A tanár neve
     * @param cim A tanár címe
     * @param szulEv A tanár születési dátuma
     */
    public Tanar(String nev, String cim, String szulEv, String targy) {
        super(nev, cim, szulEv);
        this.targy = targy;
    }

    /**
     * A tanár által tanított tárgy lekérdezése
     * @return Tanított tantárgy
     */
    public String getTargy() {
        return targy;
    }

    /**
     * A tanár által tanított tárgy beállítása
     * @param targy Tanított tantárgy
     */
    public void setTargy(String targy) {
        this.targy = targy;
    }
    
    
}
