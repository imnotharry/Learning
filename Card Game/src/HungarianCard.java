import java.util.Objects;

public final class HungarianCard {
    private final CardColor color;
    private final CardValue value;

    public HungarianCard(CardColor color, CardValue value) {
        if (color == null || value == null) {
            throw new IllegalArgumentException("color and value must not be zero");
        }
        this.color = color;
        this.value = value;
    }

    public CardColor getColor() {
        return color;
    }

    public CardValue getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HungarianCard)) return false;
        HungarianCard that = (HungarianCard) o;
        return color == that.color && value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value);
    }

    @Override
    public String toString() {
        return value + " of " + color;
    }
}