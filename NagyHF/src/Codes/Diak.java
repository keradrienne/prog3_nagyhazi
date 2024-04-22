package Codes;

/**
 * Egy diákot reprezentál
 * @author GFVHSO
 */
public class Diak extends Ember {
    /**
     * A diák azonosítója
     */
    private int azon;
    /**
     * A diák osztálya
     */
    private String osztaly;

    /**
     * Egy diák inicializálása
     * @param azon A diák azonosítója
     * @param osztaly A diák osztálya
     * @param nev A diák neve
     * @param cim A diák címe
     * @param szulEv A diák születési dátuma
     */
    public Diak(String nev, String cim, String szulEv, int azon, String osztaly) {
        super(nev, cim, szulEv);
        this.azon = azon;
        this.osztaly = osztaly;
    }

    /**
     * A diák azonosítójának lekérdezése
     * @return A diák azonosítója
     */
    public int getAzon() {
        return azon;
    }

    /**
     * A diák azonosítójának beállítása
     * @param azon A diák azonosítója
     */
    public void setAzon(int azon) {
        this.azon = azon;
    }

    /**
     * A diák osztályának lekérdezése
     * @return A diák osztálya
     */
    public String getOsztaly() {
        return osztaly;
    }

    /**
     * A diák osztályának beállítása
     * @param osztaly A diák osztálya
     */
    public void setOsztaly(String osztaly) {
        this.osztaly = osztaly;
    }
}
