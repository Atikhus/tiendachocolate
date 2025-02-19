/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tiendachocolates;

import com.chocolateTienda.interfaces.Daocarritocompra;
import com.chocolateTienda.models.carritocompra;
import java.awt.Color;

/**
 *
 * @author Cesar
 */
public class AgregarProductoCarrito extends javax.swing.JPanel {
    boolean isEdition = false;
    
    com.chocolateTienda.models.carritocompra userEdition;
    /**
     * Creates new form Actualizarproductos
     */
    int id=0;

  public AgregarProductoCarrito(com.chocolateTienda.models.carritocompra carrito) {
        initComponents();
        isEdition = true;
        userEdition = carrito;
        InitStyles();
        this.id=id;
        
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
       
        apPTxt.putClientProperty("JTextField.placeholderText", "Ingrese el valor.");
      
        if (isEdition) {
            title.setText("Editar Usuario");
            button.setText("Guardar");

            if (userEdition != null) {
           
                apPTxt.setText(String.valueOf(userEdition.getcantidad()));

            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        apPLbl = new javax.swing.JLabel();
        apPTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        button = new javax.swing.JButton();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar nuevo Usuario");

        apPLbl.setText("Cantidad");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(apPLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(182, 182, 182))
                            .addComponent(apPTxt))
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(553, 553, 553))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(apPLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(apPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(251, 251, 251))
                        .addGroup(bgLayout.createSequentialGroup()
                            .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(164, 164, 164)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
     
        String apP = apPTxt.getText();
       

        // Validaciones para los campos
        if (apP.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
          
            return;
        }

        com.chocolateTienda.models.carritocompra productos = isEdition ? userEdition : new com.chocolateTienda.models.carritocompra();
      
        int precio = Integer.parseInt(apP);
        productos.setcantidad(precio);
       
        try {
            Daocarritocompra dao = new listaCarrito();
            if (!isEdition) {
                dao.registrar(productos,id);
            } else {
                System.out.print("pasa a modificar");
                dao.modificar(productos);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Usuario " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
          
                apPTxt.setText("");
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
  
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apPLbl;
    private javax.swing.JTextField apPTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
