package TestjFrames;

import org.junit.Before;
import org.junit.Test;

import jFrames.jMain;
import Codes.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;

/**
 * A jMain metódusainak tesztelése
 * @author GFVHSO
 */
public class TestjMain {
    List<Diak> diakok = new ArrayList<>();
    List<Tanar> tanarok = new ArrayList<>();
    List<Intezmeny> intezmenyek = new ArrayList<>();

    /**
     * Tesztek előkészítéséhez szükséges beállítások
     */
    @Before
    public void setUp() {
        diakok.add(new Diak("Kiss Józsi", "Ecser, Sajtos utca 5.", "2015-02-03", 12345678, "1/A"));
        diakok.add(new Diak("Szabó Andi", "Debrecen, Kovács utca 56.", "2006-10-20", 87654321, "5/D"));
        tanarok.add(new Tanar("Eper Lilla", "Vecsés, Perec köz 77.", "1998-09-22", "Magyar"));
        tanarok.add(new Tanar("Hanusi Béla", "Budaörs, Perec köz 77.", "1998-09-22", "Angol"));
        intezmenyek.add(new Intezmeny("BGSZC Keleti Károly Közgazdasági Technikum", "1106 Budapest, Gyakorló utca 21-23.", "Vasné Botár Ágnes"));
        intezmenyek.add(new Intezmeny("Budapesti Műszaki és Gazdaságtudományi Egyetem", "1111 Budapest, Műegyetem rkp. 3.", "Rektor: Czigány Tibor, Kancellár: Kotán Attila"));
    }
    
    /**
     * Az adatok fájlba mentésének tesztelése
     * @throws IOException 
     */
    @Test
    public void testSave() throws IOException{
        jMain.Save("diakok_test.txt", "tanarok_test.txt", "intezmenyek_test.txt");
        boolean van1 = false;
        boolean van2 = false;
        boolean van3 = false;
        File f = new File(System.getProperty("user.dir"));
        for(File fi : f.listFiles()){
            if(fi.getName().equals("diakok_test.txt"))
                van1 = true;
            if(fi.getName().equals("tanarok_test.txt"))
                van2 = true;
            if(fi.getName().equals("intezmenyek_test.txt"))
                van3 = true;
        }
        Assert.assertTrue(van1);
        Assert.assertTrue(van2);
        Assert.assertTrue(van3);
    }
    
    /**
     * Az adatok fájlból való olvasásának tesztelése
     */
    @Test
    public void testLoad(){
        boolean van1 = false;
        boolean van2 = false;
        
        try{
            jMain.Load("diakok_test.txt", "tanarok_test.txt", "intezmenyek_test.txt");
        }
        catch(Exception ex){
            van1 = true;
        }
        
        try{
            jMain.Load("diakok_tet.txt", "tanarok_test.txt", "intezmenyek_test.txt");
        }
        catch(Exception ex){
            van2 = true;
        }

        Assert.assertFalse(van1);
        Assert.assertTrue(van2);
        
        Assert.assertNotNull(diakok);
        Assert.assertNotNull(tanarok);
        Assert.assertNotNull(intezmenyek);
    }
}
