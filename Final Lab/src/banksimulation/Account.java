package banksimulation;


/**
 * @version 1.1
 * @author rabia
 * this class deals with the account details of a person.
 * One person has many accounts.
 */
public abstract class Account {

	
  protected int number;
  protected double bal;
  
  
  /**
   * 
   * @return account Number.
   * 
   */
  public int getNumber(){
	  
	  return number;
  }
  /**
   * 
   * @return Balance
   */
public double getBalance(){
	  
	  return bal;
  }

/**
 * 
 * @return account's owner name
 */
public String getOwner(){
	  String ownerName="";
	  return ownerName;
}
 
/**
 * 
 * @param d : amount that is too be deposited to the account.
 */
public void deposit(double d){
	bal= bal+d;
}

public abstract boolean withdraw(double d);
}
