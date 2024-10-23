
package Formularios;

import Clase.ServicioSolicitado;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class frmCitas_RegistroCitas extends javax.swing.JFrame {
    
  
    
    public frmCitas_RegistroCitas() {
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

        panelRegistroCitas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbxTipoAmbiente = new javax.swing.JComboBox<>();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxServicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHoraTermino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxAmbienteReservar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbxTerapeuta = new javax.swing.JComboBox<>();
        btnAgregarServicio = new javax.swing.JButton();
        btnEditarServicio = new javax.swing.JButton();
        btnEliminarServicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegistroCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Ambientes disponibles");
        panelRegistroCitas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ambiente", "Disponibilidad en horas", "Hora inicio", "Hora termino"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelRegistroCitas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 650, 99));

        cbxTipoAmbiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baños medicinales", "Masajes/Terapias", "Tratamientos corporales", "Tratamientos faciales" }));
        panelRegistroCitas.add(cbxTipoAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 195, -1));
        panelRegistroCitas.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 161, -1));

        jLabel1.setText("Fecha:");
        panelRegistroCitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Tipo ambiente:");
        panelRegistroCitas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Reserva de citas");
        panelRegistroCitas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setText("Nombre del servicio:");
        panelRegistroCitas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        cbxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegistroCitas.add(cbxServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 140, -1));

        jLabel6.setText("H. Inicio:");
        panelRegistroCitas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));
        panelRegistroCitas.add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 100, -1));

        jLabel7.setText("H. Fin");
        panelRegistroCitas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        txtHoraTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraTerminoActionPerformed(evt);
            }
        });
        panelRegistroCitas.add(txtHoraTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 110, -1));

        jLabel8.setText("Ambiente");
        panelRegistroCitas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        cbxAmbienteReservar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegistroCitas.add(cbxAmbienteReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 130, -1));

        jLabel9.setText("Terapeuta:");
        panelRegistroCitas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, -1, -1));

        cbxTerapeuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegistroCitas.add(cbxTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, 140, -1));

        btnAgregarServicio.setText("Agregar");
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });
        panelRegistroCitas.add(btnAgregarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, -1));

        btnEditarServicio.setText("Editar");
        btnEditarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarServicioActionPerformed(evt);
            }
        });
        panelRegistroCitas.add(btnEditarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 80, -1));

        btnEliminarServicio.setText("Eliminar");
        panelRegistroCitas.add(btnEliminarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 80, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha reserva", "Hora inicio", "Hora término", "Nombre ambiente", "Terapeuta", "Nombre servicio"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        panelRegistroCitas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 1130, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Datos del cliente");
        panelRegistroCitas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Edad", "Sexo", "Número celular", "Discapacitado", "Descripción discapacidad"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        panelRegistroCitas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 1130, 110));

        btnAgregarCliente.setText("Agregar");
        panelRegistroCitas.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 80, -1));

        btnEditarCliente.setText("Editar");
        panelRegistroCitas.add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 80, -1));

        btnEliminarCliente.setText("Eliminar");
        panelRegistroCitas.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistroCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistroCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoraTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraTerminoActionPerformed

    private void btnEditarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarServicioActionPerformed

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        // Capturar valores de las elementos del form en variables
        String tipo_ambiente = cbxTipoAmbiente.getSelectedItem().toString();
        Date fecha = jdcFecha.getDate();
        String nombre_servicio = cbxServicio.getSelectedItem().toString();
        String codigo_servicio = "";
        
        /*El valor de codigo_servicio se creará a partir
        de la concatenación de la fecha, horas, minutos y
        segundos del momento en el que se agregó el servicio
        */
        //Creamos una variable para establecer el formato horas:minutos:segundos
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        
        //Creamos una variable para establecer el formato dd/mm/yyyy
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
        
        //Capturamos los valores de formatoHora y lo pasamos a un dato de tipo cadena
        String hora_cadena = formatoHora.format(fecha);
        //dividimos la cadena y asignamos sus partes en una arreglo
        String[] hora_split = hora_cadena.split(":");
        
        //Capturamos los valores de formatoFecha y lo pasamos a un dato de tipo cadena
        String fecha_cadena = formatoFecha.format(fecha);
        //dividimos la cadena y asignamos sus partes en un arreglo
        String[] fecha_split = fecha_cadena.split("/");
        
        //generamos el codigo de servicio concatenando fecha_split con hora_split
        for(int i=0; i<fecha_split.length;i++){
            codigo_servicio+= fecha_split[i];
            codigo_servicio+= hora_split[i];
        }
        
        //continuamos capturando los valores ingresados en el form
        String hora_inicio = txtHoraInicio.getText();
        String hora_termino = txtHoraTermino.getText();
        String ambiente_reservar = cbxAmbienteReservar.getSelectedItem().toString();
        String terapeuta = cbxTerapeuta.getSelectedItem().toString();
        
        //instanciamos un obtejo de tipo ServicioSolicitado
        ServicioSolicitado nuevo_servicio = new ServicioSolicitado();
        
        
        
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCitas_RegistroCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarServicio;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarServicio;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarServicio;
    private javax.swing.JComboBox<String> cbxAmbienteReservar;
    private javax.swing.JComboBox<String> cbxServicio;
    private javax.swing.JComboBox<String> cbxTerapeuta;
    private javax.swing.JComboBox<String> cbxTipoAmbiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JPanel panelRegistroCitas;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtHoraTermino;
    // End of variables declaration//GEN-END:variables
}
