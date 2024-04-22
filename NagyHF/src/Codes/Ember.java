package Codes;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Egy személy alapadatait reprezentálja
 * @author GFVHSO
 */
public abstract class Ember implements Serializable {
    /**
     * A személy neve
     */
    private String nev;
    /**
     * A személy címe
     */
    private String cim;
    /**
     * A személy születési éve
     */
    private LocalDate szulEv;

    /**
     * Egy személy inicializálása
     * @param nev A személy neve
     * @param cim A személy címe
     * @param szulEv A személy születési éve
     */
    public Ember(String nev, String cim, String szulEv) throws DateTimeParseException  {
        this.nev = nev;
        this.cim = cim;
        this.szulEv = LocalDate.parse(szulEv);
    }

    /**
     * A szenély nevének lekérdezése
     * @return A személy neve
     */
    public String getNev() {
        return nev;
    }

    /**
     * A személy nevének beállítása
     * @param nev Személy neve
     */
    public void setNev(String nev) {
        this.nev = nev;
    }

    /**
     * A személy címének lekérdezése
     * @return A személy címe
     */
    public String getCim() {
        return cim;
    }

    /**
     * A személy címánek beállítása
     * @param cim A személy címe
     */
    public void setCim(String cim) {
        this.cim = cim;
    }

    /**
     * A személy születési dátumának lekérdezése
     * @return A személy születési dátuma
     */
    public LocalDate getSzulEv() {
        return szulEv;
    }

    /**
     * A sezmély születési dátumának beállítása
     * @param szulEv A személy születési dátuma
     */
    public void setSzulEv(LocalDate szulEv) {
        this.szulEv = szulEv;
    }
    
    
}
