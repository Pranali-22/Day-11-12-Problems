/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class AccountTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter account number, customer name and balance");
		int accountNumber = input.nextInt();
		String customerName = input.next();
		double balance = input.nextDouble();
		Account account = new Account(accountNumber, customerName, balance);
		
		System.out.println("Enter amount to withdraw");
		double amount = input.nextDouble();
		double remainingBalance = account.withdraw(amount);

		System.out.println("Balance after withdrwal = "+remainingBalance);
	}

}
