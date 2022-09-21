/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public interface CommercialDataProcessing {
	abstract double valueOf();
	
	abstract void buyShare(double amount, String symbol);
	
	abstract void sellShare(double amount, String symbol);
	
	abstract void printReport();
	
}
