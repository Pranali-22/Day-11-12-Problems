/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public interface CommercialDataProcessing {
	double valueOf();
	
	void buyShare(double amount, String symbol);
	
	void sellShare(double amount, String symbol);
	
	void printReport();
	
}
