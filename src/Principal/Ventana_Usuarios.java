/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Joel Ludeña & Francisco Aguirre
 */
public class Ventana_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Usuarios
     */
    public static Statement estSQL=null;
    public Ventana_Usuarios() {
        initComponents();
        insertImage();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/icono.png"));
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Equipo -  Usuarios");
        this.setResizable(false);
        if(!SplashSc.cerrar2())
        {
            cerrar();
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

        panelMain = new javax.swing.JPanel();
        btnJugadores = new javax.swing.JButton();
        btnGerente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJugadores.setBackground(new java.awt.Color(255, 255, 255));
        btnJugadores.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/jugador.jpg"))); // NOI18N
        btnJugadores.setText("Jugadores");
        btnJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadoresActionPerformed(evt);
            }
        });

        btnGerente.setBackground(new java.awt.Color(255, 255, 255));
        btnGerente.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/admi.jpg"))); // NOI18N
        btnGerente.setText("Gerente Deportivo");
        btnGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setText("Gestión del Equipo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/i1.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(450, 371));

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(261, 261, 261))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnGerente)
                        .addGap(65, 65, 65)
                        .addComponent(btnJugadores))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenteActionPerformed
        Login dialog=new Login(new javax.swing.JFrame(),true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
        if(Login.user.equals("G1"))
        {
            JOptionPane.showMessageDialog(null,"Bienvenido a la sección de "+Login.user);
            Ventana_Opciones vtn=new Ventana_Opciones();
            vtn.setVisible(true);
        }
        else
        {
              JOptionPane.showMessageDialog(null, "ERROR: Usuario/Clave Incorrecto", "Mesaje Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGerenteActionPerformed

    private void btnJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadoresActionPerformed
        Login dialog=new Login(new javax.swing.JFrame(),true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
        if(Login.user.equals("Player1"))
        {
            JOptionPane.showMessageDialog(null,"Bienvenido a la sección de "+Login.user);
            Ventana_Opciones vtn=new Ventana_Opciones();
            vtn.setVisible(true);
        }
        else
        {
              JOptionPane.showMessageDialog(null, "ERROR: Usuario/Clave Incorrecto", "Mesaje Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnJugadoresActionPerformed
    public void cerrar()
    {
        try
        {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter ()
            {
                public void windowClosing(WindowEvent e)
                {
                    confirmarSalida();
                }
            });        
        this.setVisible(true);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
     public void confirmarSalida()
    {
        int valor=JOptionPane.showConfirmDialog(this,"¿Esta seguro de cerrar la Ventana?","Advertencia",JOptionPane.YES_NO_OPTION);
        if(valor==0)
        {
            JOptionPane.showMessageDialog(null, "Hasta Pronto...","Gracias",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    public void insertImage()
    {
        ImagePanel Imagen = new ImagePanel();
        panelMain.add(Imagen);
        panelMain.repaint();
    }
    public class ImagePanel extends JPanel 
    {
        public ImagePanel()
        {
            //Se crea un método cuyo parámetro debe ser un objeto Graphics
            this.setSize(810,540);
        }
        @Override
        public void paint(Graphics grafico)
        {
            Dimension height = getSize();
            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/Img/fondoMain2.jpg")); 
            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Thread(new SplashSc()).start();
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
            java.util.logging.Logger.getLogger(Ventana_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerente;
    private javax.swing.JButton btnJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
