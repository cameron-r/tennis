package tennis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void shouldStringifyTo15WhenScoreIs15() {
        Score score = new Score(15);

        assertThat(score.toString(), is("15"));
    }

    @Test
    public void shouldBeTotalOfInitialAmountAndIncrease() {
        Score score = new Score(1);
        score.increaseBy(2);

        assertThat(score.toString(), is("3"));
    }
}