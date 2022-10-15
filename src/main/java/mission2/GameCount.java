package mission2;

public class GameCount {
    private final Strike strike;
    private final Ball ball;

    public GameCount() {
        strike = new Strike();
        ball = new Ball();
    }

    public void count(boolean isSameIndex, boolean isSameNumber) {
        strike.count(isSameIndex, isSameNumber);
        ball.count(isSameIndex, isSameNumber);
    }

    public Strike getStrike() {
        return strike;
    }

    public Ball getBall() {
        return ball;
    }
}
