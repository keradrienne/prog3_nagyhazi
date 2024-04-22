package TestCodes;

import org.junit.Before;
import org.junit.Test;
import Codes.Diak;
import java.time.LocalDate;
import junit.framework.Assert;

/**
 * A diák osztály metódusainak tesztelése
 * @author GFVHSO
 */
public class TestDiak {
    Diak d;
    Diak d2;
    String nev = "Szabó Andi";
    String cim = "Debrecen, Kovács utca 56.";
    LocalDate szulEv = LocalDate.parse("2006-10-20");
    String osztaly = "5/D";
    int azon = 87654321;
    
    /**
     * Tesztek előkészítéséhez szükséges beállítások
     */
    @Before
    public void setUp() {
        d = new Diak(nev, cim, szulEv.toString(), azon, osztaly);
    }
    
    /**
     * Konstruktor tesztelése
     */
    @Test
    public void testKonstruktor(){
        d2 = new Diak(nev, cim, szulEv.toString(), azon, osztaly);
        Assert.assertNotNull(d2);
    }
    
    /**
     * Getterek tesztelése
     */
    @Test
    public void testGetters(){
        Assert.assertEquals(nev, d.getNev());
        Assert.assertEquals(cim, d.getCim());
        Assert.assertEquals(szulEv, d.getSzulEv());
        Assert.assertEquals(osztaly, d.getOsztaly());
        Assert.assertEquals(azon, d.getAzon());
    }
    
    /**
     * Setterek tesztelése
     */
    @Test
    public void testSetters(){
        d.setNev("Sajt");
        Assert.assertNotSame(nev, d.getNev());
        d.setCim("Sajt");
        Assert.assertNotSame(cim, d.getCim());
        d.setSzulEv(LocalDate.parse("2022-03-22"));
        Assert.assertNotSame(szulEv, d.getSzulEv());
        d.setOsztaly("Sajt");
        Assert.assertNotSame(osztaly, d.getOsztaly());
        d.setAzon(123);
        Assert.assertNotSame(azon, d.getAzon());
    }
}
