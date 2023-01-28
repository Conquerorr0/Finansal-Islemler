
import java.util.Date;

/**
 *
 * @author User
 */

public class Receivables {
    private String person_name, person_lastName;
    private int debt;
    private Date verilme, alma;

    public Receivables(String person_name, String person_lastName, int debt, Date verilme_tarihi, Date alma_tarihi) {
        this.person_name = person_name;
        this.person_lastName = person_lastName;
        this.debt = debt;
        this.verilme = verilme_tarihi;
        this.alma = alma_tarihi;
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
     * @return the verilme
     */
    public Date getVerilme() {
        return verilme;
    }

    /**
     * @param verilme the verilme to set
     */
    public void setVerilme(Date verilme) {
        this.verilme = verilme;
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
