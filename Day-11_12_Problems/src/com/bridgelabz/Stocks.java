/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class Stocks {

	/**
	 * @param args
	 */
	public String stockName;
	public int numberOfShares;
	public int priceOfShare;
	public int valueOfShares;
	
	
	public Stocks(String stockName, int numberOfShares, int priceOfShare) {
		super();
		this.stockName = stockName;
		this.numberOfShares = numberOfShares;
		this.priceOfShare = priceOfShare;
	}

	public void calculateValueOfShares() {
		valueOfShares = this.numberOfShares * this.priceOfShare;
	}

	public void stockReport() {
		System.out.println("Stock name : "+stockName);
		System.out.println("Number of shares : "+numberOfShares);
		System.out.println("Price of one share : "+priceOfShare);
		System.out.println("Value of total shares : "+valueOfShares);	
		
	}
}
