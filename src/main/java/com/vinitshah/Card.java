package com.vinitshah;

import static org.fusesource.jansi.Ansi.ansi;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int rankValue() {
        return rank.rankValue();
    }

    public String display() {
        String[] lines = new String[7];
        lines[0] = "┌─────────┐";
        lines[1] = String.format("│%s%s       │", rank.display(), rank.equals("10") ? "" : " ");
        lines[2] = "│         │";
        lines[3] = String.format("│    %s    │", suit.symbol());
        lines[4] = "│         │";
        lines[5] = String.format("│       %s%s│", rank.equals("10") ? "" : " ", rank.display());
        lines[6] = "└─────────┘";

        return ansi()
                .fg(suit.cardColor()).toString()
                + String.join(ansi().cursorDown(1)
                .cursorLeft(11)
                .toString(), lines);
    }

    public boolean isGreaterThan(Card card) {
        if(this.suit == card.suit) {
            return this.rank.rankValue() > card.rank.rankValue();
        }

        return false;
    }

    @Override
    public String toString() {
        return "Card {" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (!suit.equals(card.suit)) return false;
        return rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + rank.hashCode();
        return result;
    }
}
