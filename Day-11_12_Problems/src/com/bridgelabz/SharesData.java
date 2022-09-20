/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class SharesData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter share symbol ");
		String symbol = input.nextLine();
		System.out.println("Enter number of shares ");
		int numOfShare  = input.nextInt();
		System.out.println("Enter value of each share ");
		double valueOfShare = input.nextDouble();
		System.out.println("Enter amount you have ");
		double amountLeft = input.nextDouble();
		
		CompanyShares companyShare = new CompanyShares(symbol,numOfShare,valueOfShare,amountLeft);
		
		int choice=3;		
		while (choice!=0){         
            switch (choice){
                case 0:
                    return;
                   
                case 1:
                	companyShare.buyShare(amountLeft, symbol);
                    break;
                case 2:
                	companyShare.sellShare(amountLeft, symbol);
                    break;   
                case 3:
                	companyShare.printReport();
                	break;
                case 4:
                	double value= companyShare.valueOf();
                	System.out.println("Value of share = "+value);
                	break;
            }
            
            System.out.println("\nPress 0 to exit \nPress 1 to buy share \nPress 2 to sell share \nPress 3 to display report \nPress 4 to print value of each share");
            choice = input.nextInt();
        }		
		
		input.close();
	}


}
