package TestCodes;

import Codes.Intezmeny;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Az intézmény osztály metódusainak tesztelése
 * @author GFVHSO
 */
public class TestIntezmeny {
    Intezmeny i;
    Intezmeny i2;
    String nev = "Szabó Andi";
    String cim = "Debrecen, Kovács utca 56.";
    String intezmenyvezeto = "Igazgató";
    
    /**
     * Tesztek előkészítéséhez szükséges beállítások
     */
    @Before
    public void setUp() {
        i = new Intezmeny(nev, cim, intezmenyvezeto);
    }
    
    /**
     * Konstruktor tesztelése
     */
    @Test
    public void testKonstruktor(){
        i2 = new Intezmeny(nev, cim, intezmenyvezeto);
        Assert.assertNotNull(i2);
    }
    
    /**
     * Getterek tesztelése
     */
    @Test
    public void testGetters(){
        Assert.assertEquals(nev, i.getNev());
        Assert.assertEquals(cim, i.getCim());
        Assert.assertEquals(intezmenyvezeto, i.getIntezmenyVezeto());
    }
    
    /**
     * Setterek tesztelése
     */
    @Test
    public void testSetters(){
        i.setNev("Sajt");
        Assert.assertNotSame(nev, i.getNev());
        i.setCim("Sajt");
        Assert.assertNotSame(cim, i.getCim());
        i.setIntezmenyVezeto("Sajt");
        Assert.assertNotSame(intezmenyvezeto, i.getIntezmenyVezeto());
    }
}
