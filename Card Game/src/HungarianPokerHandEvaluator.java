import java.util.*;

public final class HungarianPokerHandEvaluator {

    private static final HungarianPokerHandEvaluator INSTANCE = new HungarianPokerHandEvaluator();

    private HungarianPokerHandEvaluator() {
    }

    public static HungarianPokerHandEvaluator getInstance() {
        return INSTANCE;
    }

    public HandType evaluate(Hand hand) {
        if (hand == null) {
            throw new IllegalArgumentException("hand must not be zero");
        }

        int maxSameValue = maxCountByValue(hand);
        int maxSameColor = maxCountByColor(hand);


        if (maxSameValue >= 4) {
            return HandType.POKER;
        }
        if (maxSameColor == 7) {
            return HandType.FLUSH;
        }
        if (maxSameColor >= 4) {
            return HandType.ALMOST_FLUSH;
        }
        return HandType.NOTHING;
    }

    private int maxCountByValue(Hand hand) {
        Map<CardValue, Integer> counts = new EnumMap<>(CardValue.class);
        int max = 0;
        for (HungarianCard c : hand.getCards()) {
            int next = counts.getOrDefault(c.getValue(), 0) + 1;
            counts.put(c.getValue(), next);
            if (next > max) max = next;
        }
        return max;
    }

    private int maxCountByColor(Hand hand) {
        Map<CardColor, Integer> counts = new EnumMap<>(CardColor.class);
        int max = 0;
        for (HungarianCard c : hand.getCards()) {
            int next = counts.getOrDefault(c.getColor(), 0) + 1;
            counts.put(c.getColor(), next);
            if (next > max) max = next;
        }
        return max;
    }
}
