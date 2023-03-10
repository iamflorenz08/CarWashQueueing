/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;

/**
 *
 * @author Florenz
 */
public class Rows extends javax.swing.JPanel {

    /**
     * Creates new form rows
     */
    public Rows() {
        initComponents();
    }
    
    public void setPlateNumber(String plate_number){
        this.lblPlateNumber.setText(plate_number);
    }
    
    public void setCarModel(String car_model){
        this.lblCarModel.setText(car_model);
    }
    
    public void setCarColor(String car_color){
        this.lblCarColor.setText(car_color);
    }
    
    public void setStatus(String status){
        this.lblStatus.setText(status);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlateNumber = new javax.swing.JLabel();
        lblCarModel = new javax.swing.JLabel();
        lblCarColor = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        lblPlateNumber.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblPlateNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlateNumber.setText("XYZ-123");

        lblCarModel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblCarModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarModel.setText("Ford");

        lblCarColor.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblCarColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarColor.setText("Red");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("In Front");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlateNumber)
                    .addComponent(lblCarModel)
                    .addComponent(lblCarColor)
                    .addComponent(lblStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCarColor;
    private javax.swing.JLabel lblCarModel;
    private javax.swing.JLabel lblPlateNumber;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
