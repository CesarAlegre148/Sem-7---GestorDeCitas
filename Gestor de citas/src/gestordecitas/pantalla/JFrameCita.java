/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas.pantalla;

import entidades.Cita;
import entidades.Especialidad;
import entidades.Medico;
import entidades.Paciente;
import gestor.de.citas.GestorDeCitas;
import javax.swing.JFrame;

/**
 *
 * @author Cesar Alegre Flores
 */
public class JFrameCita extends javax.swing.JFrame {

    private JFrameGestorDeCitas padre;
    private Cita cita;
    private boolean estoyEditando = false;
    
    private Medico medicoSelecionado;
    private Paciente pacienteSelecionado;
    private Especialidad especialidadSelecionado;
    private Especialidad espec;
    /**
     * Creates new form JFrameCita
     */
    public JFrameCita(JFrameGestorDeCitas padre) {
        initComponents();
        this.padre = padre;
        
        cbEspecialidad.removeAllItems();
        cbEspecialidad.setEnabled(false);
        
        cbHora.removeAllItems();
        for(String hora: gestor.de.citas.GestorDeCitas.horasDisponibles){
            cbHora.addItem(hora);
        }
        
        cbFecha.removeAllItems();
        for(String fecha: gestor.de.citas.GestorDeCitas.fechaDisponibles){
            cbFecha.addItem(fecha);
        }
    }
    public JFrameCita(JFrameGestorDeCitas padre, Cita cita) {
        initComponents();
        this.padre = padre;
        this.cita = cita;
        this.estoyEditando = true;
        this.btnBusP.setVisible(false);
        this.btnBusM.setVisible(false);
        this.btnGuardarCita.setVisible(false);
        lblTitulo.setText("Visualizar Cita");
        this.txtMedico.setText(cita.getMedico().getDatosMostrar());
        this.txtPaciente.setText(cita.getPaciente().getDatosMostrar());
        cbEspecialidad.removeAllItems();
        cbEspecialidad.addItem(cita.getEspecialidad().getNombre());
        
        cbFecha.removeAllItems();
        cbFecha.addItem(GestorDeCitas.fechaDisponibles.get(cita.getFecha()));
        
        cbHora.removeAllItems();
        cbHora.addItem(GestorDeCitas.horasDisponibles.get(cita.getHora()));
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();
        btnBusP = new javax.swing.JButton();
        btnBusM = new javax.swing.JButton();
        cbEspecialidad = new javax.swing.JComboBox<>();
        cbFecha = new javax.swing.JComboBox<>();
        cbHora = new javax.swing.JComboBox<>();
        btnSalirCita = new javax.swing.JButton();
        btnGuardarCita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Nueva Cita");

        txtPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteActionPerformed(evt);
            }
        });

        btnBusP.setText("Buscar Paciente");
        btnBusP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusPActionPerformed(evt);
            }
        });

        btnBusM.setText("Buscar Medico");
        btnBusM.setToolTipText("");
        btnBusM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusMActionPerformed(evt);
            }
        });

        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEspecialidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbEspecialidadPropertyChange(evt);
            }
        });

        cbFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSalirCita.setText("Salir");
        btnSalirCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCitaActionPerformed(evt);
            }
        });

        btnGuardarCita.setText("Guardar");
        btnGuardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMedico)
                            .addComponent(txtPaciente))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBusP))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnBusM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalirCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCita)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirCita)
                    .addComponent(btnGuardarCita))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void guardarCita(){
     
        if(medicoSelecionado != null && pacienteSelecionado != null && especialidadSelecionado != null){
            cita = new Cita(medicoSelecionado, pacienteSelecionado, especialidadSelecionado);
            this.padre.agregarCita(cita);
        }
     
     }
    public void setPaciente(Paciente paciente){
        this.pacienteSelecionado = paciente;
        txtPaciente.setText(paciente.getDatosMostrar());
    }
    public void setMedico(Medico medico){
        this.medicoSelecionado = medico;
        
        cbEspecialidad.removeAllItems();
        for(Especialidad espec: medico.getEspecialidades()){
            cbEspecialidad.addItem(espec.getNombre());
        }
        cbEspecialidad.setEnabled(true);
    }
    public void setEspecialidad(Especialidad especialidad){
        this.especialidadSelecionado = especialidad;
    }
    
    private void btnSalirCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCitaActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirCitaActionPerformed

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed
     guardarCita();
     salir();
        
    }//GEN-LAST:event_btnGuardarCitaActionPerformed

    private void txtPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPacienteActionPerformed

    private void btnBusPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusPActionPerformed
        
        JFramePacientes pantallaPacientes = new JFramePacientes(this);
        pantallaPacientes.setLocationRelativeTo(this);
        pantallaPacientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBusPActionPerformed

    private void btnBusMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusMActionPerformed
        
        JFrameMedicos pantallaMedicos = new JFrameMedicos(this);
        pantallaMedicos.setLocationRelativeTo(this);
        pantallaMedicos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBusMActionPerformed

    private void cbEspecialidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbEspecialidadPropertyChange
      
        if(this.medicoSelecionado!=null){
        this.medicoSelecionado.getEspecialidades().get(cbEspecialidad.getSelectedIndex());
        especialidadSelecionado = espec;
        }
    }//GEN-LAST:event_cbEspecialidadPropertyChange

    private void buscarPaciente(){
        JFramePacientes paciente = new JFramePacientes(this);
        paciente.setLocationRelativeTo(null);
        paciente.setVisible(true);
    }
    
    private void salir(){
        padre.setVisible(true);
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(JFrameCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCita(new JFrameGestorDeCitas()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusM;
    private javax.swing.JButton btnBusP;
    private javax.swing.JButton btnGuardarCita;
    private javax.swing.JButton btnSalirCita;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JComboBox<String> cbFecha;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
