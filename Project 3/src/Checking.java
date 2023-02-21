
/*Name - Jamie Bray
 * NetID - jab200019
 * Date - 11/10/2021
 */
import java.util.Date;

public class Checking extends Account {

	//variables
	private double overdraftLimit;
	
	//constructors
	Checking(){
		super();
		overdraftLimit = 0;
	}
	Checking(int id, double initialBalance, double intRate, double limit){
		super(id, initialBalance, intRate);
		overdraftLimit = limit;
	}
	/*
	 * name: withdraw
	 * input: double
	 * output: 
	 *  description: withdraws if valid argument
	 */
	public void withdraw(double with) throws IllegalArgumentException{
		if(getBalance() - with <= overdraftLimit)
			throw new IllegalArgumentException("Checking account cannot withdraw past overdraft limit");
		else{
			super.withdraw(with);
		
		}
	}
	/*
	 * name: toString
	 * input: 
	 * output: String
	 *  description: returns formatted account attributes
	 */
	public String toString() {
		return super.toString() + "Overdraft Limit: " + overdraftLimit;
	}
	
}
