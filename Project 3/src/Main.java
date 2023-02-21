
/*Name - Jamie Bray
 * NetID - jab200019
 * Date - 11/10/2021
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//creating accounts for testing
		Account account1 = new Account();
		Account account2 = new Account(51762, 10000.0, 2);
		Checking checking1 = new Checking();
		Checking checking2 = new Checking(59286, 100.0, 3, -50000.0);
		Savings savings1 = new Savings();
		Savings savings2 = new Savings(30938, 7000.0, 5);
		
		//creating a list of accounts
		List<Account> list = new ArrayList<Account>();
		list.add(account1);
		list.add(account2);
		list.add(checking1);
		list.add(checking2);
		list.add(savings1);
		list.add(savings2);
		
		//depositing $100 into each account
		for(int i = 0; i < list.size(); i++) {
			list.get(i).deposit(100);
			System.out.println(list.get(i));
		}
		
		//withdrawing $10,000 from each account
		for(int i = 0; i < list.size(); i++) {
			
			//withdraw function throws error if input invalid
			try{
				list.get(i).withdraw(10000);
			}
			catch(IllegalArgumentException e) {
				System.out.println(e);
			}
		}
		

	}

}
