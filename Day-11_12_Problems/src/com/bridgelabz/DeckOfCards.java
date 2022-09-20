/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
//Write a Program DeckOfCards.java, to initialize deck of cards having suit
//("Clubs", "Diamonds", "Hearts", "Spades") &
//Rank ("2", "3", "4", "5", "6", "7", "8",
//"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
//method and then distribute 9 Cards to 4 Players and Print the Cards received by
//the 4 Players using 2D Array...


 class DeckOfCards {
 
  // 1 step create a deck of 52 cards
  // 2 random method to shuffle card
  // 3  assign the cards to player
  // 4 Display the assigned card in 2d array
 
  //========================// 1 step create a deck of 52 cards ==========
  // Instance varaibles
  // 9 cards and 4 players
 
  int noOfPlayers = 4;
  int noOfCardsToDistribute = 9;
  // Another method
  int maxNoOfCardsToBeDistrubuted = 9;
 
  // 2d Array for players
  String [][] players = new String [noOfPlayers][noOfCardsToDistribute];
   
  // Ranks and Suits
  String[] suitsArray = {"Spades", "Hearts", "Diamonds", "Clubs"};
  String[] ranksArray = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
 
  int[] deck = new int[52]; // suits * ranks = 52
  String[] deckOFCards = new String[52];
 
  // Constructor of class
  public DeckOfCards() {
      for(int i=0;i<deck.length;i++) {  // Confusing
          deck[i] = i; // 0 to 51
      }
  }
 
  // //=========== 2 random method to shuffle card============
 
  void shuffleCards() {
      for(int i=0;i<deck.length;i++) {
          /// 1 to 52
          int randomIndexValue = (int)(Math.random()*deck.length);
      
          // Type casting  // 1 to 52
         
          // deck[0] = 0
          // deck[1] = 1
          int temp = deck[i];
          deck[i] = deck[randomIndexValue];
          deck[randomIndexValue]=temp;
         
          // Diamond, suits,etc
          // 2,3,4,5,6,7,8 etc
         
          String suit = suitsArray[deck[i]/13];
          // Random function from 1 to 4
          String rank = ranksArray[deck[i]%13];
          // Random function 1 to 13
         
          deckOFCards[i] = rank + "-" + suit;           
      }
  }
 
  // =============// 3  assign the cards to player  
  // Each player 9 Card 
 
  void assignCards() {
      // Array name is players  // Loop will 4 * 13 = 52
      int count =0;
      for(int i=0;i<noOfPlayers;i++) {
          for(int j=0;j<noOfCardsToDistribute;j++ ) {
              players[i][j] = deckOFCards[count++];
          }
      }
     
  }
 
  
  //Assign 9 cards among 4 player
   
  void assign9CardsAmong4Players() {

	// 4 rows and 9 columns
	// 9 cards only
	// 9/4 = min one card and max 3 cards
	// player 1 = 1 card
	// player 2 = 3 card
	// player 3 = 2 cards
	// player 4 = 3 cards

	// 4 * 9 matrix


		ArrayList<Integer> randomIndex = new ArrayList<Integer>();
		randomIndex.add(1);
		randomIndex.add(3);
		randomIndex.add(2);
		randomIndex.add(3);
		Collections.shuffle(randomIndex);
	
		int count =0;
		for(int i=0;i<noOfPlayers;i++) {
			for (int j = 0; j < randomIndex.get(i); j++) {
					players[i][j] = deckOFCards[count++];
			}
		}

  	}

	///===============// 4 Display the assigned card in 2d array

	void display() {
		for(int i=0;i<noOfPlayers;i++) {
			for(int j=0;j<noOfCardsToDistribute;j++) {
		
				if(players[i][j] == null){
				// Do nothing
				} else {
					System.out.print("P"+(i+1)+":"+players[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
 }