package banksimulation;

public class SavingsAccount extends Account {
 private float interestRate=0;

 
 SavingsAccount(int Number, float IR){
		this.number = Number;
		this.interestRate = IR;
	}
 
 /**
  * checks if amount can be withdrawn(amount is less than balance)
  * 
  */
public boolean withdraw(double d) {
	if(d<bal){
		bal = bal-d;
		return true;
	}
	else
		return false;
		
	}
}
 
 
 

