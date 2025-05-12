package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

// This class holds all 52 cards (4 suits x 13 values)
public class Deck {
    //Fields (Variables)
    private ArrayList<Card> cards; // holds the list of Card objects
    public Deck(){
        cards = new ArrayList<>();
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String [] values = { "2","3","4","5","6","7","8","9","10","J","Q","K","A" };

        // Create all 52 cards
        for (String suit : suits){
            for (String value : values){
                cards.add(new Card(suit,value,false)); // cards starts face-down
            }
        }
        shuffle(); //shuffle deck on creation
    }
    // Randomly shuffle the cards in the deck
     public void shuffle() {
         Collections.shuffle(cards);
     }
     // Deals one card from the top of the deck
    public Card dealCard() {
        if (card.isEmpty()) {
            return null; // or handle reshuffle logic
        }
        Card topCard = cards.remove(0); // take the top card
        topCard.flip(); // reveal the card
        return topCard;
    }
    // Returns number of cards left in the deck
    public int size() {
        return cards.size();
    }
}
