package tennis;


import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {

    private Game game;
    private ScoreBoard scoreBoard;

    @Before
    public void setUp() throws Exception {
        scoreBoard = mock(ScoreBoard.class);
        game = new Game(scoreBoard);
    }

    @Test
    public void player1ShouldScoreWhenTheFirstCharacterIs1() {
        game.score("1");

        verify(scoreBoard).player1Scores();
    }

    @Test
    public void player2ShouldScoreWhenTheFirstCharacterIs2() {
        game.score("2");

        verify(scoreBoard).player2Scores();
    }

    @Test
    public void shouldScorePlayer1TwiceWhenThereAreTwo1s() {
        game.score("11");

        verify(scoreBoard, times(2)).player1Scores();
    }

    @Test
    public void shouldScoreBothPlayersWhenThereIsA1AndA2() {
        game.score("21");

        verify(scoreBoard).player1Scores();
        verify(scoreBoard).player2Scores();
    }
}