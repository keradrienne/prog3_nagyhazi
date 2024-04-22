package jFrames;

import java.time.LocalDate;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

import Codes.*;


/**
 * jUj ablak
 * @author GFVHSO
 */
public class jUj extends javax.swing.JFrame {

    /**
     * Creates new form jUj
     */
    public jUj() {
        initComponents();
        
        cbInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCim = new javax.swing.JTextField();
        tfTantargy = new javax.swing.JTextField();
        tfIntVez = new javax.swing.JTextField();
        lblIntVez = new javax.swing.JLabel();
        btnMegse = new javax.swing.JButton();
        btnUj = new javax.swing.JButton();
        lblDatum = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        lblOsztaly = new javax.swing.JLabel();
        lblAzon = new javax.swing.JLabel();
        tfOsztaly = new javax.swing.JTextField();
        tfAzon = new javax.swing.JTextField();
        lblTantargy = new javax.swing.JLabel();
        lblNev = new javax.swing.JLabel();
        lblCim = new javax.swing.JLabel();
        tfNev = new javax.swing.JTextField();
        cbSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Új bejegyzés");

        tfCim.setEnabled(false);

        tfTantargy.setEnabled(false);

        tfIntVez.setEnabled(false);

        lblIntVez.setText("Intézményvezető:");

        btnMegse.setText("Mégse");
        btnMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegseActionPerformed(evt);
            }
        });

        btnUj.setText("Mentés");
        btnUj.setEnabled(false);
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        lblDatum.setText("Dátum:");

        tfDatum.setEnabled(false);

        lblOsztaly.setText("Osztály:");

        lblAzon.setText("Azonosító:");

        tfOsztaly.setEnabled(false);

        tfAzon.setEnabled(false);

        lblTantargy.setText("Tantárgy:");

        lblNev.setText("Név:");

        lblCim.setText("Cím:");

        tfNev.setEnabled(false);

        cbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanár", "Diák", "Intézmény" }));
        cbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCim)
                    .addComponent(tfNev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMegse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(tfAzon)
                    .addComponent(tfOsztaly, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTantargy, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfIntVez, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNev)
                            .addComponent(lblCim)
                            .addComponent(lblDatum)
                            .addComponent(lblOsztaly)
                            .addComponent(lblAzon)
                            .addComponent(lblTantargy)
                            .addComponent(lblIntVez))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOsztaly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOsztaly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAzon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTantargy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTantargy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIntVez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIntVez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnUj, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A gombra kattintva a és megerősítés esetén a módosítások nem lépnek érvénybe
     * @param evt 
     */
    private void btnMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegseActionPerformed
        JOptionPane opt = new JOptionPane("Biztos, hogy elveti az adatokat?",
            JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        JDialog jd = opt.createDialog(opt, "Mégse");
        jd.setVisible(true);

        if(opt.getValue().toString().equals("0")){
            this.dispose();
        }
    }//GEN-LAST:event_btnMegseActionPerformed

    /**
     * A gomb megnyomásokar és megerősítéskor az adatok mentésre kerülnek
     * @param evt 
     */
    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed
        JOptionPane opt = new JOptionPane("Biztos, hogy rögzíti az új adatokat?",
            JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        JDialog jd = opt.createDialog(opt, "Új bejegyzés");
        jd.setVisible(true);

        LocalDate datum = null;
        boolean ok = true;

        if(opt.getValue().toString().equals("0")){
            switch (cbSelect.getSelectedIndex()) {
                case 1 -> {
                    if(tfNev.getText().equals("")){ //Ha üres a név mezője
                        JOptionPane.showMessageDialog(null, "Írja be a tanár nevét!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfCim.getText().equals("")){ //Ha üres a cím mezője
                        JOptionPane.showMessageDialog(null, "Írja be a tanár címét!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfDatum.getText().equals("")){ //Ha üres a dátum mezője
                        JOptionPane.showMessageDialog(null, "Írja be a tanár születési dátumát!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(!tfDatum.getText().equals("")){ //Ha nem megfelelő a dátum formátuma
                        try{
                            datum = LocalDate.parse(tfDatum.getText());
                        }
                        catch(Exception ex){
                            JOptionPane.showMessageDialog(null, "Nem megfelelő formátum!\nHelyes formátum: ÉÉÉÉ-HH-NN", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                            ok = false;
                        }
                    }
                    if(tfTantargy.getText().equals("") && datum != null){ //Ha üres a tantárgy mezője
                        JOptionPane.showMessageDialog(null, "Írja be a tanár tanított tárgyát!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(ok == true){ //Ha minden mező helyes
                        Tanar t = new Tanar(tfNev.getText(), tfCim.getText(), tfDatum.getText(), tfTantargy.getText());
                        jMain.tanarok.add(t);
                        JOptionPane.showMessageDialog(null, "Sikeres rögzítés!", "Új bejegyzés", JOptionPane.INFORMATION_MESSAGE);
                        jMain.cbInit();
                        this.dispose();
                    }
                }
                case 2 -> {
                    int azon = 0;
                    if(tfNev.getText().equals("")){ //Ha üres a név mezője
                        JOptionPane.showMessageDialog(null, "Írja be a diák nevét!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfCim.getText().equals("")){ //Ha üres a cím mezője
                        JOptionPane.showMessageDialog(null, "Írja be a diák címét!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfDatum.getText().equals("")){ //Ha üres a dátum mezője
                        JOptionPane.showMessageDialog(null, "Írja be a diák születési dátumát!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(!tfDatum.getText().equals("")){ //Ha nem megfelelő a dátum formátuma
                        try{
                            datum = LocalDate.parse(tfDatum.getText());
                        }
                        catch(Exception ex){
                            JOptionPane.showMessageDialog(null, "Nem megfelelő formátum!\nHelyes formátum: ÉÉÉÉ-HH-NN", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                            ok = false;
                        }
                    }
                    if(tfOsztaly.getText().equals("") && datum != null){ //Ha üres az osztály mezője
                        JOptionPane.showMessageDialog(null, "Írja be a diák osztályát!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfAzon.getText().equals("") || tfAzon.getText().length() != 8){ //Ha üres az azonosító mezője vagy nem megfelelő hosszúságú
                        JOptionPane.showMessageDialog(null, "Írja be a diák azonosítóját!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(!tfAzon.getText().equals("")){ //Ha nem szám formátumú az azonosító mezőjébe írt adat
                        try{
                            azon = Integer.parseInt(tfAzon.getText());
                        }
                        catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null, "Nem megfelelő formátum!\nHelyes formátum: 8 számjegyű számsor", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                            ok = false;
                        }
                    }
                    if(ok == true){ //Ha minden mező megfelelő
                        Diak d = new Diak(tfNev.getText(), tfCim.getText(), tfDatum.getText(), azon, tfOsztaly.getText());
                        jMain.diakok.add(d);
                        JOptionPane.showMessageDialog(null, "Sikeres rögzítés!", "Új bejegyzés", JOptionPane.INFORMATION_MESSAGE);
                        jMain.cbInit();
                        this.dispose();
                    }
                }
                case 3 -> {
                    if(tfNev.getText().equals("")){ //Ha üres a név mezője
                        JOptionPane.showMessageDialog(null, "Írja be az intézmény nevét!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfCim.getText().equals("")){ //Ha üres a cím mezője
                        JOptionPane.showMessageDialog(null, "Írja be az intézmény címét!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(tfIntVez.getText().equals("")){ //Ha üres az intézmény vezető nevének a mezője
                        JOptionPane.showMessageDialog(null, "Írja be az intézmény vezetőjének/vezetőinek nevét/neveit!", "Nem megfelelő bemenet", JOptionPane.INFORMATION_MESSAGE);
                        ok = false;
                    }
                    else if(ok == true){ //Ha minden mező megfelelő
                        Intezmeny i = new Intezmeny(tfNev.getText(), tfCim.getText(), tfIntVez.getText());
                        jMain.intezmenyek.add(i);
                        JOptionPane.showMessageDialog(null, "Sikeres rögzítés!", "Új bejegyzés", JOptionPane.INFORMATION_MESSAGE);
                        jMain.cbInit();
                        this.dispose();
                    }
                }
                default -> {
                }
            }
        }
    }//GEN-LAST:event_btnUjActionPerformed

    /**
     * Kategória kiválasztása az adat fajtájának beazonosítására
     * @param evt 
     */
    private void cbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectActionPerformed
        switch (cbSelect.getSelectedItem().toString()) {
            case "Tanár" -> {
                tfNev.setEnabled(true);
                tfCim.setEnabled(true);
                tfDatum.setEnabled(true);
                tfOsztaly.setEnabled(false);
                tfAzon.setEnabled(false);
                tfTantargy.setEnabled(true);
                tfIntVez.setEnabled(false);
                btnUj.setEnabled(true);
            }
            case "Diák" -> {
                tfNev.setEnabled(true);
                tfCim.setEnabled(true);
                tfDatum.setEnabled(true);
                tfOsztaly.setEnabled(true);
                tfAzon.setEnabled(true);
                tfTantargy.setEnabled(false);
                tfIntVez.setEnabled(false);
                btnUj.setEnabled(true);
            }
            case "Intézmény" -> {
                tfNev.setEnabled(true);
                tfCim.setEnabled(true);
                tfDatum.setEnabled(false);
                tfOsztaly.setEnabled(false);
                tfAzon.setEnabled(false);
                tfTantargy.setEnabled(false);
                tfIntVez.setEnabled(true);
                btnUj.setEnabled(true);
            }
            default -> {}
        }
    }//GEN-LAST:event_cbSelectActionPerformed

    /**
     * Main függvény
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jUj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jUj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jUj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jUj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jUj().setVisible(true);
            }
        });
    }
    
    /**
     * Betölti az adatokat a lenyíló menübe, amiből ki lehet választani a megjelenítendő adatok fajtáját
     */
    public void cbInit(){
        String NOT_SELECTABLE_OPTION = " - Kérem válasszon! - ";
        cbSelect.setModel(
            new DefaultComboBoxModel<String>() {
                boolean selectionAllowed = true;

                @Override
                public void setSelectedItem(Object anObject) {
                    if (!NOT_SELECTABLE_OPTION.equals(anObject)) {
                        super.setSelectedItem(anObject);
                    } else if (selectionAllowed) {
                        selectionAllowed = false;
                        super.setSelectedItem(anObject);
                    }
                }
            }
        );

        cbSelect.addItem(NOT_SELECTABLE_OPTION);
        cbSelect.addItem("Tanár");
        cbSelect.addItem("Diák");
        cbSelect.addItem("Intézmény");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegse;
    private javax.swing.JButton btnUj;
    private javax.swing.JComboBox<String> cbSelect;
    private javax.swing.JLabel lblAzon;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblIntVez;
    private javax.swing.JLabel lblNev;
    private javax.swing.JLabel lblOsztaly;
    private javax.swing.JLabel lblTantargy;
    private javax.swing.JTextField tfAzon;
    private javax.swing.JTextField tfCim;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfIntVez;
    private javax.swing.JTextField tfNev;
    private javax.swing.JTextField tfOsztaly;
    private javax.swing.JTextField tfTantargy;
    // End of variables declaration//GEN-END:variables
}