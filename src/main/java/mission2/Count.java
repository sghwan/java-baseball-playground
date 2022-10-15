package mission2;

public class Count {
    private int strike;
    private int ball;

    public Count() {
        strike = 0;
        ball = 0;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public int countStrike(boolean isSameIndex, boolean isSameNumber) {
        strike += isStrike(isSameIndex, isSameNumber);
        return strike;
    }

    public int countBall(boolean isSameIndex, boolean isSameNumber) {
        ball += isBall(isSameIndex, isSameNumber);
        return ball;
    }

    private int isBall(boolean isSameIndex, boolean isSameNumber) {
        if (!isSameIndex && isSameNumber)
            return 1;

        return 0;
    }

    private int isStrike(boolean isSameIndex, boolean isSameNumber) {
        if (isSameIndex && isSameNumber)
            return 1;

        return 0;
    }
}
