package tennis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void shouldStringifyTo0WhenScoreIs0() {
        Score score = new Score(0);

        assertThat(score.toString(), is("0"));
    }

    @Test
    public void shouldIncreaseScoreBy15WhenPointIsWon() {
        Score score = new Score(0);

        score.winsPoint();

        assertThat(score.toString(), is("15"));
    }

    @Test
    public void shouldIncreaseBy10WhenScoreIs30AndPointIsWon() {
        Score score = new Score(30);

        score.winsPoint();

        assertThat(score.toString(), is("40"));
    }
}