package tennis;

import java.io.PrintStream;

public class ScoreBoard {
    private Score player1Score;
    private Score player2Score;
    private PrintStream printStream;

    public ScoreBoard(PrintStream printStream, Score player1Score, Score player2Score) {
        this.printStream = printStream;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public void player1Scores() {
        player1Score.increaseBy(15);
    }

    public void player2Scores() {
        player2Score.increaseBy(15);
    }

    public void report() {
        printStream.println(player1Score + "/" + player2Score);
    }
}
