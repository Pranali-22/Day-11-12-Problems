/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class Account {	
	private int accountNumber;
	private String customerName;
	private double balance;
	
	public Account(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	
	public double withdraw( double debitAmount) {
		double amountLeft;
		if(this.balance >= debitAmount) {
			amountLeft = this.balance - debitAmount;
		}
		else {
			amountLeft = this.balance;
			System.out.println("Debit amount exceeded account balance");
		}
		return amountLeft;
	}
	
}
