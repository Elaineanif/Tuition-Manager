/**
 * This class implements the international student case and it extends Student
 * @FaresElkhouli
 * @ZhiyuFeng
 */
public class International extends Student {
    private boolean exchange;
    
    public International(String fname, String lname, int credit, boolean exchange) {
    	super(fname,lname,credit);
    	this.exchange=exchange;
    }
    
    /**
     * Tuition calculator for International student
     * @return tuition due
     */
    
    public int tuitionDue() {
    	int perCreditPrice = 945;
    	int partTimeCredits = 12;
    	int partTimeFee = 846;
    	int fullTimeFee = 1441;
    	int maxCredits = 15;
    	int leastCredits = 9;
    	int tuition = 0;
    	int ccredit = 0;
    	if (credit < leastCredits) {
    		return null;
    	}
    	if (credit > maxCredits) {
    		ccredit = maxCredits;
    	}
    	else {
    		ccredit = credit;
    	}
    	if (exchange) {
    		tuition = 1791;
    	}
    	else {
    		tuition = perCreditPrice*ccredit+350;
    	}
    	
    	if(ccredit<partTimeCredits) {
    		tuition += partTimeFee;
    	}
    	else {
    		tuition += fullTimeFee;
    	}
    	return tuition;
    }
    pubilc String toString() {
    	return super.toString()+"tuition due:$"+tuitionDue();
    }
    
    public static void main(String[] args) {
    	
    }
}
