package tennis;

import static java.lang.String.valueOf;

public class Score {
    private int total;

    public Score(int total) {
        this.total = total;
    }

    public void increaseBy(int amount) {
        total += amount;
    }

    @Override
    public String toString() {
        return valueOf(total);
    }
}
