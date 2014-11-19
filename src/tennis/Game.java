package tennis;


public class Game {
    private ScoreBoard scoreBoard;

    public Game(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public void score(String points) {
        for (String point : points.split("")) {
            if (point.equals("1")){
                scoreBoard.player1Scores();
            }
            else {
                scoreBoard.player2Scores();
            }
            scoreBoard.report();
        }
    }
}
