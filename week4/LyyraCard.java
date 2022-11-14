package week4;

public class LyyraCard {
	private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        String checkBalance = "The card has " + balance + " euros";
        return checkBalance;
    }
    
    public void payEconomical() {
    	double economical = 2.50;
    	if (this.balance>economical) {   
        	this.balance -= economical;
    	}  		
    }
    
    public void payGourmet() {
    	double gourmet = 4.00;
    	if (this.balance > gourmet) {
    		this.balance -= gourmet;
    	}
    }
    public void loadMoney(double amount) {
    	if (amount < 0) {
    		amount = 0;
    	}
    	this.balance += amount;
    	if (this.balance > 150) {
    		this.balance = 150;
    	}
    }

}
