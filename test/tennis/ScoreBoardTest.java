package tennis;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ScoreBoardTest {

    private PrintStream printStream;
    private Score player1Score;
    private Score player2Score;
    private ScoreBoard scoreBoard;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        player1Score = mock(Score.class);
        player2Score = mock(Score.class);
        scoreBoard = new ScoreBoard(printStream, player1Score, player2Score);
    }

    @Test
    public void shouldReportZeroAllAsZeroSlashZero() {
        when(player1Score.toString()).thenReturn("0");
        when(player2Score.toString()).thenReturn("0");

        scoreBoard.report();

        verify(printStream).println("0/0");
    }

    @Test
    public void shouldReportTwoToThreeAsTwoSlashThree() {
        when(player1Score.toString()).thenReturn("2");
        when(player2Score.toString()).thenReturn("3");

        scoreBoard.report();

        verify(printStream).println("2/3");
    }

    @Test
    public void shouldIncreasePlayerOnesScoreBy15WhenTheyWinAPoint() {
        scoreBoard.player1Scores();

        verify(player1Score).increaseBy(15);
    }

    @Test
    public void shouldIncreasePlayerTwosScoreBy15WhenTheyWinAPoint() {
        scoreBoard.player2Scores();

        verify(player2Score).increaseBy(15);
    }

}