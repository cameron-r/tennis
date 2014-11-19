package tennis;

public class Main {

    public static void main(String[] args) {
        new Game(new ScoreBoard(System.out, new Score(0), new Score(0))).score("11221");
    }
}
