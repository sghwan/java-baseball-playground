package mission2;

public class Ball {
    private int count;

    public Ball() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    private int isBall(boolean isSameIndex, boolean isSameNumber) {
        if (!isSameIndex && isSameNumber)
            return 1;

        return 0;
    }

    public int count(boolean isSameIndex, boolean isSameNumber) {
        count += isBall(isSameIndex, isSameNumber);
        return count;
    }

}
