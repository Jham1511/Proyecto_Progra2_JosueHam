/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_prg2_josueham;

import java.awt.Color;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SKX Kafei
 */
public class Main extends javax.swing.JFrame {

    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Alumno> alumnos = new ArrayList();
     ArrayList<Maestro> maestros = new ArrayList();
     Registro registro = new Registro("registro", "admin", "Registro", "Activa",  new Date().from(Instant.now()));
    
    public Main() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuRegistro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        TabbedRegistro = new javax.swing.JTabbedPane();
        PanelCRUDAlum = new javax.swing.JPanel();
        CirculoIzq = new javax.swing.JLabel();
        CirculoDer = new javax.swing.JLabel();
        lb_usernameCrud = new javax.swing.JLabel();
        FieldUsernameAlum = new javax.swing.JTextField();
        lb_contra = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        lb_tipo = new javax.swing.JLabel();
        Rbtn_alumno = new javax.swing.JRadioButton();
        Rbtn_maestro = new javax.swing.JRadioButton();
        btn_tipoUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb_estado = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PNAsignarMaes = new javax.swing.JPanel();
        PNMatricularAlum = new javax.swing.JPanel();
        PanelClases = new javax.swing.JPanel();
        FondoUnitec = new javax.swing.JLabel();
        btngrupoUsuarios = new javax.swing.ButtonGroup();
        TabbedPanePrincipal = new javax.swing.JTabbedPane();
        PanelLogIn = new javax.swing.JPanel();
        Portal = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        FieldUsername = new javax.swing.JTextField();
        lb_password = new javax.swing.JLabel();
        PField_Contra = new javax.swing.JPasswordField();
        BtnIngresar = new javax.swing.JButton();
        PanelAyuda = new javax.swing.JPanel();

        MenuRegistro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TabbedRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabbedRegistro.setName(""); // NOI18N

        PanelCRUDAlum.setBackground(new java.awt.Color(96, 150, 180));
        PanelCRUDAlum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CirculoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5886792.png"))); // NOI18N
        PanelCRUDAlum.add(CirculoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CirculoDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5886792.png"))); // NOI18N
        PanelCRUDAlum.add(CirculoDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, -1));

