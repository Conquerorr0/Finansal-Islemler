import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;


public class finans extends JFrame{
    
    public static void main(String[] args) throws SQLException {
        Frame frame = new Frame();
        
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM person");
            
            //Girilen UserName ve Password'ü veritabanında var mı diye kontrol ediyoruz.
            while(resultSet.next()){
                
//                if(userName_Control == true && password_Control == true){
//                    person = new Person(
//                        resultSet.getString("Iban"),
//                        resultSet.getString("UserName"),
//                        resultSet.getString("Password"),
//                        resultSet.getString("Name"),
//                        resultSet.getString("LastName"),
//                        resultSet.getInt("Balance")
//                    );
//                    
//                    new MainWindow(person.getIban(), person.getUserName(), person.getPassword(), person.getName(), person.getLastName(), person.getBalance());
//                    //insert();
//                    break;
//                }
                
            }
            
        } catch (SQLException e) {
            dbHelper.showError(e);
        }
        finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(finans.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.close();
        }
    }
}

class Frame {
    JButton btnTamam;
    JLabel lblMesaj;
    
    public Frame() {
        //Pencereyi oluşturuyoruz
        JFrame frame = new JFrame();
        frame.setSize(400, 600);    //Boyut ayarladık
        frame.setTitle("Finansal Islemler");    //Pencereye başlık girdik
        frame.setLocationRelativeTo(null);      //null yaparak pencereyi ekranın ortasında çıkmasını sağladık
        
        btnTamam = new JButton("Tamam");
        lblMesaj = new JLabel("Label Burada");
        
        frame.getContentPane().setLayout(new FlowLayout());
        
        frame.getContentPane().add(lblMesaj);
        frame.getContentPane().add(btnTamam);
        
        btnTamam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                lblMesaj.setText("Butona tıklandı...");
            }
        });
        
        frame.setResizable(false);  //Pencerenin boyutunu sabit tutuyoruz
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Pencereyi kapattığımızda program duruyor
        frame.setVisible(true);     //Pencereyi görünür yaptık
    }
    
}
