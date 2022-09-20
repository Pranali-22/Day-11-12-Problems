/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class DeckOfCardsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object of DeckOfCards and calling methods 
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.shuffleCards();
		//deckOfCards.assignCards();
		deckOfCards.assign9CardsAmong4Players();
		deckOfCards.display();

	}

}
