/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ctrlCodigos;
import modelo.Codigos;

/**
 *
 * @author Bryan
 */
public class frmCodigos extends javax.swing.JFrame {

    /**
     * Creates new form frmCodigos
     */
    public frmCodigos() {
        initComponents();
    }

    
    
    
    
     //Creo un init con mis modelo(s), vista(s) y controladore(s) ¿para mostrar la pantalla?
    public static void initFrmCodigos(){
        Codigos modelo = new Codigos();
        frmCodigos vista = new frmCodigos();
        ctrlCodigos controlador  = new ctrlCodigos(modelo, vista);
        
        vista.setVisible(true);
    }
    // !!!!Cambios abajo!!!!
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTipoCodigo = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnElimnar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCodigos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtTipoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 529, 55));
        jPanel1.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 529, 55));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 106, 529, 55));

        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 120, 50));

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 50));

        btnElimnar.setText("Eliminar");
        jPanel1.add(btnElimnar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 50));

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 120, 50));

        jtbCodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbCodigos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 780, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Codigos de estudiantes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        Nombre.setText("Carnet");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        Nombre1.setText("Nombre");
        jPanel1.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        Nombre2.setText("Tipo codigo");
        jPanel1.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        Nombre3.setText("Tipo codigo");
        jPanel1.add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmCodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    // !!!Quito el "initnew frmCodigos().setVisible(true);" y pongo el init de arriba
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initFrmCodigos();
            }
        });
    }
    //!!!Va abajo (o adentro de) public void run(){

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnElimnar;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtbCodigos;
    public javax.swing.JTextField txtCarnet;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTipoCodigo;
    // End of variables declaration//GEN-END:variables
}
