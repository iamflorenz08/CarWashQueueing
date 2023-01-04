/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import Interface.CarCallBack;
import Interface.LogOutInterface;
import Models.CarModel;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Florenz
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    private components.EnqueueDialog enqueueDialog;
    private LinkedList<CarModel> cars;
    private components.Rows rows;
    private Interface.LogOutInterface logoutCallback;
    public MainPanel() {
        initComponents();
        init();
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
        btnLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblInfront = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblWaiting = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEnqueue = new javax.swing.JLabel();
        btnWash = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TableScrollContainer = new javax.swing.JScrollPane();
        Table = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 720));

        jPanel1.setBackground(new java.awt.Color(0, 129, 239));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car Wash Queueing");

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLogout.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(jLabel1))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfront.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        lblInfront.setForeground(new java.awt.Color(255, 255, 255));
        lblInfront.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfront.setText("Empty");
        jPanel2.add(lblInfront, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_car.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Front Car");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/front_car_bg.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWaiting.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        lblWaiting.setForeground(new java.awt.Color(255, 255, 255));
        lblWaiting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWaiting.setText("0");
        jPanel3.add(lblWaiting, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 220, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Unwashed Cars");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 80, 220, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_soap.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unwashed_cars_bg.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnEnqueue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnqueue.png"))); // NOI18N
        btnEnqueue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnqueueMouseClicked(evt);
            }
        });

        btnWash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnWash.png"))); // NOI18N
        btnWash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWashMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 129, 239));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Car Color");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Car Model");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Plate Number");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel13)
                .addGap(100, 100, 100)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel14)
                    .addContainerGap(1117, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addContainerGap()))
        );

        TableScrollContainer.setBackground(new java.awt.Color(255, 255, 255));
        TableScrollContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        TableScrollContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TableScrollContainer.setViewportView(Table);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_calendar.png"))); // NOI18N

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("JANUARY 1, 2023");

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTime.setText("6:36 PM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnqueue)
                        .addGap(8, 8, 8)
                        .addComponent(btnWash))
                    .addComponent(TableScrollContainer)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblTime))
                            .addComponent(lblDate)
                            .addComponent(jLabel5))))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnqueue)
                    .addComponent(btnWash))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TableScrollContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnqueueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnqueueMouseClicked
        // TODO add your handling code here:
        enqueueDialog = components.EnqueueDialog.getInstance();
        enqueueDialog.clearTextFields();
        enqueueDialog.setVisible(true);
        enqueueDialog.setCallBack(new CarCallBack() {
            @Override
            public void carDetails(CarModel car_model) {
                cars.add(car_model);
                notifyDatasetHasChanged();
            }
        });
    }//GEN-LAST:event_btnEnqueueMouseClicked

    private void btnWashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWashMouseClicked
        // TODO add your handling code here:
        if (!cars.isEmpty()) {
            cars.removeFirst();
        }
        notifyDatasetHasChanged();
    }//GEN-LAST:event_btnWashMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        logoutCallback.logout();
    }//GEN-LAST:event_btnLogoutMouseClicked

    public void setLogoutCallback(LogOutInterface logoutCallback) {
        this.logoutCallback = logoutCallback;
    }
    
    
    private void notifyDatasetHasChanged() {
        int y = 0;
        int waitingCars = 0;
        Table.removeAll();

        lblWaiting.setText("2");
        lblInfront.setText("Empty");

        if (!cars.isEmpty()) {
            cars.getFirst().setStatus("In Front");
            lblInfront.setText(cars.getFirst().getPlate_no());
        }

        for (int i = 0; i < cars.size(); i++) {
            Color color = i % 2 == 0 ? new Color(255, 252, 246) : new Color(233, 245, 255);

            rows = new components.Rows();
            rows.setPlateNumber(cars.get(i).getPlate_no());
            rows.setCarModel(cars.get(i).getModel());
            rows.setCarColor(cars.get(i).getColor());
            rows.setStatus(cars.get(i).getStatus());
            rows.setBackground(color);

            Table.add(rows, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, y, -1, -1));
            y += 30;

            if (cars.get(i).getStatus().equals("Waiting")) {
                waitingCars += 1;
            }
        }

        lblWaiting.setText(String.valueOf(waitingCars));

        TableScrollContainer.repaint();
        TableScrollContainer.revalidate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Table;
    private javax.swing.JScrollPane TableScrollContainer;
    private javax.swing.JLabel btnEnqueue;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnWash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblInfront;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblWaiting;
    // End of variables declaration//GEN-END:variables

    private void init() {
        cars = new LinkedList<>();
        LocalDate ld = LocalDate.now();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalTime time = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                lblTime.setText(formatter.format(time));
            }
        }, 0, 1000);
        lblDate.setText(ld.getMonth() + " " + ld.getDayOfMonth() + ", " + ld.getYear());
    }
}