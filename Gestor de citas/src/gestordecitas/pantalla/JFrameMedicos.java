/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas.pantalla;

import entidades.Medico;
import entidades.Paciente;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Cesar Alegre Flores
 */
public class JFrameMedicos extends javax.swing.JFrame {

    private JFrame padre;
    private List<Medico> medicos;
    private DefaultListModel<String> modeloListMedicos;
    /**
     * Creates new form JFrameMedicos
     */
    public JFrameMedicos(JFrameCita padre) {
        initComponents();
        this.padre = padre;
        this.medicos = gestor.de.citas.GestorDeCitas.listaDeMedico;
        modeloListMedicos = new DefaultListModel<>();
        this.listMedico.setModel(modeloListMedicos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearMedico = new javax.swing.JButton();
        btnSalirMedico = new javax.swing.JButton();
        btnBuscarMedico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMedico = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarMedico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearMedico.setText("Crear");
        btnCrearMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMedicoActionPerformed(evt);
            }
        });

        btnSalirMedico.setText("Salir");
        btnSalirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMedicoActionPerformed(evt);
            }
        });

        btnBuscarMedico.setText("Buscar");
        btnBuscarMedico.setToolTipText("");
        btnBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMedicoActionPerformed(evt);
            }
        });

        listMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listMedico);

        jLabel1.setText("Medico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarMedico))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalirMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addComponent(btnCrearMedico)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarMedico)
                    .addComponent(txtBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirMedico)
                    .addComponent(btnCrearMedico))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir(){
        padre.setVisible(true);
        this.dispose();
    }
    
    public void agregarNuevoMedico(Medico medico){
        medicos.add(medico);
        buscar("");
    }
     private void buscar(String criterio){
        this.modeloListMedicos.removeAllElements();
        
        for (Medico medico : medicos){
            if (medico.getNombre() != null && medico.getNombre().contains(criterio)){
                this.modeloListMedicos.addElement(medico.getDatosMostrar());
            }
        }
    }
    private void btnCrearMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMedicoActionPerformed

        //Crear obejo de la ventana Cita
        JFrameEditarMedico pantallaMedico = new JFrameEditarMedico(this);

        // Centro la ventana
        pantallaMedico.setLocationRelativeTo(this);
        //lo hago visible
        pantallaMedico.setVisible(true);
        // ahora lo hago invisible la ventana actual
        // que es el gestor de citas
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearMedicoActionPerformed

    private void btnSalirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMedicoActionPerformed
    salir();

    }//GEN-LAST:event_btnSalirMedicoActionPerformed

    private void btnBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedicoActionPerformed

        //volverACargarCitas(txtBuscarMedico.getText().trim());
    }//GEN-LAST:event_btnBuscarMedicoActionPerformed

    private void listMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMedicoMouseClicked
        if(evt.getClickCount()>1){
            Medico medicoSelecionado = medicos.get(listMedico.getSelectedIndex());
            //this.padre.setMedico(medicoSelecionado);
            salir();
        }
    }//GEN-LAST:event_listMedicoMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMedicos(new JFrameCita(new JFrameGestorDeCitas())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMedico;
    private javax.swing.JButton btnCrearMedico;
    private javax.swing.JButton btnSalirMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listMedico;
    private javax.swing.JTextField txtBuscarMedico;
    // End of variables declaration//GEN-END:variables
}