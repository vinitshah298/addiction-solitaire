package com.shahvinit;

import com.vinitshah.Deck;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class DeckTest {

    @Test
    public void testDeckCreation() {
        Deck deck = new Deck();
        assertThat(deck.getDeck().size())
                .isEqualTo(52);
        deck.printDeck();
    }
}
