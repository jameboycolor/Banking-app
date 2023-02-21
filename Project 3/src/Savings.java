
/*Name - Jamie Bray
 * NetID - jab200019
 * Date - 11/10/2021
 */
import java.util.Date;

public class Savings extends Account{
	
	
	Savings(){
		super();
		
	}
	Savings(int id, double initialBalance, double intRate){
		super(id, initialBalance, intRate);
		
	}
	/*
	 * name: withdraw
	 * input: double
	 * output: 
	 *  description: withdraws if valid argument
	 */
	public void withdraw(double with) throws IllegalArgumentException{
		if(getBalance() - with < 0)
			throw new IllegalArgumentException("Savings account cannot Withdraw past $0.00");
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
		return super.toString();
	}
	
}