        lb_usernameCrud.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_usernameCrud.setForeground(new java.awt.Color(255, 255, 255));
        lb_usernameCrud.setText("Username");
        PanelCRUDAlum.add(lb_usernameCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 20));
        PanelCRUDAlum.add(FieldUsernameAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, 40));

        lb_contra.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_contra.setForeground(new java.awt.Color(255, 255, 255));
        lb_contra.setText("Contraseña");
        PanelCRUDAlum.add(lb_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));
        PanelCRUDAlum.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 40));

        lb_tipo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        lb_tipo.setForeground(new java.awt.Color(255, 255, 255));
        lb_tipo.setText("Tipo de Usuario");
        PanelCRUDAlum.add(lb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btngrupoUsuarios.add(Rbtn_alumno);
        Rbtn_alumno.setText("Alumno");
        PanelCRUDAlum.add(Rbtn_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        btngrupoUsuarios.add(Rbtn_maestro);
        Rbtn_maestro.setText("Maestro");
        PanelCRUDAlum.add(Rbtn_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        btn_tipoUser.setText("->");
        PanelCRUDAlum.add(btn_tipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Nascimiento");
        PanelCRUDAlum.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        lb_estado.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        lb_estado.setForeground(new java.awt.Color(255, 255, 255));
        lb_estado.setText("Estado de la cuenta");
        PanelCRUDAlum.add(lb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
        PanelCRUDAlum.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 120, 40));

        TabbedRegistro.addTab("CRUD Usuarios", new javax.swing.ImageIcon(getClass().getResource("/agregar-usuario.png")), PanelCRUDAlum); // NOI18N

        javax.swing.GroupLayout PNAsignarMaesLayout = new javax.swing.GroupLayout(PNAsignarMaes);
        PNAsignarMaes.setLayout(PNAsignarMaesLayout);
        PNAsignarMaesLayout.setHorizontalGroup(
            PNAsignarMaesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        PNAsignarMaesLayout.setVerticalGroup(
            PNAsignarMaesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        TabbedRegistro.addTab("Asignar Maestros", new javax.swing.ImageIcon(getClass().getResource("/teacher.png")), PNAsignarMaes); // NOI18N

        javax.swing.GroupLayout PNMatricularAlumLayout = new javax.swing.GroupLayout(PNMatricularAlum);
        PNMatricularAlum.setLayout(PNMatricularAlumLayout);
        PNMatricularAlumLayout.setHorizontalGroup(
            PNMatricularAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        PNMatricularAlumLayout.setVerticalGroup(
            PNMatricularAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        TabbedRegistro.addTab("Matricular Alumnos", new javax.swing.ImageIcon(getClass().getResource("/register.png")), PNMatricularAlum); // NOI18N

        PanelClases.setBackground(new java.awt.Color(96, 150, 180));
        PanelClases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedRegistro.addTab("CRUD Clases", new javax.swing.ImageIcon(getClass().getResource("/atom.png")), PanelClases); // NOI18N

        jPanel1.add(TabbedRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 1060, 420));

        FondoUnitec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo UNITEC.jpeg"))); // NOI18N
        jPanel1.add(FondoUnitec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuRegistro.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelLogIn.setBackground(new java.awt.Color(0, 51, 102));
        PanelLogIn.setForeground(new java.awt.Color(255, 255, 255));
        PanelLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Portal.setFont(new java.awt.Font("Calisto MT", 1, 42)); // NOI18N
        Portal.setForeground(new java.awt.Color(255, 255, 255));
        Portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diamante_resized.png"))); // NOI18N
        Portal.setText("Portal");
        PanelLogIn.add(Portal, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 120, 167, -1));

        lb_username.setForeground(new java.awt.Color(255, 255, 255));
        lb_username.setText("Nombre de Usuario");
        PanelLogIn.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 189, -1, -1));

        FieldUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLogIn.add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 210, 167, 30));

        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Contraseña");
        PanelLogIn.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 268, -1, -1));

        PField_Contra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLogIn.add(PField_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 289, 167, 31));

        BtnIngresar.setBackground(new java.awt.Color(51, 102, 255));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        PanelLogIn.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 354, 167, 39));

        TabbedPanePrincipal.addTab("Iniciar Sesion", PanelLogIn);

        javax.swing.GroupLayout PanelAyudaLayout = new javax.swing.GroupLayout(PanelAyuda);
        PanelAyuda.setLayout(PanelAyudaLayout);
        PanelAyudaLayout.setHorizontalGroup(
            PanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        PanelAyudaLayout.setVerticalGroup(
            PanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        TabbedPanePrincipal.addTab("Ayuda", PanelAyuda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TabbedPanePrincipal)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
       if (FieldUsername.getText().equals(registro.getNombre()) && PField_Contra.getText().equals(registro.getPassword())) {
         abrir_MenuC();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario inexistente");
        }
    }//GEN-LAST:event_BtnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

public void abrir_MenuC(){
    MenuRegistro.pack();
    MenuRegistro.setLocationRelativeTo(this);
    MenuRegistro.setVisible(true);
    this.setVisible(false);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel CirculoDer;
    private javax.swing.JLabel CirculoIzq;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JTextField FieldUsernameAlum;
    private javax.swing.JLabel FondoUnitec;
    private javax.swing.JDialog MenuRegistro;
    private javax.swing.JPasswordField PField_Contra;
    private javax.swing.JPanel PNAsignarMaes;
    private javax.swing.JPanel PNMatricularAlum;
    private javax.swing.JPanel PanelAyuda;
    private javax.swing.JPanel PanelCRUDAlum;
    private javax.swing.JPanel PanelClases;
    private javax.swing.JPanel PanelLogIn;
    private javax.swing.JLabel Portal;
    private javax.swing.JRadioButton Rbtn_alumno;
    private javax.swing.JRadioButton Rbtn_maestro;
    private javax.swing.JTabbedPane TabbedPanePrincipal;
    private javax.swing.JTabbedPane TabbedRegistro;
    private javax.swing.JButton btn_tipoUser;
    private javax.swing.ButtonGroup btngrupoUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_contra;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JLabel lb_username;
    private javax.swing.JLabel lb_usernameCrud;
    // End of variables declaration//GEN-END:variables
}
