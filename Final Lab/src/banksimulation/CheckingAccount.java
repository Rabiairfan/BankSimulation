package banksimulation;
/**
 * 
 * @author rabia
 * Extends Account class.
 * 
 */
public class CheckingAccount extends Account{
	
	protected float chargeRate;
	
CheckingAccount(int Number, float CR){
		this.number = Number;
		this.chargeRate = CR;
	}
	
	/**
	 * abstract method from parent class.
	 * checks if amount can be withdrawn(amount is less than balance)
	 */
	public boolean withdraw(double d)
	{if(d<bal){
		bal = bal-d;
		return true;
	}
	else
		return false;
		
	}


}
