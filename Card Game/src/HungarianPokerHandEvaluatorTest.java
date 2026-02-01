import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class HungarianPokerHandEvaluatorTest {
    private final HungarianPokerHandEvaluator evaluator = HungarianPokerHandEvaluator.getInstance();

    @Test
    void handConstructorThrowsIfTooFewCards() {
        List<HungarianCard> cards = List.of(
                c(CardColor.MAKK, CardValue.HÉT)
        );
        assertThrows(InvalidHandSizeException.class, () -> new Hand(cards));
    }

    @Test
    void handConstructorThrowsIfTooManyCards() {
        List<HungarianCard> cards = List.of(
                c(CardColor.MAKK, CardValue.HÉT),
                c(CardColor.TOK, CardValue.HÉT),
                c(CardColor.PIROS, CardValue.HÉT),
                c(CardColor.ZÖLD, CardValue.HÉT),
                c(CardColor.MAKK, CardValue.NYOLC),
                c(CardColor.TOK, CardValue.KILENC),
                c(CardColor.PIROS, CardValue.TÍZES),
                c(CardColor.ZÖLD, CardValue.ÁSZ)
        );
        assertThrows(InvalidHandSizeException.class, () -> new Hand(cards));
    }

    @ParameterizedTest
    @MethodSource("handsAndExpectedTypes")
    void evaluate_returnsExpectedType(List<HungarianCard> cards, HandType expected) {
        Hand hand = new Hand(cards);
        assertEquals(expected, evaluator.evaluate(hand));
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> handsAndExpectedTypes() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(
                        List.of(
                                c(CardColor.MAKK, CardValue.HÉT),
                                c(CardColor.TOK, CardValue.HÉT),
                                c(CardColor.PIROS, CardValue.HÉT),
                                c(CardColor.ZÖLD, CardValue.HÉT),
                                c(CardColor.MAKK, CardValue.NYOLC),
                                c(CardColor.TOK, CardValue.KILENC),
                                c(CardColor.PIROS, CardValue.TÍZES)
                        ),
                        HandType.POKER
                ),

                org.junit.jupiter.params.provider.Arguments.of(
                        List.of(
                                c(CardColor.PIROS, CardValue.HÉT),
                                c(CardColor.PIROS, CardValue.NYOLC),
                                c(CardColor.PIROS, CardValue.KILENC),
                                c(CardColor.PIROS, CardValue.TÍZES),
                                c(CardColor.PIROS, CardValue.ÁSZ),
                                c(CardColor.PIROS, CardValue.KIRÁLY),
                                c(CardColor.PIROS, CardValue.ALSÓ)
                        ),
                        HandType.FLUSH
                )
        );
    }

    private static HungarianCard c(CardColor color, CardValue value) {
        return new HungarianCard(color, value);
    }
}

