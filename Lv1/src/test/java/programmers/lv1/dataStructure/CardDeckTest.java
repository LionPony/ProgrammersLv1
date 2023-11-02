package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class CardDeckTest {
    // If you can make goal by cards1, cards2 which has an order return "Yes". If not return "No".
    @Test
    public void cardDeck() {
        CardDeck cardDeck = new CardDeck();
        Assert.assertEquals("Yes", cardDeck.cardDeck(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
    @Test
    public void cardDeck1() {
        CardDeck cardDeck = new CardDeck();
        Assert.assertEquals("No", cardDeck.cardDeck(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
    @Test
    public void cardDeck2() {
        CardDeck cardDeck = new CardDeck();
        Assert.assertEquals("No", cardDeck.cardDeck(new String[]{"a", "b", "c"}, new String[]{"d", "e", "f"}, new String[]{"a", "d", "f"}));
    }
    @Test
    public void cardDeck3() {
        CardDeck cardDeck = new CardDeck();
        Assert.assertEquals("Yes", cardDeck.cardDeck(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, new String[]{"string", "or", "integer"}, new String[]{"string", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}));
    }
}