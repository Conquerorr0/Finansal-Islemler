import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class NewJFrame extends javax.swing.JFrame {

    //Kullanıcının bilgileri
    private static String user_id, user_name, user_last_name;
    private static double user_balance, user_income, user_debt;
    
    public NewJFrame() {
        initComponents();
        setTitle("Finansal Cüzdan Uygulaması");
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        showEntranceMessage();
    }
    
    //Nested sınıfın nesneleri
    Users users;
    Users.User user;
    
    
    public void user(){
        //Mysql bağlantıları
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM user");
            
            
            resultSet.next();
            
            //Değişkenlere veritabanının kolonlarından çektiğimiz bilgileri atıyoruz
            user_id = resultSet.getString("user_id");
            user_name = resultSet.getString("user_name");
            user_last_name = resultSet.getString("user_last_name");
            user_balance = Integer.parseInt(resultSet.getString("user_balance"));
            user_income = Integer.parseInt(resultSet.getString("user_income"));
            user_debt = Integer.parseInt(resultSet.getString("user_debt"));
            
            //Users sınıfının iç sınıfı olan user sınıfının constructorını çağırdık
            users = new Users();
            user = users.new User(user_id, user_name, user_last_name, user_balance,user_income, user_debt);
            
            //Labellerda Bakiye ve borcu gösterdik
            lblBalance.setText("Bakiye: " + users.getBalance());
            lblDebt.setText("Borçlar: " + users.getDebt());
            
        } catch (SQLException e) {
            dbHelper.showError(e);
        }
        finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        
    }
    
    //Thread.sleep ile hoşgeldiniz mesajı labelının x koordinatını kaydırıyoruz
    int x = -100;
    public void showEntranceMessage() {
        
        int y = lblMesaj.getY();
        
        //MySql bağlantısının olduğu metot
        user();
        lblMesaj.setText("Hoş Geldin " + user_name + " " + user_last_name);
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    for(int i = 0; i < 120; i++){
                        Thread.sleep(10);
                        x += 1;                        lblMesaj.setLocation(x, y);
                    }
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        };
        thread.start();

        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHesaplar = new javax.swing.JButton();
        btnAlacaklar = new javax.swing.JButton();
        btnBorclar = new javax.swing.JButton();
        lblMesaj = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblDebt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnHesaplar.setBackground(new java.awt.Color(0, 204, 255));
        btnHesaplar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHesaplar.setForeground(new java.awt.Color(204, 255, 255));
        btnHesaplar.setText("HESAPLAR");
        btnHesaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHesaplarActionPerformed(evt);
            }
        });

        btnAlacaklar.setBackground(new java.awt.Color(0, 204, 255));
        btnAlacaklar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlacaklar.setForeground(new java.awt.Color(204, 255, 255));
        btnAlacaklar.setText("ALACAKLAR");
        btnAlacaklar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlacaklarActionPerformed(evt);
            }
        });

        btnBorclar.setBackground(new java.awt.Color(0, 204, 255));
        btnBorclar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorclar.setForeground(new java.awt.Color(204, 255, 255));
        btnBorclar.setText("BORÇLAR");
        btnBorclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorclarActionPerformed(evt);
            }
        });

        lblMesaj.setBackground(new java.awt.Color(255, 255, 255));
        lblMesaj.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lblMesaj.setForeground(new java.awt.Color(255, 0, 51));
        lblMesaj.setText("Hoş geldin kullanıcı");

        lblBalance.setBackground(new java.awt.Color(255, 255, 255));
        lblBalance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(0, 0, 0));
        lblBalance.setText("Bakiye:");

        lblDebt.setBackground(new java.awt.Color(255, 255, 255));
        lblDebt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDebt.setForeground(new java.awt.Color(0, 0, 0));
        lblDebt.setText("Borçlar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHesaplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlacaklar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorclar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(lblMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnHesaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAlacaklar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBorclar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //AccountWindow(Hesaplar) penceresini açıyoruz butona tıklandığında
    private void btnHesaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHesaplarActionPerformed
        AccountsWindow accountsWindow = new AccountsWindow();
        accountsWindow.setVisible(true);
        accountsWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnHesaplarActionPerformed
    //ReceivablesWindow (Alacaklar) penceresini açıyoruz butona tıklandığında
    private void btnAlacaklarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlacaklarActionPerformed
        ReceivablesWindow receivablesWindow = new ReceivablesWindow();
        receivablesWindow.setVisible(true);
        receivablesWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAlacaklarActionPerformed
    //Borclar penceresini açıyoruz butona tıklandığında
    private void btnBorclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorclarActionPerformed
        Borclar borclar = new Borclar();
        borclar.setVisible(true);
        borclar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBorclarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlacaklar;
    private javax.swing.JButton btnBorclar;
    private javax.swing.JButton btnHesaplar;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDebt;
    private javax.swing.JLabel lblMesaj;
    // End of variables declaration//GEN-END:variables
}
