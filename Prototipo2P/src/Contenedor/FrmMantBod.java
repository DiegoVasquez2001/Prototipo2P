/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenedor;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class FrmMantBod extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMantBod
     */
    public FrmMantBod() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtCodBod = new javax.swing.JTextField();
        TxtNomBod = new javax.swing.JTextField();
        TxtEstBod = new javax.swing.JTextField();
        BtnAlta = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnCambio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Mantenimiento Bodegas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento Bodegas"));

        jLabel1.setText("Código Bodega:");

        jLabel2.setText("Nombre Bodega:");

        jLabel3.setText("Estatus Bodega:");

        BtnAlta.setText("Alta");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });

        BtnBaja.setText("Baja");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        BtnCambio.setText("Cambio");
        BtnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambioActionPerformed(evt);
            }
        });

        jLabel4.setText("Código Bodega:");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnBuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtCodBod)
                            .addComponent(TxtNomBod, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(TxtEstBod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCambio)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCodBod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNomBod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtEstBod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAlta)
                    .addComponent(BtnBaja)
                    .addComponent(BtnCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sic", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("insert into bodegas values(?,?,?)");
            
            pst.setString(1, TxtCodBod.getText().trim());
            pst.setString(2, TxtNomBod.getText().trim());
            pst.setString(3, TxtEstBod.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "REGISTRO REALIZADO!");
            TxtCodBod.setText("");
            TxtNomBod.setText("");
            TxtEstBod.setText("");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sic", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("delete from bodegas where codigo_bodega = ?");
            
            pst.setString(1, TxtBuscar.getText().trim());
            pst.executeUpdate();
            
            TxtCodBod.setText("");
            TxtNomBod.setText("");
            TxtEstBod.setText("");
            TxtBuscar.setText("");
            
            JOptionPane.showMessageDialog(null, "REGISTRO REMOVIDO!");
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sic", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("select * from bodegas where codigo_bodega = ?");
            pst.setString(1, TxtBuscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                TxtCodBod.setText(rs.getString("codigo_bodega"));
                TxtNomBod.setText(rs.getString("nombre_bodega"));
                TxtEstBod.setText(rs.getString("estatus_bodega"));
            } else {
                JOptionPane.showMessageDialog(null, "BODEGA NO REGISTRADA");
            }
            
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambioActionPerformed
        try {
            String ID = TxtBuscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sic", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("update bodegas set nombre_bodega = ?, estatus_bodega = ? where codigo_bodega = " + ID);
            
            pst.setString(1, TxtNomBod.getText().trim());
            pst.setString(2, TxtEstBod.getText().trim());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "MODIFICACION REALIZADA");
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnCambioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCambio;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCodBod;
    private javax.swing.JTextField TxtEstBod;
    private javax.swing.JTextField TxtNomBod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
