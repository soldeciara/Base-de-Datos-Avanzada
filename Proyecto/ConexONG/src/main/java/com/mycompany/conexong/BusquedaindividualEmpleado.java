/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conexong;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;


public class BusquedaindividualEmpleado extends javax.swing.JFrame {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public BusquedaindividualEmpleado() {
        initComponents();
        this.setTitle("BASE DE DATOS ONG HILO ROJO");
        connectToMongoDB();
        this.setLocationRelativeTo(null);
    }
    
    String Item2="";
    private void connectToMongoDB() {
             try {
            MongoClientURI uri = new MongoClientURI("mongodb+srv://ONG:12345@ong.nskhjqm.mongodb.net/?retryWrites=true&w=majority");
            mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase("OngHiloRojo");
            collection = database.getCollection("Empleado");
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BUSCAR = new javax.swing.JButton();
        dato = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Búsqueda Individual");

        jComboBox1.setBackground(new java.awt.Color(255, 153, 51));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CRITERIOS", "DNI", "NOMBRES", "APELLIDOS" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(255, 153, 51));
        BUSCAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BUSCAR.setText("Buscar");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Información de los Empleados");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HiloRojologo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButton2.setText("ATRÁS");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 31, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       Item2 = jComboBox1.getSelectedItem().toString();       
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public static boolean validarDNI(String dni) {
        // Verificar que el DNI tenga 8 dígitos
        if (dni.length() != 8) {
            return false;
        }

        // Verificar que todos los caracteres sean dígitos
        for (int i = 0; i < dni.length(); i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarNombre(String nombre) {
         // Verificar que el texto no esté vacío
        if (nombre.isEmpty()) {
            return false;
        }
        
        // Verificar que todos los caracteres sean letras o espacios en blanco
        for (char c : nombre.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        
        // El texto contiene solo letras y espacios en blanco
        return true;
    }    
    
    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
            // TODO add your handling code here:
        if(Item2 == "DNI"){
            String D=dato.getText();
            System.out.println(D);

            int num = 1;
            if (validarDNI(D) != false)
            {  
                //Document result = collection.find(query).first();
                
                Document query = new Document("dniEmp", D);
                Document result = collection.find(query).first();
                int elimina = result.getInteger("elimlogica");

                if (result != null && elimina==1)
                {
                    // Usuario válido, iniciar sesión
                    System.out.println("Búsqueda exitosa");
                    JOptionPane.showMessageDialog(null,"¡Búsqueda exitosa!");
                    
                    String dni4 = result.getString("dniEmp");   
                    String nombre4 = result.getString("nombreEm");
                    String apellido4 = result.getString("apellidoEm");
                    int edad4 = result.getInteger("edadEm");
                    String cargo4 = result.getString("cargoEm");
                    String telefono = result.getString("telefEm");
                    String calle = result.getString("calleEm");
                    String distrito = result.getString("distritoEm");
                    String provincia = result.getString("provinciaEm");
                    String fechaini = result.getString("fechaIniEm");
                    String fechafin = result.getString("fechaSaliEm");

                                        
                    ResultBusqIndividualEmpleado nuevo = new ResultBusqIndividualEmpleado(dni4,nombre4,apellido4,edad4,cargo4,telefono,calle,distrito,provincia,fechaini,fechafin);
                    nuevo.setVisible(true);                   
                    this.setVisible(false);
                } else {
                    // Usuario no válido, mostrar mensaje de error
                    System.out.println("No existe empleado con dicho DNI");
                    JOptionPane.showMessageDialog(null,"No existe empleado con dicho DNI o ya ha sido eliminado");
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"¡Ingrese un DNI correcto (8 digitos y números)");
            }   
        } 
        if("NOMBRES".equals(Item2)){
            String D=dato.getText();
            System.out.println(D);

            if (validarNombre(D) != false)
            {  
                //Document result = collection.find(query).first();
                Document query = new Document("nombreEm", D);
                Document result = collection.find(query).first();  
                if (result != null)
                {
                    // Usuario válido, iniciar sesión
                    System.out.println("Búsqueda exitosa");
                    JOptionPane.showMessageDialog(null,"¡Búsqueda exitosa!");
                    
                    String dni4 = result.getString("dniEmp");   
                    String nombre4 = result.getString("nombreEm");
                    String apellido4 = result.getString("apellidoEm");
                    int edad4 = result.getInteger("edadEm");
                    String cargo4 = result.getString("cargoEm");
                    String telefono = result.getString("telefEm");
                    String calle = result.getString("calleEm");
                    String distrito = result.getString("distritoEm");
                    String provincia = result.getString("provinciaEm");
                    String fechaini = result.getString("fechaIniEm");
                    String fechafin = result.getString("fechaSaliEm");

                                        
                    ResultBusqIndividualEmpleado nuevo = new ResultBusqIndividualEmpleado(dni4,nombre4,apellido4,edad4,cargo4,telefono,calle,distrito,provincia,fechaini,fechafin);
                    nuevo.setVisible(true);                   
                    this.setVisible(false);
                } else {
                    // Usuario no válido, mostrar mensaje de error
                    System.out.println("No existe empleado con dicho NOMBRE");
                    JOptionPane.showMessageDialog(null,"No existe empleado con dicho NOMBRE");
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"¡Ingrese un NOMBRE correcto (Solo letras)");
            }   
        }
        if("APELLIDOS".equals(Item2)){
            String D=dato.getText();
            System.out.println(D);

            if (validarNombre(D) != false)
            {  
                //Document result = collection.find(query).first();
                Document query = new Document("apellidoEm", D);
                Document result = collection.find(query).first();  
                if (result != null)
                {
                    // Usuario válido, iniciar sesión
                    System.out.println("Búsqueda exitosa");
                    JOptionPane.showMessageDialog(null,"¡Búsqueda exitosa!");
                    
                    String dni4 = result.getString("dniEmp");   
                    String nombre4 = result.getString("nombreEm");
                    String apellido4 = result.getString("apellidoEm");
                    int edad4 = result.getInteger("edadEm");
                    String cargo4 = result.getString("cargoEm");
                    String telefono = result.getString("telefEm");
                    String calle = result.getString("calleEm");
                    String distrito = result.getString("distritoEm");
                    String provincia = result.getString("provinciaEm");
                    String fechaini = result.getString("fechaIniEm");
                    String fechafin = result.getString("fechaSaliEm");

                                        
                    ResultBusqIndividualEmpleado nuevo = new ResultBusqIndividualEmpleado(dni4,nombre4,apellido4,edad4,cargo4,telefono,calle,distrito,provincia,fechaini,fechafin);
                    nuevo.setVisible(true);                   
                    this.setVisible(false);
                } else {
                    // Usuario no válido, mostrar mensaje de error
                    System.out.println("No existe empleado con esos APELLIDOS");
                    JOptionPane.showMessageDialog(null,"No existe empleado con esos APELLIDOS");
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"¡Ingrese APELLIDOS correcto (Solo letras)");
            }   
        } 
    }//GEN-LAST:event_BUSCARActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Empleado acceso = new Empleado();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(BusquedaindividualEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaindividualEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaindividualEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaindividualEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaindividualEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BUSCAR;
    public static javax.swing.JTextField dato;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
