package test.cribbage;

import cribbage.Card;
import cribbage.CardParser;
import cribbage.Suite;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParseHandTest {

    @Test
    void parseOneCard() {
        Card card = CardParser.parseCard("5C");
        assertThat(card.rank(), is("5"));
        assertThat(card.suite(), is(Suite.CLUB));
    }


}
