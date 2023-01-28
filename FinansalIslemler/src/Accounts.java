
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Accounts {
    //Kullanıcının bilgileri
    private String user_id, user_name, user_last_name;
    private double user_balance, user_income, user_debt;
    
    //Enum metotdan BANKA ve KREDİ hesaplarındaki bilgileri tuttuğumuz dizi
    String[][] user;
    
    public Accounts() {
        //MySql bağlantısı
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        
        //Enum metot nesneleri
        enumAccounts enAccounts1 = enumAccounts.BANKA;
        enumAccounts enAccounts2 = enumAccounts.KREDİ;
        user = new String[2][5];
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM user");
            
            while(resultSet.next()){
                user_id = resultSet.getString("user_id");
                
                //Veritabanında Banka hesabının id'si 10 Kredi hesabının id'si 11
                //if yapısı ile id'ye göre gelen bilginin Banka hesabı mı Kredi hesabı mı karar verip ona göre işlem yapıyoruz

                if(String.valueOf(enAccounts1.getAccounts()).equals(user_id)){
                    user_name = resultSet.getString("user_name");
                    user_last_name = resultSet.getString("user_last_name");
                    user_balance = Integer.parseInt(resultSet.getString("user_balance"));
                    user_income = Integer.parseInt(resultSet.getString("user_income"));
                    user_debt = Integer.parseInt(resultSet.getString("user_debt"));
                    //varargs metot ile bilgileri dizideki yerlerine atıyoruz
                    //yerlestir0 metodu Banka hesabı bilgilerini dizinin 0. satırına yerleştiriyor
                    yerlestir0(user_name, user_last_name, String.valueOf(user_balance), String.valueOf(user_income), String.valueOf(user_debt));
                }
                if(String.valueOf(enAccounts2.getAccounts()).equals(user_id)) {
                    user_last_name = resultSet.getString("user_last_name");
                    user_balance = Integer.parseInt(resultSet.getString("user_balance"));
                    user_income = Integer.parseInt(resultSet.getString("user_income"));
                    user_debt = Integer.parseInt(resultSet.getString("user_debt"));
                    //varargs metot ile bilgileri dizideki yerlerine atıyoruz
                    //yerlestir1 metodu Kredi hesabı bilgilerini dizinin 0. satırına yerleştiriyor
                    yerlestir1(user_name, user_last_name, String.valueOf(user_balance), String.valueOf(user_income), String.valueOf(user_debt));
                }
            }
            
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
    
    //varargs metotlar
    public void yerlestir0(String... args){
        int i = 0;
        for (String arg : args) {
            user[0][i] = arg;
            i++;
        }
    }
    
    public void yerlestir1(String... args){
        int i = 0;
        for (String arg : args) {
            user[1][i] = arg;
            i++;
        }
    }
    
    //Enum metot
    public enum enumAccounts{
        BANKA(10),
        KREDİ(11);
        
        private int accounts;

        private enumAccounts(int accounts ) {
            this.accounts = accounts;
        }
        
        public int getAccounts(){
            return accounts;
        }
    }

    /**
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_last_name
     */
    public String getUser_last_name() {
        return user_last_name;
    }

    /**
     * @param user_last_name the user_last_name to set
     */
    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    /**
     * @return the user_balance
     */
    public double getUser_balance() {
        return user_balance;
    }

    /**
     * @param user_balance the user_balance to set
     */
    public void setUser_balance(double user_balance) {
        this.user_balance = user_balance;
    }

    /**
     * @return the user_income
     */
    public double getUser_income() {
        return user_income;
    }

    /**
     * @param user_income the user_income to set
     */
    public void setUser_income(double user_income) {
        this.user_income = user_income;
    }

    /**
     * @return the user_debt
     */
    public double getUser_debt() {
        return user_debt;
    }

    /**
     * @param user_debt the user_debt to set
     */
    public void setUser_debt(double user_debt) {
        this.user_debt = user_debt;
    }
    
}

