import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Theater_Info extends javax.swing.JFrame 
{
    Movie CurrMovie;
    String CurrTheater;
    int TheaterIndex;
    int MovieIndex;
    int CurrShowIndex;
    public Theater_Info() 
    {
        initComponents();
    }
    public Theater_Info(int MovieIndex,int TheaterIndex)
    {
        initComponents();
        this.MovieIndex=MovieIndex;
        this.TheaterIndex=TheaterIndex;
        CurrMovie=City.Movies.get(MovieIndex);
        L_MovieName.setText(CurrMovie.getMovie_Name());
        L_TheaterName.setText(CurrMovie.getTheaters().get(TheaterIndex).getTheater_Name());
        username.setText(Login.Current_Customer.getUsername());
    }

    public boolean CheckShow(String Time,String Type)
    {
        boolean Flag=false;
        String Time1=new String();
        String Type1=new String();
        for(int i=0;i<City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().size();i++)
        {
            Time1=City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(i).getTime();
            Type1=City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(i).getType();
            if(Time1.equals(Time) && Type1.equals(Type))
            {
                CurrShowIndex=i;
                Flag=true;
                break;
            }
        }
        return Flag;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        L_MovieName = new javax.swing.JLabel();
        L_TheaterName = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Num_Tickets = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        Available_Tickets = new javax.swing.JLabel();
        Choose = new javax.swing.JLabel();
        Check_Out = new javax.swing.JButton();
        _R = new javax.swing.JRadioButton();
        _3D = new javax.swing.JRadioButton();
        _4D = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Movie Ticket Booking System");

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-arrow-32.png"))); // NOI18N
        Back.setText("Back");
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        L_MovieName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        L_MovieName.setText("Movie_Name");

        L_TheaterName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        L_TheaterName.setText("Theater_Name");

        username.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/_username_login_1172613.png"))); // NOI18N
        username.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(L_MovieName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(username))
                            .addComponent(L_TheaterName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(L_MovieName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_TheaterName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );

        jPanel3.setLayout(null);

        Num_Tickets.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jPanel3.add(Num_Tickets);
        Num_Tickets.setBounds(300, 239, 63, 36);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Number of Tickets");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(132, 252, 136, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Movie Type");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(132, 156, 85, 19);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Available Tickets");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(132, 204, 128, 19);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10AM", "1PM", "4PM", "7PM", "10PM", "1AM" }));
        jComboBox1.setSelectedIndex(-1);
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(300, 108, 216, 22);

        Available_Tickets.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Available_Tickets.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Available_Tickets);
        Available_Tickets.setBounds(300, 204, 29, 16);

        Choose.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Choose.setForeground(new java.awt.Color(255, 255, 255));
        Choose.setText("Choose Time");
        Choose.setToolTipText("");
        jPanel3.add(Choose);
        Choose.setBounds(132, 108, 99, 19);

        Check_Out.setText("Check Out");
        Check_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_OutActionPerformed(evt);
            }
        });
        jPanel3.add(Check_Out);
        Check_Out.setBounds(552, 288, 108, 36);

        _R.setBackground(new java.awt.Color(0, 0, 0));
        _R.setForeground(new java.awt.Color(255, 255, 255));
        _R.setText("Regular");
        _R.setContentAreaFilled(false);
        _R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _RActionPerformed(evt);
            }
        });
        jPanel3.add(_R);
        _R.setBounds(300, 156, 73, 25);

        _3D.setBackground(new java.awt.Color(0, 0, 0));
        _3D.setForeground(new java.awt.Color(255, 255, 255));
        _3D.setText("3D");
        _3D.setContentAreaFilled(false);
        _3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3DActionPerformed(evt);
            }
        });
        jPanel3.add(_3D);
        _3D.setBounds(384, 156, 48, 25);

        _4D.setBackground(new java.awt.Color(0, 0, 0));
        _4D.setForeground(new java.awt.Color(255, 255, 255));
        _4D.setText("4D");
        _4D.setContentAreaFilled(false);
        _4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4DActionPerformed(evt);
            }
        });
        jPanel3.add(_4D);
        _4D.setBounds(444, 156, 43, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 852, 396);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3DActionPerformed
       
            String T=jComboBox1.getSelectedItem().toString();
            boolean S;
            int Max;
            S = CheckShow(T,"3D");
            if(S)
            {
                Max = City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex).getNum_Of_Seats();
                Available_Tickets.setText(String.valueOf(City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex).getNum_Of_Seats()));
            }
            else
            {
                Max = 30;
                Available_Tickets.setText("30");
            }
            SpinnerModel model = new SpinnerNumberModel(0,0,Max,1);
            Num_Tickets.setModel(model);
    }//GEN-LAST:event__3DActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ButtonGroup bG = new ButtonGroup();
        bG.add(this._R);
        bG.add(this._3D);
        bG.add(this._4D);
        
    }//GEN-LAST:event_formWindowOpened

    private void _RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__RActionPerformed
        
        
            String T=jComboBox1.getSelectedItem().toString();
            boolean S;
            int Max;
            S = CheckShow(T,"Regular");
            if(S)
            {
                Max=City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex).getNum_Of_Seats();
                Available_Tickets.setText(String.valueOf(City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex).getNum_Of_Seats()));
            }
            else
            {
                Max = 30;
                Available_Tickets.setText("30");
            }
            SpinnerModel model = new SpinnerNumberModel(0,0,Max,1);
            Num_Tickets.setModel(model);
        
    }//GEN-LAST:event__RActionPerformed

    private void _4DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4DActionPerformed
        
            String T=jComboBox1.getSelectedItem().toString();
            boolean S;
            int Max;
            S = CheckShow(T,"4D");
            if(S)
            {
                Max = City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex).getNum_Of_Seats();
                Available_Tickets.setText(String.valueOf(City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex).getNum_Of_Seats()));
            }
            else
            {
                Max = 30;
                Available_Tickets.setText("30");
            }
            SpinnerModel model = new SpinnerNumberModel(0,0,Max,1);
            Num_Tickets.setModel(model);
        
    }//GEN-LAST:event__4DActionPerformed

    private void Check_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_OutActionPerformed

        if (!(jComboBox1.getSelectedItem() == null || (!_R.isSelected() && !_3D.isSelected() && !_4D.isSelected()) || Integer.valueOf(Num_Tickets.getValue().toString()) == 0))
        {                    
        try {
            // TODO add your handling code here:
            int NumTickets=Integer.valueOf(Num_Tickets.getValue().toString());
            String Time2=jComboBox1.getSelectedItem().toString();
            String Type= new String("");
            if (this._R.isSelected())
                Type = this._R.getText();
            if (this._3D.isSelected())
                Type = this._3D.getText();
            if (this._4D.isSelected())
                Type = this._4D.getText();
            boolean x = CheckShow(Time2,Type);
            List <Movie> LM = City.Movies;
            if (CheckShow(Time2,Type))
            {
                Show S = LM.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().get(CurrShowIndex);
                S.Num_Of_Seats = S.Num_Of_Seats - NumTickets;
                LM.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().set(CurrShowIndex, S);
            }
            else
            {
                Show S1 = new Show(Time2, Type,(30-NumTickets));
                LM.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().add(S1);
                CurrShowIndex = City.Movies.get(MovieIndex).getTheaters().get(TheaterIndex).getShows().size()-1;
            }
            City.Movies = LM;
            Movie.SaveMovies(City.Movies);
            Payment_Info P=new Payment_Info(MovieIndex,TheaterIndex,CurrShowIndex,Integer.valueOf(Num_Tickets.getValue().toString()));
            this.hide();
            P.show();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Theater_Info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Theater_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else
        {
            JOptionPane.showMessageDialog(this,"Please Fill all details!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Check_OutActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Movie_Info Frame=new Movie_Info(MovieIndex);
        this.hide();
        Frame.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Theater_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Theater_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Theater_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Theater_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Theater_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Available_Tickets;
    private javax.swing.JButton Back;
    private javax.swing.JButton Check_Out;
    private javax.swing.JLabel Choose;
    private javax.swing.JLabel L_MovieName;
    private javax.swing.JLabel L_TheaterName;
    private javax.swing.JSpinner Num_Tickets;
    private javax.swing.JRadioButton _3D;
    private javax.swing.JRadioButton _4D;
    private javax.swing.JRadioButton _R;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
