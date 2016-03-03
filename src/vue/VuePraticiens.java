/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vues;

import controleur.CtrlAbstrait;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class VuePraticiens extends VueAbstraite {

    /**
     * Creates new form praticiens
     */
    public VuePraticiens(CtrlAbstrait ctrl) {
        super(ctrl);
        initComponents();
        this.setLocation(500, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelcoeff = new javax.swing.JLabel();
        jComboBoxlieu = new javax.swing.JComboBox();
        jLabelville = new javax.swing.JLabel();
        jComboBoxsearch = new javax.swing.JComboBox();
        jLabellieu = new javax.swing.JLabel();
        jButtonfermer = new javax.swing.JButton();
        jLabelprenom = new javax.swing.JLabel();
        jTextFieldville = new javax.swing.JTextField();
        jButtonok = new javax.swing.JButton();
        jLabeladresse = new javax.swing.JLabel();
        jButtonprec = new javax.swing.JButton();
        jTextFieldnom = new javax.swing.JTextField();
        jLabelsearch = new javax.swing.JLabel();
        jButtonsuiv = new javax.swing.JButton();
        jTextFieldprenom = new javax.swing.JTextField();
        jLabelnom = new javax.swing.JLabel();
        jTextFieldadresse = new javax.swing.JTextField();
        jTextFieldcdp = new javax.swing.JTextField();
        jLabeltitre = new javax.swing.JLabel();
        jTextFieldcoeff = new javax.swing.JTextField();
        jLabelnum = new javax.swing.JLabel();
        jTextFieldnum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelcoeff.setText("COEFF. NOTORIETE");

        jComboBoxlieu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelville.setText("VILLE");

        jComboBoxsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabellieu.setText("LIEU D'EXERCICE");

        jButtonfermer.setText("Fermer");

        jLabelprenom.setText("PRENOM");

        jButtonok.setText("OK");

        jLabeladresse.setText("ADRESSE");

        jButtonprec.setText("Précédent");

        jLabelsearch.setText("Chercher");

        jButtonsuiv.setText("Suivant");

        jLabelnom.setText("NOM");

        jLabeltitre.setText("PRATICIENS");

        jLabelnum.setText("NUMERO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelsearch)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonok))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelnom)
                                            .addComponent(jLabelprenom)
                                            .addComponent(jLabeladresse)
                                            .addComponent(jLabelville)
                                            .addComponent(jLabelcoeff)
                                            .addComponent(jLabellieu))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldcoeff, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextFieldnum, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldadresse, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldprenom, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldnom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldcdp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldville, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 69, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButtonprec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonsuiv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonfermer))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabeltitre))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelnum)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabeltitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsearch)
                    .addComponent(jComboBoxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnum)
                    .addComponent(jTextFieldnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnom)
                    .addComponent(jTextFieldnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprenom)
                    .addComponent(jTextFieldprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeladresse)
                    .addComponent(jTextFieldadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelville)
                    .addComponent(jTextFieldcdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcoeff)
                    .addComponent(jTextFieldcoeff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellieu)
                    .addComponent(jComboBoxlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonprec)
                    .addComponent(jButtonsuiv)
                    .addComponent(jButtonfermer))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonfermer;
    private javax.swing.JButton jButtonok;
    private javax.swing.JButton jButtonprec;
    private javax.swing.JButton jButtonsuiv;
    private javax.swing.JComboBox jComboBoxlieu;
    private javax.swing.JComboBox jComboBoxsearch;
    private javax.swing.JLabel jLabeladresse;
    private javax.swing.JLabel jLabelcoeff;
    private javax.swing.JLabel jLabellieu;
    private javax.swing.JLabel jLabelnom;
    private javax.swing.JLabel jLabelnum;
    private javax.swing.JLabel jLabelprenom;
    private javax.swing.JLabel jLabelsearch;
    private javax.swing.JLabel jLabeltitre;
    private javax.swing.JLabel jLabelville;
    private javax.swing.JTextField jTextFieldadresse;
    private javax.swing.JTextField jTextFieldcdp;
    private javax.swing.JTextField jTextFieldcoeff;
    private javax.swing.JTextField jTextFieldnom;
    private javax.swing.JTextField jTextFieldnum;
    private javax.swing.JTextField jTextFieldprenom;
    private javax.swing.JTextField jTextFieldville;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonfermer() {
        return jButtonfermer;
    }

    public void setjButtonfermer(JButton jButtonfermer) {
        this.jButtonfermer = jButtonfermer;
    }

    public JButton getjButtonok() {
        return jButtonok;
    }

    public void setjButtonok(JButton jButtonok) {
        this.jButtonok = jButtonok;
    }

    public JButton getjButtonprec() {
        return jButtonprec;
    }

    public void setjButtonprec(JButton jButtonprec) {
        this.jButtonprec = jButtonprec;
    }

    public JButton getjButtonsuiv() {
        return jButtonsuiv;
    }

    public void setjButtonsuiv(JButton jButtonsuiv) {
        this.jButtonsuiv = jButtonsuiv;
    }

    public JComboBox getjComboBoxlieu() {
        return jComboBoxlieu;
    }

    public void setjComboBoxlieu(JComboBox jComboBoxlieu) {
        this.jComboBoxlieu = jComboBoxlieu;
    }

    public JComboBox getjComboBoxsearch() {
        return jComboBoxsearch;
    }

    public void setjComboBoxsearch(JComboBox jComboBoxsearch) {
        this.jComboBoxsearch = jComboBoxsearch;
    }

    public JLabel getjLabeladresse() {
        return jLabeladresse;
    }

    public void setjLabeladresse(JLabel jLabeladresse) {
        this.jLabeladresse = jLabeladresse;
    }

    public JTextField getjTextFieldadresse() {
        return jTextFieldadresse;
    }

    public void setjTextFieldadresse(JTextField jTextFieldadresse) {
        this.jTextFieldadresse = jTextFieldadresse;
    }

    public JTextField getjTextFieldcdp() {
        return jTextFieldcdp;
    }

    public void setjTextFieldcdp(JTextField jTextFieldcdp) {
        this.jTextFieldcdp = jTextFieldcdp;
    }

    public JTextField getjTextFieldcoeff() {
        return jTextFieldcoeff;
    }

    public void setjTextFieldcoeff(JTextField jTextFieldcoeff) {
        this.jTextFieldcoeff = jTextFieldcoeff;
    }

    public JTextField getjTextFieldnom() {
        return jTextFieldnom;
    }

    public void setjTextFieldnom(JTextField jTextFieldnom) {
        this.jTextFieldnom = jTextFieldnom;
    }

    public JTextField getjTextFieldnum() {
        return jTextFieldnum;
    }

    public void setjTextFieldnum(JTextField jTextFieldnum) {
        this.jTextFieldnum = jTextFieldnum;
    }

    public JTextField getjTextFieldprenom() {
        return jTextFieldprenom;
    }

    public void setjTextFieldprenom(JTextField jTextFieldprenom) {
        this.jTextFieldprenom = jTextFieldprenom;
    }

    public JTextField getjTextFieldville() {
        return jTextFieldville;
    }

    public void setjTextFieldville(JTextField jTextFieldville) {
        this.jTextFieldville = jTextFieldville;
    }



}