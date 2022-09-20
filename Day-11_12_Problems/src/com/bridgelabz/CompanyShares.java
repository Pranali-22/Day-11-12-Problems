/**
 * 
 */
package com.bridgelabz;
import java.time.*;


/**
 * @author Dell
 *
 */
public class CompanyShares implements CommercialDataProcessing{
	String stockSymbol;
	int numberOfShares;
	double valueOfShare;
	double amount;
	LocalDateTime dateTime; 
	
	
	public CompanyShares(String stockSymbol, int numberOfShares, double valueOfShare, double amount) {
		this.stockSymbol = stockSymbol;
		this.numberOfShares = numberOfShares;
		this.valueOfShare = valueOfShare;
		this.amount = amount;
	}

	//Display value of each share
	@Override
	public double valueOf() {
		return valueOfShare;
	}

	//Buy shares of symbol
	@Override
	public void buyShare(double amount, String symbol) {
		if(amount >= valueOfShare) {
			numberOfShares++;
			amount = amount-valueOfShare;
			dateTime = LocalDateTime.now();
			System.out.println("Bought 1 share of symbol "+stockSymbol+" on "+dateTime);
			System.out.println(amount);
		}
		else {

			System.out.println("Don't have enough amount to buy share");
		}
	}

	////Sell shares of symbol
	@Override
	public void sellShare(double amount, String symbol) {
		if(numberOfShares != 0) {
			numberOfShares--;
			amount = amount + valueOfShare;
			dateTime = LocalDateTime.now();
			System.out.println("Sold 1 share of symbol "+stockSymbol+" on "+dateTime);
		}
		else {
			System.out.println("Don't have enough shares to sold");
		}
		
	}

	//Displaying report
	@Override
	public void printReport() {
		System.out.println("Stock Symbol : "+stockSymbol+"\nNumber of Shares : "+numberOfShares+"\nValue of each share : "+valueOfShare+"\nAmount left : "+amount);
		
	}
				
}
