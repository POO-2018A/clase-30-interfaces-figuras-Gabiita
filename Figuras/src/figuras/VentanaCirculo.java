/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Usuario
 */
public class VentanaCirculo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCirculo
     */
    public VentanaCirculo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        btnVolverCirculo = new javax.swing.JButton();
        btnSalirCirculo = new javax.swing.JButton();
        btnCalcularCirculo = new javax.swing.JButton();
        lblAreaCirculo = new javax.swing.JLabel();
        lblPerimetroCirculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CIRCULO");

        jLabel2.setText("Radio:");

        jLabel3.setText("AREA");

        jLabel4.setText("PERIMETRO");

        txtRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioActionPerformed(evt);
            }
        });

        btnVolverCirculo.setText("VOLVER");
        btnVolverCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCirculoActionPerformed(evt);
            }
        });

        btnSalirCirculo.setText("SALIR");
        btnSalirCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCirculoActionPerformed(evt);
            }
        });

        btnCalcularCirculo.setText("CALCULAR");
        btnCalcularCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCirculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcularCirculo)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVolverCirculo)
                            .addComponent(txtRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblAreaCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPerimetroCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirCirculo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lblAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblPerimetroCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnCalcularCirculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirCirculo)
                    .addComponent(btnVolverCirculo)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadioActionPerformed

    private void btnSalirCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCirculoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirCirculoActionPerformed

    private void btnVolverCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCirculoActionPerformed
          dispose ();
        Figuras.Titulo.setVisible(true);
    }//GEN-LAST:event_btnVolverCirculoActionPerformed

    private void btnCalcularCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCirculoActionPerformed
       double radio= Double.parseDouble(txtRadio.getText());
       FigurasInterfaz fi;
       
       fi = new Circulo(radio);
       
        lblPerimetroCirculo.setText(""+fi.calcularPerimetro());
        lblAreaCirculo.setText(""+fi.calcularArea());
        txtRadio.setText("");
        
       
    }//GEN-LAST:event_btnCalcularCirculoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCirculo;
    private javax.swing.JButton btnSalirCirculo;
    private javax.swing.JButton btnVolverCirculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAreaCirculo;
    private javax.swing.JLabel lblPerimetroCirculo;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
