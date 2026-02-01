import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Hand {
    private static final int HAND_SIZE = 7;

    private final List<HungarianCard> cards;

    public Hand(List<HungarianCard> cards) {
        if (cards == null) {
            throw new IllegalArgumentException("cards must not be null");
        }
        if (cards.size() != HAND_SIZE) {
            throw new InvalidHandSizeException(
                    "A hand must contain exactly " + HAND_SIZE + " cards, but got: " + cards.size()
            );
        }

        this.cards = Collections.unmodifiableList(new ArrayList<>(cards));
    }

    public List<HungarianCard> getCards() {
        return cards;
    }
}