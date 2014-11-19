package tennis;

import static java.lang.String.valueOf;

public class Score {
    private int total;

    public Score(int total) {
        this.total = total;
    }

    public void winsPoint() {
        int increase = 15;
        if (total == 30){
            increase = 10;
        }

        total += increase;
    }

    @Override
    public String toString() {
        return valueOf(total);
    }
}
