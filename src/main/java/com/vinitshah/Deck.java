package com.vinitshah;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void shuffleCards() {
        Collections.shuffle(deck);
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.display());
        }
    }

    private void initializeDeck() {
        for(Suit suit: Suit.values()) {
            for(int j = 1; j <= 13; j++) {
                deck.add(new Card(suit, Rank.from(j)));
            }
        }
    }
}
