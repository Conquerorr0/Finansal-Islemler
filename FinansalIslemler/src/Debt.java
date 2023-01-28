import java.util.Date;
/**
 *
 * @author User
 */
public class Debt {
    private String person_name, person_lastName;
    private int debt;
    private Date sonOdeme, alma;

    public Debt(String person_name, String person_lastName, int debt, Date sonOdeme, Date alma) {
        this.person_name = person_name;
        this.person_lastName = person_lastName;
        this.debt = debt;
        this.sonOdeme = sonOdeme;
        this.alma = alma;
    }

    /**
     * @return the person_name
     */
    public String getPerson_name() {
        return person_name;
    }

    /**
     * @param person_name the person_name to set
     */
    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    /**
     * @return the person_lastName
     */
    public String getPerson_lastName() {
        return person_lastName;
    }

    /**
     * @param person_lastName the person_lastName to set
     */
    public void setPerson_lastName(String person_lastName) {
        this.person_lastName = person_lastName;
    }

    /**
     * @return the debt
     */
    public int getDebt() {
        return debt;
    }

    /**
     * @param debt the debt to set
     */
    public void setDebt(int debt) {
        this.debt = debt;
    }

    /**
     * @return the sonOdeme
     */
    public Date getSonOdeme() {
        return sonOdeme;
    }

    /**
     * @param sonOdeme the sonOdeme to set
     */
    public void setSonOdeme(Date sonOdeme) {
        this.sonOdeme = sonOdeme;
    }

    /**
     * @return the alma
     */
    public Date getAlma() {
        return alma;
    }

    /**
     * @param alma the alma to set
     */
    public void setAlma(Date alma) {
        this.alma = alma;
    }
    
    
}
