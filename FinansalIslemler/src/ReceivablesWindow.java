
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class ReceivablesWindow extends javax.swing.JFrame {

    Receivables receivables;
    /**
     * Creates new form Receivables
     */
    public ReceivablesWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        //Tabloya bilgileri yazdıran metot
        yazdir();
    }
    
    //Tablo modeli
    DefaultTableModel model;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBilgi = new javax.swing.JTable();
        btnAyrintilar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblLastName2 = new javax.swing.JLabel();
        lblDebt = new javax.swing.JLabel();
        lblDebt2 = new javax.swing.JLabel();
        lblTarih1 = new javax.swing.JLabel();
        lblTarih2 = new javax.swing.JLabel();
        lblAlma1 = new javax.swing.JLabel();
        lblAlma2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alacaklar");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alacaklar");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        tblBilgi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "İsim", "Soyisim", "Borçları"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBilgi);

        btnAyrintilar.setBackground(new java.awt.Color(0, 204, 204));
        btnAyrintilar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAyrintilar.setForeground(new java.awt.Color(204, 255, 255));
        btnAyrintilar.setText("AYRINTILAR");
        btnAyrintilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyrintilarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AYRINTILAR");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setText("İsim:");

        lblName2.setBackground(new java.awt.Color(255, 255, 255));
        lblName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName2.setForeground(new java.awt.Color(51, 51, 51));

        lblLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(51, 51, 51));
        lblLastName.setText("Soyisim:");

        lblLastName2.setBackground(new java.awt.Color(255, 255, 255));
        lblLastName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName2.setForeground(new java.awt.Color(51, 51, 51));

        lblDebt.setBackground(new java.awt.Color(255, 255, 255));
        lblDebt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDebt.setForeground(new java.awt.Color(51, 51, 51));
        lblDebt.setText("Borç:");

        lblDebt2.setBackground(new java.awt.Color(255, 255, 255));
        lblDebt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDebt2.setForeground(new java.awt.Color(51, 51, 51));

        lblTarih1.setBackground(new java.awt.Color(255, 255, 255));
        lblTarih1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTarih1.setForeground(new java.awt.Color(51, 51, 51));
        lblTarih1.setText("Borcun verildiği tarih:");

        lblTarih2.setBackground(new java.awt.Color(255, 255, 255));
        lblTarih2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTarih2.setForeground(new java.awt.Color(51, 51, 51));

        lblAlma1.setBackground(new java.awt.Color(255, 255, 255));
        lblAlma1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAlma1.setForeground(new java.awt.Color(51, 51, 51));
        lblAlma1.setText("Borcun son ödeme tarihi:");

        lblAlma2.setBackground(new java.awt.Color(255, 255, 255));
        lblAlma2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAlma2.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 151, Short.MAX_VALUE)
                .addComponent(btnAyrintilar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlma1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTarih1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLastName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDebt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTarih2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlma2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnAyrintilar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblLastName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDebt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblDebt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarih1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTarih2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlma1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblAlma2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String verilme;
    String alma;
    
    //Ayrıntılar bölümündeki labellara gerekli bilgileri yazdırıyor
    private void btnAyrintilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyrintilarActionPerformed
        //Tablodan seçilen satırın indexini döndürüyor ve index değişkenine atıyoruz
        int index = tblBilgi.getSelectedRow();
        
        //Oluşturduğumuz DefaultTableModel nesnesini kullanarak satır ve sutun numaraları ile gerekli değişkenlere bilgileri atıyoruz
        //index ile  seçilen satırdaki sutunlardaki bilgileri atadık
        String name = String.valueOf(model.getValueAt(index, 0));
        String lastName = String.valueOf(model.getValueAt(index, 1));
        int debt = Integer.parseInt(String.valueOf(model.getValueAt(index, 2)));
        
        lblName2.setText(name);
        lblLastName2.setText(lastName);
        lblDebt2.setText(debt + "");
        
        
        //Tarihleri tabloda tutmadığımız için getValueAt metodu ile çekemiyoruz
        //O yüzden persons ArrayListindeki bilgilerden seçilen satırdaki isim ile listedeki isim uyuştuğunda
        //listedeki borcun verilme ve alma tarihlerini değişkenlerine atıyoruz
        for (int i = 0; i < persons.size(); i++) {
            String namee = persons.get(i).getPerson_name() + "";
            
            if(namee.equals(model.getValueAt(index, 0))){
                verilme = persons.get(i).getVerilme() + "";
                alma = persons.get(i).getAlma() + "";
            }
        }
        
        lblTarih2.setText(verilme);
        lblAlma2.setText(alma);
    }//GEN-LAST:event_btnAyrintilarActionPerformed
    
    //Tablodaki bilgileri ArrayListe atıyoruz
    ArrayList<Receivables> persons;
    public void yazdir(){
        model = (DefaultTableModel)tblBilgi.getModel();
        model.setRowCount(0);
        
        try {
            //getPersons veritabınından bilgilerin okunup ArrayList döndüren metot
            persons = getPersons();
            
            //Döngü ile tabloya bilgileri yazıyoruz
            //Pencere açıldığında bu metot çalışıyor
            for (Receivables person : persons) {
                Object[] row = {
                    person.getPerson_name(),
                    person.getPerson_lastName(),
                    person.getDebt(),
                    person.getVerilme(),
                    person.getAlma()
                };
                //modele satırları ekliyoruz
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //Veritabanından bilgilerin okunduğu ve ArrayList ile döndürüldüğü dizi
    public ArrayList<Receivables> getPersons() throws SQLException {

        Connection connection = null;
        DbHelper dbHelper = new  DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        
        //Bilgileri atayacağımız ve geri göndereceğimiz ArrayList
        ArrayList<Receivables> persons = new ArrayList<Receivables>();
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT person_name, person_last_name, person_debt, verilme_tarihi, alma_tarihi FROM receivables");
            
            //Veritabanından okunabilecek veriler olduğu sürece dönecek
            while(resultSet.next()){
                //ArrayListe atıyoruz okuduğumuz değerleri
                persons.add(new Receivables(
                        resultSet.getString("person_name"),
                        resultSet.getString("person_last_name"),
                        resultSet.getInt("person_debt"),
                        resultSet.getDate("verilme_tarihi"),
                        resultSet.getDate("alma_tarihi")
                ));
            }
            
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
            
        }
        
        return persons;
    }
    
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
            java.util.logging.Logger.getLogger(ReceivablesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceivablesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceivablesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceivablesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceivablesWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyrintilar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAlma1;
    private javax.swing.JLabel lblAlma2;
    private javax.swing.JLabel lblDebt;
    private javax.swing.JLabel lblDebt2;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblTarih1;
    private javax.swing.JLabel lblTarih2;
    private javax.swing.JTable tblBilgi;
    // End of variables declaration//GEN-END:variables
}
