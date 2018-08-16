/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.usuarios;

/**
 *
 * @author DELL
 */
public class Inicio extends javax.swing.JFrame {

   usuarios mod;
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public  Inicio(usuarios mod){
        initComponents();
        setLocationRelativeTo(null);
        this.mod=mod;
        jluno.setText(mod.getNOMBREU());
        jldos.setText(mod.getNOMBRET());
        
      
        if(mod.getID_TIPO()==1){
            
        }else if (mod.getID_TIPO()==2){
            jMenuItem1.setVisible(false);
             submenuproductos.setVisible(false);
              submenuprovedores.setVisible(false);
          
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jldos = new javax.swing.JLabel();
        jltienda = new javax.swing.JLabel();
        jldos1 = new javax.swing.JLabel();
        jluno = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuproductos = new javax.swing.JMenu();
        submenuproductos = new javax.swing.JMenuItem();
        submenuconsultaproductos = new javax.swing.JMenuItem();
        menuprovedores = new javax.swing.JMenu();
        submenuprovedores = new javax.swing.JMenuItem();
        submenuconsultaproveedores = new javax.swing.JMenuItem();
        menuventas = new javax.swing.JMenu();
        Menuusuarios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        submenucunsulta = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        submenusalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jldos.setBackground(new java.awt.Color(0, 0, 0));
        jldos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jldos.setForeground(new java.awt.Color(0, 0, 204));
        jldos.setOpaque(true);

        jltienda.setBackground(new java.awt.Color(0, 0, 0));
        jltienda.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jltienda.setForeground(new java.awt.Color(255, 255, 255));
        jltienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltienda.setText("Tienda de Abarrotes Blanquita");
        jltienda.setOpaque(true);

        jldos1.setBackground(new java.awt.Color(0, 0, 0));
        jldos1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jldos1.setForeground(new java.awt.Color(0, 0, 204));
        jldos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jldos1.setText("Bienvenido");
        jldos1.setOpaque(true);

        jluno.setBackground(new java.awt.Color(0, 0, 0));
        jluno.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jluno.setForeground(new java.awt.Color(0, 0, 204));
        jluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jluno.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jltienda, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jldos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jldos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jldos1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jluno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jldos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuproductos.setBackground(new java.awt.Color(255, 255, 255));
        menuproductos.setForeground(new java.awt.Color(0, 0, 0));
        menuproductos.setText("Productos");

        submenuproductos.setText("registro de productos");
        submenuproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuproductosActionPerformed(evt);
            }
        });
        menuproductos.add(submenuproductos);

        submenuconsultaproductos.setText("consultar productos");
        submenuconsultaproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuconsultaproductosActionPerformed(evt);
            }
        });
        menuproductos.add(submenuconsultaproductos);

        jMenuBar1.add(menuproductos);

        menuprovedores.setBackground(new java.awt.Color(255, 255, 255));
        menuprovedores.setForeground(new java.awt.Color(0, 0, 0));
        menuprovedores.setText("Provedores");

        submenuprovedores.setText("registrar provedores");
        submenuprovedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuprovedoresActionPerformed(evt);
            }
        });
        menuprovedores.add(submenuprovedores);

        submenuconsultaproveedores.setText("consultar provedores");
        submenuconsultaproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuconsultaproveedoresActionPerformed(evt);
            }
        });
        menuprovedores.add(submenuconsultaproveedores);

        jMenuBar1.add(menuprovedores);

        menuventas.setBackground(new java.awt.Color(255, 255, 255));
        menuventas.setForeground(new java.awt.Color(0, 0, 0));
        menuventas.setText("Ventas");
        jMenuBar1.add(menuventas);

        Menuusuarios.setBackground(new java.awt.Color(255, 255, 255));
        Menuusuarios.setForeground(new java.awt.Color(0, 0, 0));
        Menuusuarios.setText("Usuarios");

        jMenuItem1.setText("registrar usuario administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menuusuarios.add(jMenuItem1);

        submenucunsulta.setText("Consulta de usuarios");
        submenucunsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenucunsultaActionPerformed(evt);
            }
        });
        Menuusuarios.add(submenucunsulta);

        jMenuBar1.add(Menuusuarios);

        jMenu7.setBackground(new java.awt.Color(255, 255, 255));
        jMenu7.setForeground(new java.awt.Color(0, 0, 0));
        jMenu7.setText("Salir");

        submenusalir.setText("cerrar cesion");
        submenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenusalirActionPerformed(evt);
            }
        });
        jMenu7.add(submenusalir);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submenucunsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenucunsultaActionPerformed
     consulta_usuarios entra=new consulta_usuarios();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_submenucunsultaActionPerformed

    private void submenuconsultaproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuconsultaproductosActionPerformed
     consulta_productos1 entra=new consulta_productos1();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_submenuconsultaproductosActionPerformed

    private void submenuproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuproductosActionPerformed
     registro_productos1 entra=new registro_productos1();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_submenuproductosActionPerformed

    private void submenuconsultaproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuconsultaproveedoresActionPerformed
        consulta_distribuidores entra=new consulta_distribuidores();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_submenuconsultaproveedoresActionPerformed

    private void submenuprovedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuprovedoresActionPerformed
     registro_distribuidores1 entra=new registro_distribuidores1();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_submenuprovedoresActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       registro_usuarios_administradores entra=new registro_usuarios_administradores();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void submenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenusalirActionPerformed
          login entra=new login();
     entra.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_submenusalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menuusuarios;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jldos;
    private javax.swing.JLabel jldos1;
    private javax.swing.JLabel jltienda;
    private javax.swing.JLabel jluno;
    private javax.swing.JMenu menuproductos;
    private javax.swing.JMenu menuprovedores;
    private javax.swing.JMenu menuventas;
    private javax.swing.JMenuItem submenuconsultaproductos;
    private javax.swing.JMenuItem submenuconsultaproveedores;
    private javax.swing.JMenuItem submenucunsulta;
    private javax.swing.JMenuItem submenuproductos;
    private javax.swing.JMenuItem submenuprovedores;
    private javax.swing.JMenuItem submenusalir;
    // End of variables declaration//GEN-END:variables
}
