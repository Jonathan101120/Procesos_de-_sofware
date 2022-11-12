/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema;

import java.awt.Color;
import javax.swing.JOptionPane;

import movimiento.MoverComp;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Menú Principal");
    }
    //Llamada a productos

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        lblMood1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        main = new javax.swing.JPanel();
        panelP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblpago2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        opciones = new Sistema.PanelRound();
        btnsm = new Sistema.PanelRound();
        lblm = new javax.swing.JLabel();
        inicio = new javax.swing.JPanel();
        lblinicio = new javax.swing.JLabel();
        lbli = new javax.swing.JLabel();
        favorito = new javax.swing.JPanel();
        lblfavorito = new javax.swing.JLabel();
        lblf = new javax.swing.JLabel();
        carrito = new javax.swing.JPanel();
        lblcarrito = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        configuracion = new javax.swing.JPanel();
        lblMood = new javax.swing.JLabel();
        lblconfiguracion = new javax.swing.JLabel();
        salir = new javax.swing.JPanel();
        lbls = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMood3 = new javax.swing.JLabel();
        lblMood4 = new javax.swing.JLabel();
        lblMood5 = new javax.swing.JLabel();
        lblMood6 = new javax.swing.JLabel();
        btnz = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btnp = new javax.swing.JButton();
        lbltitulo = new javax.swing.JLabel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField3.setText("ZAPATILLAS");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.setText("ZAPATILLAS");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.setText("ZAPATILLAS");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setText("ZAPATILLAS");

        lblMood1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMood1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapatilla.png"))); // NOI18N
        lblMood1.setToolTipText("");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 153, 204));
        jTextField5.setText("PRENDAS DISPONIBLES");
        jTextField5.setCaretColor(new java.awt.Color(0, 204, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelP.setBackground(new java.awt.Color(144, 224, 239));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total a pagar:");

        lblpago2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblpago2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("S/.");

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpago2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpago2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        main.add(panelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, 130));

        opciones.setBackground(new java.awt.Color(70, 143, 175));
        opciones.setRoundBottomRight(30);
        opciones.setRoundTopRight(30);
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsm.setBackground(new java.awt.Color(64, 128, 156));
        btnsm.setRoundBottomLeft(45);
        btnsm.setRoundBottomRight(45);
        btnsm.setRoundTopLeft(45);
        btnsm.setRoundTopRight(45);
        btnsm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblm.setForeground(new java.awt.Color(255, 255, 255));
        lblm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblm.setText("≡");
        lblm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblm.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblmMouseReleased(evt);
            }
        });
        btnsm.add(lblm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        opciones.add(btnsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 25, -1, -1));

        inicio.setBackground(new java.awt.Color(70, 143, 175));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicioMouseExited(evt);
            }
        });
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        inicio.add(lblinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lbli.setBackground(new java.awt.Color(255, 255, 255));
        lbli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbli.setForeground(new java.awt.Color(255, 255, 255));
        lbli.setText("Inicio");
        inicio.add(lbli, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 18, -1, -1));

        opciones.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 60));

        favorito.setBackground(new java.awt.Color(70, 143, 175));
        favorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                favoritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                favoritoMouseExited(evt);
            }
        });
        favorito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfavorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favoritos.png"))); // NOI18N
        favorito.add(lblfavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lblf.setBackground(new java.awt.Color(255, 255, 255));
        lblf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblf.setForeground(new java.awt.Color(255, 255, 255));
        lblf.setText("Favoritos");
        favorito.add(lblf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 18, -1, -1));

        opciones.add(favorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 60));

        carrito.setBackground(new java.awt.Color(70, 143, 175));
        carrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carritoMouseExited(evt);
            }
        });
        carrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.png"))); // NOI18N
        carrito.add(lblcarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 37, 35));

        lblc.setBackground(new java.awt.Color(255, 255, 255));
        lblc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblc.setForeground(new java.awt.Color(255, 255, 255));
        lblc.setText("Carrito");
        carrito.add(lblc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 18, -1, -1));

        opciones.add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 60));

        configuracion.setBackground(new java.awt.Color(70, 143, 175));
        configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configuracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                configuracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                configuracionMouseExited(evt);
            }
        });
        configuracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMood.setBackground(new java.awt.Color(255, 255, 255));
        lblMood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMood.setForeground(new java.awt.Color(255, 255, 255));
        lblMood.setText("Modo Oscuro");
        configuracion.add(lblMood, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, -1, -1));

        lblconfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mood.png"))); // NOI18N
        configuracion.add(lblconfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 15, 37, 35));

        opciones.add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 60));

        salir.setBackground(new java.awt.Color(70, 143, 175));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbls.setBackground(new java.awt.Color(255, 255, 255));
        lbls.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbls.setForeground(new java.awt.Color(255, 255, 255));
        lbls.setText("Cerrar sesión");
        salir.add(lbls, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 18, -1, -1));

        lblsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/csesion.png"))); // NOI18N
        salir.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 5, 37, 50));

        opciones.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 60));

        main.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-125, 0, 210, 533));

        jPanel1.setBackground(new java.awt.Color(168, 218, 220));

        lblMood3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMood3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camisas.jpg"))); // NOI18N
        lblMood3.setToolTipText("");

        lblMood4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMood4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/882389996_1.jpg"))); // NOI18N
        lblMood4.setToolTipText("");
        lblMood4.setInheritsPopupMenu(false);

        lblMood5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMood5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapatilla.png"))); // NOI18N
        lblMood5.setToolTipText("");

        lblMood6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMood6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1010249991.jpg"))); // NOI18N
        lblMood6.setToolTipText("");
        lblMood6.setInheritsPopupMenu(false);

        btnz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnz.setText("ZAPATILLAS");
        btnz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzActionPerformed(evt);
            }
        });

        btna.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btna.setText("ABRIGO");
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
            }
        });

        btnc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnc.setText("CAMISAS");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnp.setText("PANTALONES");
        btnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpActionPerformed(evt);
            }
        });

        lbltitulo.setBackground(new java.awt.Color(0, 0, 0));
        lbltitulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        lbltitulo.setText("PRENDAS DISPONIBLES");
        lbltitulo.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btna, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnp)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMood5)
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMood4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMood3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltitulo)
                        .addGap(123, 123, 123))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(lblMood6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMood5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMood3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblMood4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(259, Short.MAX_VALUE)
                    .addComponent(lblMood6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)))
        );

        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 620, 440));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 949, 533));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmMouseClicked
        if (opciones.getX()==-125)
            MoverComp.Derecha(opciones, 2, 1, 0);
        else
            MoverComp.Izquierda(opciones, 2, 1, -125);
    }//GEN-LAST:event_lblmMouseClicked

    private void lblmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmMousePressed
        if (lblMood.getText().equals("Modo Oscuro"))
            btnsm.setBackground(new Color(44,107,135));
        else
            btnsm.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_lblmMousePressed

    private void lblmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmMouseReleased
        if (lblMood.getText().equals("Modo Oscuro"))
            btnsm.setBackground(new Color(64,128,156));
        else
            btnsm.setBackground(new Color(40,40,40));
    }//GEN-LAST:event_lblmMouseReleased

    private void inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseEntered
        if (lblMood.getText().equals("Modo Oscuro"))
            inicio.setBackground(new Color(44,107,135));
        else
            inicio.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_inicioMouseEntered

    private void inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseExited
        if (lblMood.getText().equals("Modo Oscuro"))
            inicio.setBackground(new Color(70,143,175));
        else
            inicio.setBackground(new Color(27,27,27));
    }//GEN-LAST:event_inicioMouseExited

    private void favoritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoMouseEntered
        if (lblMood.getText().equals("Modo Oscuro"))
            favorito.setBackground(new Color(44,107,135));
        else
            favorito.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_favoritoMouseEntered

    private void favoritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritoMouseExited
        if (lblMood.getText().equals("Modo Oscuro"))
            favorito.setBackground(new Color(70,143,175));
        else
            favorito.setBackground(new Color(27,27,27));
    }//GEN-LAST:event_favoritoMouseExited

    private void carritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseEntered
        if (lblMood.getText().equals("Modo Oscuro"))
            carrito.setBackground(new Color(44,107,135));
        else
            carrito.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_carritoMouseEntered

    private void carritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseExited
        if (lblMood.getText().equals("Modo Oscuro"))
            carrito.setBackground(new Color(70,143,175));
        else
            carrito.setBackground(new Color(27,27,27));
    }//GEN-LAST:event_carritoMouseExited

    private void configuracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseEntered
        if (lblMood.getText().equals("Modo Oscuro"))
            configuracion.setBackground(new Color(44,107,135));
        else
            configuracion.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_configuracionMouseEntered

    private void configuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseExited
        if (lblMood.getText().equals("Modo Oscuro"))
            configuracion.setBackground(new Color(70,143,175));
        else
            configuracion.setBackground(new Color(27,27,27));
    }//GEN-LAST:event_configuracionMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        if (lblMood.getText().equals("Modo Oscuro"))
            salir.setBackground(new Color(44,107,135));
        else
            salir.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        if (lblMood.getText().equals("Modo Oscuro"))
            salir.setBackground(new Color(70,143,175));
        else
            salir.setBackground(new Color(27,27,27));
    }//GEN-LAST:event_salirMouseExited
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzActionPerformed
        Productos obj=new Productos();
        obj.tipoP(0);
        obj.producto1(0);
        obj.producto2(0);
        obj.producto3(0);
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnzActionPerformed

    private void btnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpActionPerformed
        Productos obj=new Productos();
        obj.setVisible(true);
        this.setVisible(false);
        obj.tipoP(1);
        obj.producto1(1);
        obj.producto2(1);
        obj.producto3(1);
    }//GEN-LAST:event_btnpActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        Productos obj=new Productos();
        obj.setVisible(true);
        this.setVisible(false);
        obj.tipoP(2);
        obj.producto1(2);
        obj.producto2(2);
        obj.producto3(2);
    }//GEN-LAST:event_btncActionPerformed

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed
        Productos obj=new Productos();
        obj.setVisible(true);
        this.setVisible(false);
        obj.tipoP(3);
        obj.producto1(3);
        obj.producto2(3);
        obj.producto3(3);
    }//GEN-LAST:event_btnaActionPerformed
   
    private void carritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseClicked
        Carrito car=new Carrito();
        if (lblpago2.getText().equals("")||lblpago2.getText().equals("0.0")){
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningún producto.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
        car.setVisible(true);
        Carrito.jLabel5.setText(lblpago2.getText());
        this.setVisible(false);
        }
    }//GEN-LAST:event_carritoMouseClicked

    private void configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMouseClicked
        if (lblMood.getText().equals("Modo Claro")){
            main.setBackground(Color.WHITE);
            jPanel1.setBackground(new Color(168,218,220));
            lbltitulo.setForeground(Color.BLACK);
            opciones.setBackground(new Color(70,143,175));
            lblMood.setText("Modo Oscuro");
            lblMood.setForeground(Color.WHITE);
            btnsm.setBackground(new Color(64,128,156));
            inicio.setBackground(new Color(70,143,175));
            carrito.setBackground(new Color(70,143,175));
            favorito.setBackground(new Color(70,143,175));
            configuracion.setBackground(new Color(70,143,175));
            salir.setBackground(new Color(70,143,175));
        }
        else{
            main.setBackground(new Color(35,35,35));
            lbltitulo.setForeground(Color.WHITE);
            jPanel1.setBackground(new Color(35,35,35));
            opciones.setBackground(new Color(27,27,27));
            lblMood.setText("Modo Claro");
            lblMood.setForeground(Color.WHITE);
            btnsm.setBackground(new Color(40,40,40));
            inicio.setBackground(new Color(27,27,27));
            favorito.setBackground(new Color(27,27,27));
            carrito.setBackground(new Color(27,27,27));
            configuracion.setBackground(new Color(27,27,27));
            salir.setBackground(new Color(27,27,27));
        }
    }//GEN-LAST:event_configuracionMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        
        if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "Alerta!", JOptionPane.YES_NO_OPTION)==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_salirMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btna;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnp;
    private Sistema.PanelRound btnsm;
    private javax.swing.JButton btnz;
    private javax.swing.JPanel carrito;
    private javax.swing.JPanel configuracion;
    private javax.swing.JPanel favorito;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblMood;
    private javax.swing.JLabel lblMood1;
    private javax.swing.JLabel lblMood3;
    private javax.swing.JLabel lblMood4;
    private javax.swing.JLabel lblMood5;
    private javax.swing.JLabel lblMood6;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblcarrito;
    private javax.swing.JLabel lblconfiguracion;
    private javax.swing.JLabel lblf;
    private javax.swing.JLabel lblfavorito;
    private javax.swing.JLabel lbli;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblm;
    public static javax.swing.JLabel lblpago2;
    private javax.swing.JLabel lbls;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel main;
    private Sistema.PanelRound opciones;
    private javax.swing.JPanel panelP;
    private javax.swing.JPanel salir;
    // End of variables declaration//GEN-END:variables
}
