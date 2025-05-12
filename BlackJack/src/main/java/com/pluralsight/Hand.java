package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards; // stores the cards in the hand

    // Constructor to initialize the hand
    public Hand(){
        cards = new ArrayList<>();
    }
    // Adds a card to the hand
    public void addCard(Card card) {
        cards.add(card);
    }
    //Calculates total value of the hand (Blackjack rules)
    public int getTotalValue(){
        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {
    }
}
