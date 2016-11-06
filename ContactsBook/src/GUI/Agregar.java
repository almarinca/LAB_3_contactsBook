package GUI;

import Data.Contact;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agregar extends javax.swing.JDialog {

    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoTelFijo = new javax.swing.JTextField();
        campoTelMovil = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoCorreo1 = new javax.swing.JTextField();
        campoCorreo2 = new javax.swing.JTextField();
        campoCorreo3 = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Contacto"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Teléfono Fijo");

        jLabel4.setText("Teléfono Móvil");

        jLabel5.setText("Dirección");

        jLabel6.setText("Correo");

        jLabel7.setText("Correo");

        jLabel8.setText("Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(campoApellido)
                    .addComponent(campoTelFijo)
                    .addComponent(campoTelMovil)
                    .addComponent(campoDireccion)
                    .addComponent(campoCorreo1)
                    .addComponent(campoCorreo2)
                    .addComponent(campoCorreo3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTelFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoCorreo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Aceptar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Aceptar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        loop:
        while (true) {
            String nombre = campoNombre.getText();
            String apellido = campoApellido.getText();
            String correo1 = campoCorreo1.getText();
            String correo2 = campoCorreo2.getText();
            String correo3 = campoCorreo3.getText();
            String direccion = campoDireccion.getText();
            int fijo;
            long movil;

            for (int i = 0; i < 10; i++) {
                String a = String.valueOf(i);
                if (nombre.contains(a)) {
                    JOptionPane.showMessageDialog(this, "registrado incorrectamente, el nombre no debe contener numeros");
                    break loop;
                }
            }
            if (nombre.length() < 3 || nombre.length() > 10) {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, nombre no debe tener menos de 3 o más de 10 caracteres");
                break loop;
            }

            for (int i = 0; i < 10; i++) {
                String a = String.valueOf(i);
                if (apellido.contains(a)) {
                    JOptionPane.showMessageDialog(this, "registrado incorrectamente, apellido no debe contener numeros");
                    break loop;
                }
            }
            if (apellido.length() < 3 || apellido.length() > 10) {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, apellido no debe tener menos de 3 o más de 10 caracteres");
                break loop;
            }

            try {
                fijo = Integer.parseInt(campoTelFijo.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ingrese telefono fijo correctamente");
                break;
            }
            try {
                movil = Long.parseLong(campoTelMovil.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ingrese telefono movil correctamente");
                break;
            }

            if (fijo < 1000000 || fijo > 9999999) {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, telefono fijo debe tener 7 digitos");
                break;
            }

            if (movil < 1000000000L || movil > 9999999999L) {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, telefono movil debe tener 10 digitos");
                break;
            }

            if (direccion.length() < 10 || direccion.length() > 30) {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, direccion no debe tener menos de 10 o más de 30 caracteres");
                break;
            }

            if (correo1.contains("@") && correo1.contains(".")) {
                if (correo1.length() < 11 || correo1.length() > 25) {
                    JOptionPane.showMessageDialog(this, "registrado incorrectamente, correo no debe tener menos de 11 o más de 25 caracteres");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, correo debe contener al menos un @ y un punto");
                break;
            }

            if (correo2.contains("@") && correo2.contains(".")) {
                if (correo2.length() < 11 || correo2.length() > 25) {
                    JOptionPane.showMessageDialog(this, "registrado incorrectamente, correo no debe tener menos de 11 o más de 25 caracteres");
                    break;
                }
            } else if (correo2.isEmpty()) {

            } else {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, correo debe contener al menos un @ y un punto");
                break;
            }

            if (correo3.contains("@") && correo3.contains(".")) {
                if (correo3.length() < 11 || correo3.length() > 25) {
                    JOptionPane.showMessageDialog(this, "registrado incorrectamente, correo no debe tener menos de 11 o más de 25 caracteres");
                    break;
                }
            } else if (correo3.isEmpty()) {

            } else {
                JOptionPane.showMessageDialog(this, "registrado incorrectamente, correo debe contener al menos un @ y un punto");
                break;
            }

            ArrayList<String> correo = new ArrayList<>();
            correo.add(correo1);
            if (!correo2.isEmpty()) {
                correo.add(correo2);
            }
            if (!correo3.isEmpty()) {
                correo.add(correo3);
            }
            Contact nuevoContacto = new Contact(nombre, apellido, correo, fijo, movil, direccion);
            if ("Agregar contacto".equals(jPanel1.getToolTipText())) {
                Contact.listaContactos.add(nuevoContacto);
                mainWindow.modelo.addElement(nuevoContacto.getNombre() + " " + nuevoContacto.getApellido());
                JOptionPane.showMessageDialog(this, "registrado correctamente");
            } else if ("Actualizar contacto".equals(jPanel1.getToolTipText())) {
                Contact.listaContactos.set(mainWindow.lista.getSelectedIndex(), nuevoContacto);
                mainWindow.modelo.set(mainWindow.lista.getSelectedIndex(), nuevoContacto.getNombre() + " " + nuevoContacto.getApellido());
                JOptionPane.showMessageDialog(this, "Contacto actualizado correctamente");
            }

            mainWindow.lista.setModel(mainWindow.modelo);
            mainWindow.lista.setEnabled(true);
            this.setVisible(false);
            break;
        }

    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    public void modificarActualizar() {
        this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Contacto"));
        this.jPanel1.setToolTipText("Actualizar contacto");

    }

    public void modificarAgregar() {
        this.jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Contacto"));
        this.jPanel1.setToolTipText("Agregar contacto");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCorreo1;
    private javax.swing.JTextField campoCorreo2;
    private javax.swing.JTextField campoCorreo3;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelFijo;
    private javax.swing.JTextField campoTelMovil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
