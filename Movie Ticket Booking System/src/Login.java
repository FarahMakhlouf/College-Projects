import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Login extends javax.swing.JFrame 
{
    private Component frame;
    static List<Customer> customers = new ArrayList<>();
    static Customer Current_Customer;
    static int CurrentCustomerIndex=0;
    
    public Login() 
    {
       initComponents();   
       customers =Customer.LoadCustomers();
    }
    
    public boolean CustomerLogin(String Name,String Password)
    {
        for(int i=0;i<customers.size();i++)
            {
                if (customers.get(i).getUsername().equals(Name) && customers.get(i).getPassword().equals(Password))
                {      
                    Current_Customer = customers.get(i);
                    CurrentCustomerIndex = i;
                    return true;
                }
            }
        return false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        already = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Ticket Booking System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Movie Ticket Booking System");

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 38)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-documentary-80.png"))); // NOI18N
        jLabel5.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        jPanel2.setLayout(null);

        Register.setBackground(new java.awt.Color(255, 204, 204));
        Register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("Click here to Create new Account");
        Register.setContentAreaFilled(false);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(Register);
        Register.setBounds(252, 372, 336, 36);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png"))); // NOI18N
        jLabel1.setLabelFor(jLabel3);
        jLabel1.setText("Username");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(132, 24, 144, 48);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        jLabel2.setText("  Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(144, 84, 144, 48);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        jLabel3.setText("  Email");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(144, 144, 110, 48);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        jLabel4.setText("  Contact no.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(144, 204, 156, 48);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(312, 96, 264, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 0, 0));
        jTextField1.setToolTipText("");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(312, 36, 264, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(jTextField3);
        jTextField3.setBounds(312, 156, 264, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(jTextField4);
        jTextField4.setBounds(312, 216, 264, 30);

        OK.setBackground(new java.awt.Color(255, 204, 204));
        OK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OK.setForeground(new java.awt.Color(255, 255, 255));
        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        OK.setText("Enter");
        OK.setContentAreaFilled(false);
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        jPanel2.add(OK);
        OK.setBounds(655, 324, 144, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card.png"))); // NOI18N
        jLabel8.setText("  Card Number");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(144, 276, 168, 36);

        jTextField5.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(jTextField5);
        jTextField5.setBounds(312, 276, 264, 30);

        already.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        already.setForeground(new java.awt.Color(255, 255, 255));
        already.setText("Already have an account");
        already.setContentAreaFilled(false);
        already.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alreadyActionPerformed(evt);
            }
        });
        jPanel2.add(already);
        already.setBounds(276, 336, 288, 36);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 828, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        this.jLabel1.setVisible(true);
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jTextField5.setVisible(true);
        this.jLabel8.setVisible(true);
        this.jTextField1.setVisible(true);
        this.jPasswordField1.setVisible(true);
        this.jTextField3.setVisible(true);
        this.jTextField4.setVisible(true);
        this.Register.setVisible(false);
        this.already.setVisible(true);
        
    }//GEN-LAST:event_RegisterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       //labels
        this.jLabel1.setVisible(true);
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel8.setVisible(false);
        //textboxs            
        this.jTextField1.setVisible(true);
        this.jPasswordField1.setVisible(true);
        this.jTextField3.setVisible(false);
        this.jTextField4.setVisible(false);
        this.jTextField5.setVisible(false); 
        this.Register.setVisible(true);
                this.already.setVisible(false);

                       
    }//GEN-LAST:event_formWindowOpened

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        City city;
        String Name = this.jTextField1.getText();
        String Password = this.jPasswordField1.getText();
        String Email = this.jTextField3.getText();
        String ContactNo = this.jTextField4.getText();
        String Card_Number=this.jTextField5.getText();
        List<Payment> Payments=new ArrayList<>();
        if (this.jLabel3.isVisible())
        {                      
            boolean found=false;
            for (int i=0;i<customers.size();i++)            
                if (Name.equals(customers.get(i).getUsername()))
                    found=true;
                        
            if (Name.equals("") || Password.equals("") || Email.equals("") || ContactNo.equals(""))
                JOptionPane.showMessageDialog(frame,"Please enter all details!","Warning",JOptionPane.WARNING_MESSAGE);
            else if (found)              
                JOptionPane.showMessageDialog(frame,"Account exists Please Try Another Username","Error",JOptionPane.ERROR_MESSAGE);
            else
            {                
                try {
                    Customer c = new Customer(Name,Password,Email,ContactNo,Card_Number,Payments);
                    customers.add(c);
                    CurrentCustomerIndex = customers.size() -1;
                    Customer.SaveCustomers(customers);
                    Current_Customer=c;
                    JOptionPane.showMessageDialog(frame,"Registered","Succeeded",JOptionPane.INFORMATION_MESSAGE);
                    city=new City();
                    this.hide();
                    city.show();
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }                    
        }
        else if (!this.jLabel3.isVisible())
        {
            boolean LoggedIn = CustomerLogin(Name, Password);           
        if (LoggedIn)
        {
                try {
                    city=new City();
                    this.hide();
                    city.show();
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else        
           JOptionPane.showMessageDialog(frame,"Username/Password is incorrect","Error",JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_OKActionPerformed

    private void alreadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alreadyActionPerformed
        formWindowOpened(null);
    }//GEN-LAST:event_alreadyActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JButton Register;
    private javax.swing.JButton already;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
