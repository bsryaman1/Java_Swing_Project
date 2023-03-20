
package com.sdu.firstproject;

import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;



public class FirstFrame extends javax.swing.JFrame {

    private int i;
    
    public FirstFrame() {
        
        initComponents();
        //getContentPane().setBackground(Color.GREEN); 
        //renk değiştirmek için bu yazılmalı
        setLocationRelativeTo(null);
        //lbl_1.setText("Merhaba Dünya");
        //lbl_1.setOpaque(true);
        //lbl_1.setBackground(Color.red);
        i=0;
    }
    //constructor

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Frame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_1.setText("Tıkla");
        btn_1.setDisplayedMnemonicIndex(1);
        btn_1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_1MouseMoved(evt);
            }
        });
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btn_1)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(btn_1)
                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void btn_1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseMoved
        int width= this.getWidth(); //genişliği
        int height= this.getHeight(); //yüksekliği
        int btn_weight= btn_1.getWidth();
        int btn_height= btn_1.getHeight();
        int width_frame=width-btn_weight;
        int height_frame=height-btn_height;
        //buton hight ve weightleri alındı
        Random rnd= new Random();
        //random sınıfı oluşturuldu
        btn_1.setLocation(rnd.nextInt(width_frame),rnd.nextInt(height_frame));
        //bir nesnenin frame üzerindeki konumunu belirleme -> setLocation
    }//GEN-LAST:event_btn_1MouseMoved

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        JOptionPane.showMessageDialog(null, "Kazandınız!");
    }//GEN-LAST:event_btn_1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(Object object, String butona_Tıkladınız) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
