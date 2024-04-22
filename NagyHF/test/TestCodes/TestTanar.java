package TestCodes;

import Codes.Tanar;
import java.time.LocalDate;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A tanár osztály metódusainak tesztelése
 * @author kerek
 */
public class TestTanar {
    Tanar t;
    Tanar t2;
    String nev = "Szabó Andi";
    String cim = "Debrecen, Kovács utca 56.";
    LocalDate szulEv = LocalDate.parse("2006-10-20");
    String tantargy = "Angol";
    
    /**
     * Tesztek előkészítéséhez szükséges beállítások
     */
    @Before
    public void setUp() {
        t = new Tanar(nev, cim, szulEv.toString(), tantargy);
    }
    
    /**
     * Konstruktor tesztelése
     */
    @Test
    public void testKonstruktor(){
        t2 = new Tanar(nev, cim, szulEv.toString(), tantargy);
        Assert.assertNotNull(t2);
    }
    
    /**
     * Getterek tesztelése
     */
    @Test
    public void testGetters(){
        Assert.assertEquals(nev, t.getNev());
        Assert.assertEquals(cim, t.getCim());
        Assert.assertEquals(szulEv, t.getSzulEv());
        Assert.assertEquals(tantargy, t.getTargy());
    }
    
    /**
     * Setterek tesztelése
     */
    @Test
    public void testSetters(){
        t.setNev("Sajt");
        Assert.assertNotSame(nev, t.getNev());
        t.setCim("Sajt");
        Assert.assertNotSame(cim, t.getCim());
        t.setSzulEv(LocalDate.parse("2022-03-22"));
        Assert.assertNotSame(szulEv, t.getSzulEv());
        t.setTargy("Sajt");
        Assert.assertNotSame(tantargy, t.getTargy());
    }
}
