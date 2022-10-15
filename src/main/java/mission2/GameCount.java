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

    @Override
    public String toString() {
        StringBuilder hitCount = new StringBuilder();
        int strikeCount = strike.getCount();
        int ballCount = ball.getCount();

        if (strikeCount == 0 && ballCount == 0)
            hitCount.append("낫싱");
        if (strikeCount > 0 && ballCount > 0)
            hitCount.append(strikeCount).append("스트라이크 ").append(ballCount).append("볼");
        if (strikeCount > 0 && ballCount == 0)
            hitCount.append(strikeCount).append("스트라이크");
        if (strikeCount == 0 && ballCount > 0)
            hitCount.append(ballCount).append("볼");

        return hitCount.toString();
    }
}
