package com.shahvinit;

import com.vinitshah.Rank;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RankTest {

    @Test
    public void testCardWithNumberHasSameNumericalValue() {
        assertThat(Rank.from("7").rankValue())
                .isEqualTo(7);
    }

    @Test
    public void testCardWithJackHasNumericalValue11() {
        assertThat(Rank.from("J").rankValue())
                .isEqualTo(11);
    }

    @Test
    public void testCardWithQueenHasNumericalValue12() {
        assertThat(Rank.from("Q").rankValue())
                .isEqualTo(12);
    }

    @Test
    public void testCardWithKingSameNumericalValue13() {
        assertThat(Rank.from("K").rankValue())
                .isEqualTo(13);
    }

    @Test
    public void testCardWithAceHasNumericalValue1() {
        assertThat(Rank.from("A").rankValue())
                .isEqualTo(1);
    }

    @Test
    public void testCardWithNumber8HasNumericalValue8() {
        assertThat(Rank.from("8").rankValue())
                .isEqualTo(8);
    }
}
