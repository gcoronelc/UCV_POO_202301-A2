
package pe.edu.ucv.eurekabank.view;

import java.util.List;
import pe.edu.ucv.eurekabank.controller.ComboController;
import pe.edu.ucv.eurekabank.controller.EurekaController;
import pe.edu.ucv.eurekabank.model.Cliente;
import pe.edu.ucv.eurekabank.model.Combo;
import pe.edu.ucv.eurekabank.model.Cuenta;
import pe.edu.ucv.eurekabank.util.Mensaje;
import pe.edu.ucv.eurekabank.util.Session;


public class CrearCuentaView extends javax.swing.JInternalFrame {

	private Cliente  cliente = null;
	
	public CrearCuentaView() {
		initComponents();
		llenarCombo();
	}
	
	private void llenarCombo(){
		ComboController controller = new ComboController();
		List<Combo> lista = controller.getMonedas();
		for(Combo item:lista){
			System.out.println(item);
			cboMoneda.addItem(item);
		}
		cboMoneda.setSelectedIndex(-1);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      btnProcesar = new javax.swing.JButton();
      btnCancelar = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      txtCliente = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      txtImporte = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      txtClave = new javax.swing.JPasswordField();
      cboMoneda = new javax.swing.JComboBox<>();
      jButton1 = new javax.swing.JButton();

      setClosable(true);
      setMaximizable(true);
      setTitle("Crear nueva cuenta");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

      btnProcesar.setBackground(new java.awt.Color(153, 255, 204));
      btnProcesar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      btnProcesar.setText("Procesar");
      btnProcesar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnProcesarActionPerformed(evt);
         }
      });

      btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      btnCancelar.setText("Cancelar");
      btnCancelar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCancelarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(19, 19, 19)
            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(438, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(21, Short.MAX_VALUE))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel1.setText("Cliente");

      txtCliente.setBackground(java.awt.SystemColor.controlHighlight);
      txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      txtCliente.setDisabledTextColor(new java.awt.Color(0, 51, 204));
      txtCliente.setEnabled(false);
      txtCliente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtClienteActionPerformed(evt);
         }
      });

      jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel2.setText("Moneda");

      jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel3.setText("Importe de apertura");

      txtImporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

      jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel4.setText("Clave");

      txtClave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

      cboMoneda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      cboMoneda.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cboMonedaActionPerformed(evt);
         }
      });

      jButton1.setBackground(java.awt.SystemColor.activeCaption);
      jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jButton1.setText("Buscar");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(cboMoneda, javax.swing.GroupLayout.Alignment.LEADING, 0, 366, Short.MAX_VALUE)
                  .addComponent(txtImporte, javax.swing.GroupLayout.Alignment.LEADING)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(61, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    this.dispose();
  }//GEN-LAST:event_btnCancelarActionPerformed

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    try {
			// Datos
			Cuenta cuenta = new Cuenta();
			cuenta.setCliente(cliente.getCodigo());
			cuenta.setMoneda(((Combo)cboMoneda.getSelectedItem()).getCodigo());
			cuenta.setSaldo(Double.parseDouble(txtImporte.getText()));
			cuenta.setClave(String.valueOf(txtClave.getPassword()));
			// Proceso
			EurekaController control = new EurekaController();
			cuenta = control.procesar(cuenta);
			Mensaje.info(null, "Cuenta creada: " + cuenta.getCuenta());
			
		} catch (Exception e) {
			Mensaje.error(null, e.getMessage());
		}
  }//GEN-LAST:event_btnProcesarActionPerformed

   private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtClienteActionPerformed

   private void cboMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMonedaActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_cboMonedaActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Session.put("cliente", null);
		BuscarClienteDigl view = new BuscarClienteDigl(null, true);
		view.setVisible(true);
		if(Session.get("cliente") == null){
			return;
		}
		cliente = (Cliente) Session.get("cliente");
		txtCliente.setText( cliente.getNombre() + ", " + cliente.getPaterno() + " " + cliente.getMaterno() );		
   }//GEN-LAST:event_jButton1ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnCancelar;
   private javax.swing.JButton btnProcesar;
   private javax.swing.JComboBox<Combo> cboMoneda;
   private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPasswordField txtClave;
   private javax.swing.JTextField txtCliente;
   private javax.swing.JTextField txtImporte;
   // End of variables declaration//GEN-END:variables
}
