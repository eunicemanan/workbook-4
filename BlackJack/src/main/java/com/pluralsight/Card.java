package com.pluralsight;

public class Card {
    // Stores the suit of the card (e.g., "Hearts", "Spades", "Clubs", "Diamonds".)
    private String suit;

    // Stores the value of the card (e.g., "A", "2", ..., "K")
    private String value;

    // Tracks whether the card is face up (true) or face down (false)
    private boolean isFaceUp;

    // Constructor: called when you create a new Card object
    public Card(String suit, String value, boolean isFaceUp) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false; // All cards start face down, even if passed as true
    }

    // Returns the suit if the card is face up; otherwise returns "#"
    public String getSuit() {
        return isFaceUp ? suit : "#";
    }

    // Returns the value if the card is face up; otherwise returns "#"
    public String getValue() {
        return isFaceUp ? value : "#";
    }

    // Returns the point value of the card (used for scoring in Blackjack)
    public int getPointValue() {
        if (!isFaceUp) return 0; // face down cards don’t count

        // Face cards are worth 10, Aces are worth 11, number cards use their number
        switch (value) {
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return Integer.parseInt(value); // Converts string like "2" to number 2
        }
    }

    // Returns true if the card is face up
    public boolean isFaceUp() {
        return isFaceUp;
    }

    // Flips the card (face up becomes face down and vice versa)
    public void flip() {
        isFaceUp = !isFaceUp;
    }

    // Returns a string like "A of Hearts" or "# of #" for hidden cards
    public String toString() {
        return getValue() + " of " + getSuit();
    }
}
