package com.shahvinit;

import com.vinitshah.Card;
import com.vinitshah.Rank;
import com.vinitshah.Suit;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CardTest {

    @Test
    public void testIf3OfDiamondIsGreaterThan2ofDiamond() {
        Card threeOfDiamond = new Card(Suit.DIAMONDS, new Rank("3"));
        Card twoOfDiamond = new Card(Suit.DIAMONDS, new Rank("2"));

        assertThat(threeOfDiamond.isGreaterThan(twoOfDiamond))
                .isTrue();
    }

    @Test
    public void testThat2OfDiamondIsNotGreaterThan3ofDiamond() {
        Card threeOfDiamond = new Card(Suit.DIAMONDS, new Rank("3"));
        Card twoOfDiamond = new Card(Suit.DIAMONDS, new Rank("2"));

        assertThat(twoOfDiamond.isGreaterThan(threeOfDiamond))
                .isFalse();
    }

    @Test
    public void testIf2OfDiamondIsGreaterThan3ofSpade() {
        Card threeOfSpade = new Card(Suit.SPADES, new Rank("3"));
        Card twoOfDiamond = new Card(Suit.DIAMONDS, new Rank("2"));

        assertThat(twoOfDiamond.isGreaterThan(threeOfSpade))
                .isFalse();
    }

    @Test
    public void testDisplayCard2OfDiamond() {
        Card twoOfDiamond = new Card(Suit.DIAMONDS, new Rank("2"));
        System.out.println(twoOfDiamond.display());
    }
}
