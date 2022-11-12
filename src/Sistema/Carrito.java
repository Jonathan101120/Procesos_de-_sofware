/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author CRISTHIAN
 */
public class Carrito extends javax.swing.JFrame {

    /**
     * Creates new form Carrito
     */
    public Carrito() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonas = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbt3 = new javax.swing.JRadioButton();
        rbt1 = new javax.swing.JRadioButton();
        rbt2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbld = new javax.swing.JLabel();
        panelRound1 = new Sistema.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 142, 142));
        jLabel1.setText("Total a pagar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 97, 36));

        lbltotal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(43, 45, 66));
        jPanel2.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 45, 66));
        jLabel2.setText("Pedido pendiente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billetes.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 435, 111));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        zonas.add(rbt3);
        rbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt3.setForeground(new java.awt.Color(43, 45, 66));
        rbt3.setText("Lima Norte");
        jPanel1.add(rbt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 98, -1));

        zonas.add(rbt1);
        rbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt1.setForeground(new java.awt.Color(43, 45, 66));
        rbt1.setText("Lima Sur");
        jPanel1.add(rbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 98, -1));

        zonas.add(rbt2);
        rbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbt2.setForeground(new java.awt.Color(43, 45, 66));
        rbt2.setText("Lima Centro");
        jPanel1.add(rbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 45, 66));
        jLabel3.setText("Seleccionar zona:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 145, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setText("Pendiente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 28, 77, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 2, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 45, 66));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 60, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("Total: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 104, 120, 20));

        lbld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbld.setForeground(new java.awt.Color(43, 45, 66));
        lbld.setText("Delivery: ");
        jPanel3.add(lbld, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 82, 120, 20));

        panelRound1.setBackground(new java.awt.Color(0, 210, 172));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
        });
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmar pedido");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 15, 130, -1));

        jPanel3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 170, 50));

        jButton1.setForeground(new java.awt.Color(60, 63, 65));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("Subtotal:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 60, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Nombre:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));
        jPanel3.add(txtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, -1));
        jPanel3.add(txtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("DNI:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));
        jPanel3.add(txtdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("Dirección:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 440, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double valor=0;
        if (rbt1.isSelected())
            valor=10.0;
        if (rbt2.isSelected())
            valor=15.0;
        if (rbt3.isSelected())
            valor=20.0;
        lbld.setText("Delivery: "+valor);
        double subt = Double.parseDouble(jLabel5.getText());
        double tot=subt+valor;
        jLabel6.setText("Total: "+tot);
        lbltotal.setText(""+tot);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked
        Principal p=new Principal();
        if(txtn.getText().equals("")||txtd.getText().equals("")||txtdi.getText().equals("")||!(rbt1.isSelected()||rbt1.isSelected()||rbt1.isSelected())){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(this,"¡Su pedido se ha realizado con éxito!");
        this.setVisible(false);
        p.setVisible(true);
        }
    }//GEN-LAST:event_panelRound1MouseClicked

    /**
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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbld;
    public static javax.swing.JLabel lbltotal;
    private Sistema.PanelRound panelRound1;
    private javax.swing.JRadioButton rbt1;
    private javax.swing.JRadioButton rbt2;
    private javax.swing.JRadioButton rbt3;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtdi;
    private javax.swing.JTextField txtn;
    public static javax.swing.ButtonGroup zonas;
    // End of variables declaration//GEN-END:variables
}
