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
public class VentanaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaTriangulo
     */
    public VentanaTriangulo() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolverTriangulo = new javax.swing.JButton();
        btnSalirTriangulo = new javax.swing.JButton();
        txtLado1Triangulo = new javax.swing.JTextField();
        txtLado2Triangulo = new javax.swing.JTextField();
        txtBaseTriangulo = new javax.swing.JTextField();
        txtAlturaTriangulo = new javax.swing.JTextField();
        btnCalcularTriangulo = new javax.swing.JButton();
        lblAreaTriangulo = new javax.swing.JLabel();
        lblPerimetroTriangulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TRINGULO");

        jLabel2.setText("LADO 1:");

        jLabel3.setText("LADO 2:");

        jLabel4.setText("BASE:");

        jLabel5.setText("ALTURA:");

        jLabel6.setText("AREA:");

        jLabel7.setText("PERIMETRO:");

        btnVolverTriangulo.setText("VOLVER");
        btnVolverTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverTrianguloActionPerformed(evt);
            }
        });

        btnSalirTriangulo.setText("SALIR");
        btnSalirTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTrianguloActionPerformed(evt);
            }
        });

        btnCalcularTriangulo.setText("CALCULAR");
        btnCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnCalcularTriangulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolverTriangulo)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLado1Triangulo)
                            .addComponent(txtBaseTriangulo)
                            .addComponent(txtAlturaTriangulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblAreaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPerimetroTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60)
                .addComponent(btnSalirTriangulo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(lblPerimetroTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcularTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirTriangulo)
                    .addComponent(btnVolverTriangulo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTrianguloActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirTrianguloActionPerformed

    private void btnVolverTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverTrianguloActionPerformed
          dispose ();
        Figuras.Titulo.setVisible(true);
    }//GEN-LAST:event_btnVolverTrianguloActionPerformed

    private void btnCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloActionPerformed
        double lado1 = Double.parseDouble(txtLado1Triangulo.getText());
        double lado2 = Double.parseDouble(txtLado2Triangulo.getText());
        double base =Double.parseDouble(txtBaseTriangulo.getText());
        double altura = Double.parseDouble(txtAlturaTriangulo.getText());
        
        FigurasInterfaz fi; 
        
        fi = new Triangulo(lado1,lado2,base,altura);
        lblPerimetroTriangulo.setText(""+fi.calcularPerimetro());
        lblAreaTriangulo.setText(""+fi.calcularArea());
        txtLado1Triangulo.setText("");
        txtLado2Triangulo.setText("");
        txtBaseTriangulo.setText("");
        txtAlturaTriangulo.setText("");
        
        
    }//GEN-LAST:event_btnCalcularTrianguloActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularTriangulo;
    private javax.swing.JButton btnSalirTriangulo;
    private javax.swing.JButton btnVolverTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAreaTriangulo;
    private javax.swing.JLabel lblPerimetroTriangulo;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado1Triangulo;
    private javax.swing.JTextField txtLado2Triangulo;
    // End of variables declaration//GEN-END:variables
}
