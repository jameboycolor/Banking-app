/*Name - Jamie Bray
 * NetID - jab200019
 * Date - 11/10/2021
 */
import java.util.Date;

public class Account {


	//Attributes/Variables
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		
		
		//Constructor
		public Account() {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
			dateCreated = new Date();
		}
		public Account(int id, double initialBalance, double intRate) {
			this.id = id;
			balance = initialBalance;
			annualInterestRate = intRate;
			dateCreated = new Date();
		}
		
		
		
		/*
		 * name: setID
		 * input: int
		 * output: 
		 *  description: sets id value
		 */
		public void setID(int id) {
			this.id = id;
		}
		/*
		 * name: setBalance
		 * input:double
		 * output: 
		 *  description: sets account balance
		 */
		public void setBalance(double balance) {
			this.balance = balance;
		}/*
		 * name: setAnnualInterestRate
		 * input:
		 * output: 
		 *  description: sets annual interest rate value
		 */
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}/*
		 * name: getID
		 * input:
		 * output: int
		 *  description: returns account id
		 */
		public int getID() {
			return id;
		}/*
		 * name: getBalance
		 * input:
		 * output: double
		 *  description: returns account balance
		 */
		public double getBalance() {
			return balance;
		}/*
		 * name: getAnnualInterestRate
		 * input:
		 * output: double
		 *  description: returns annual interest rate value
		 */
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		/*
		 * name: getDateCreated
		 * input:
		 * output: Date
		 *  description: returns current date
		 */
		public Date getDateCreated() {
			return dateCreated;
		}
		/*
		 * name: getMonthlyInterestRate
		 * input:
		 * output: double
		 *  description: returns monthly interest rate
		 */
		public double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}/*
		 * name: getValue
		 * input:
		 * output: getMonthlyInterest
		 *  description: returns monthly interest value
		 */
		public double getMonthlyInterest() {
			return getMonthlyInterestRate() * balance;
		}
		/*
		 * name: withdraw
		 * input: double
		 * output: 
		 *  description: decreases balance by input
		 */
		public void withdraw(double with) {
			balance -= with;
		}
		/*
		 * name: deposit
		 * input: double
		 * output: 
		 *  description: increases balance by input
		 */
		public void deposit(double dep) {
			balance += dep;
			
		}
		/*
		 * name: toString
		 * input:
		 * output: String
		 *  description: returns formatted account attributes
		 */
		public String toString() {
			return "id: " + id + 
					"\nbalance: $" + balance + 
					"\nAnnual Interest Rate: " + annualInterestRate + 
					"\nMonthly interest rate: "+ getMonthlyInterestRate() +
					"\nMonthly interest Value: "+ getMonthlyInterest() + 
					"\nDate: " + dateCreated + 
					"\n";
			
		}
}
