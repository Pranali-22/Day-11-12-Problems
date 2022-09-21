/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class StockPortfolio {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalValueOfAllStocks=0;
		
		Stocks[] stock = new Stocks[3];
		stock[0]= new Stocks("SBI",5,50);
		stock[1]= new Stocks("DMart",10,100);
		stock[2]= new Stocks("Adani",5,20);
		
		for(int i=0; i<stock.length; i++) {
			
			stock[i].calculateValueOfShares();
			stock[i].stockReport();
			System.out.println();
			totalValueOfAllStocks += stock[i].valueOfShares;
			
		}
		
		System.out.println("Total value of all stocks = "+totalValueOfAllStocks);

	}

}
