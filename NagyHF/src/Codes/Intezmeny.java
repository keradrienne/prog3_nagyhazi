package Codes;

import java.io.Serializable;

/**
 * Egy intézmény alapadatait reprezentálja
 * @author GFVHSO
 */
public class Intezmeny implements Serializable {
    /**
     * Az intézmény neve
     */
    private String nev;
    /**
     * Az intézmény címe
     */
    private String cim;
    /**
     * Az intézményvezető neve
     */
    private String intezmenyVezeto;
    
    /**
     * Egy intézmény inicializálása
     * @param nev Az intézmény neve
     * @param cim Az intézmény címe
     * @param intezmenyVezeto Az intézményvezető neve
     */
    public Intezmeny(String nev, String cim, String intezmenyVezeto) {
        this.nev = nev;
        this.cim = cim;
        this.intezmenyVezeto = intezmenyVezeto;
    }

    /**
     * Az intérmény nevének lekérdezése
     * @return Az intézmény neve
     */
    public String getNev() {
        return nev;
    }

    /**
     * Az intézmény nevének beállítása
     * @param nev Az intézmény neve
     */
    public void setNev(String nev) {
        this.nev = nev;
    }

    /**
     * Az intézmény címének lekérdezése
     * @return Az intézmény címe
     */
    public String getCim() {
        return cim;
    }

    /**
     * Az intézémény címének beállítása
     * @param cim Az intézmény címe
     */
    public void setCim(String cim) {
        this.cim = cim;
    }

    /**
     * Az intézmény vezető nevének lekérdezése
     * @return Az intézmény vezetője
     */
    public String getIntezmenyVezeto() {
        return intezmenyVezeto;
    }

    /**
     * Az intézmény vezető nevének beállítása
     * @param intezmenyVezeto Az intézmény vezetője
     */
    public void setIntezmenyVezeto(String intezmenyVezeto) {
        this.intezmenyVezeto = intezmenyVezeto;
    }
}
