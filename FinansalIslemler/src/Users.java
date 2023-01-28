/**
 *
 * @author User
 */

//Nested Sınıf
public class Users {
    private String Id, Name, LastName;
    private double Balance, Income, Debt;
    
    //Kullanıcının sınıfı
    class User {
        User(String person_id, String person_name, String person_last_name, double balance, double income, double debt){
            Id = person_id;
            Name = person_name;
            LastName = person_last_name;
            Balance = balance;
            setIncome(income);
            setDebt(debt);
        }
    }
    
    //Borçlu olan ve borrçlu olduklarımızın bilgilerini tutan sınıf
    class Person {

        Person(String person_id, String person_name, String person_last_name, double balance, double income, double debt){
            Id = person_id;
            Name = person_name;
            LastName = person_last_name;
            Balance = balance;
            setIncome(income);
            setDebt(debt);
        }
        
    }

    /**
     * @return the person_id
     */
    public String getPerson_id() {
        return Id;
    }

    /**
     * @param person_id the person_id to set
     */
    public void setPerson_id(String person_id) {
        this.Id = person_id;
    }

    /**
     * @return the person_name
     */
    public String getPerson_name() {
        return Name;
    }

    /**
     * @param person_name the person_name to set
     */
    public void setPerson_name(String person_name) {
        this.Name = person_name;
    }

    /**
     * @return the person_last_name
     */
    public String getPerson_last_name() {
        return LastName;
    }

    /**
     * @param person_last_name the person_last_name to set
     */
    public void setPerson_last_name(String person_last_name) {
        this.LastName = person_last_name;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return Balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.Balance = balance;
    }

    /**
     * @return the Income
     */
    public double getIncome() {
        return Income;
    }

    /**
     * @param Income the Income to set
     */
    public void setIncome(double Income) {
        this.Income = Income;
    }

    /**
     * @return the Debt
     */
    public double getDebt() {
        return Debt;
    }

    /**
     * @param Debt the Debt to set
     */
    public void setDebt(double Debt) {
        this.Debt = Debt;
    }

    
}
