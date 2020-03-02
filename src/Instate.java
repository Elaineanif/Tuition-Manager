/**
 *This class implements the in-state student case and it extends Student
 * @FaresElkhouli
 * @ZhiyuFeng
 */
public class Instate extends Student {
    private int funds;
    
    public Instates(String fname, String lname, int credit, int funds) {
    	super(fname, lname, credit);
    }
    /**
     * Tuition calculator for instate student
     * @return tuition due
     */
    public int tuitionDue() {
    	int perCreditPrice = 433;
    	int partTimeCredits = 12;
    	int partTimeFee = 846;
    	int fullTimeFee = 1441;
    	int maxCredits = 15;
    	int tuition = 0;
    	int ccredit = 0;
    	
    	if (credit > maxCredits) {
    		ccredit = maxCredits;
    	}
    	else {
    		ccredit = credit;
    	}
    	
    	if (ccredit >= partTimeCredits && fund != 0) {
    		tuition = perCreditPrice*ccredit - fund;
    	}
    	else {
    		tuition = perCreditPrice*ccredit;
    	}
    	if (ccredit < partTimeCredits) {
    		turtion += partTimeFee;
    	}
    	else {
    		tuition += fullTimeFee;
    	}
    	return tuition;
    }
    public String toString() {
    	return super.toString() + "tuition due:$" + tuitionDue();
    }
    public static void main(String[] args) {
    	
    }
}

