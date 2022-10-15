package mission2;

public class Strike {

    private int count;

    public Strike() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    private int isStrike(boolean isSameIndex, boolean isSameNumber) {
        if (isSameIndex && isSameNumber)
            return 1;

        return 0;
    }

    public int count(boolean isSameIndex, boolean isSameNumber) {
        count += isStrike(isSameIndex, isSameNumber);
        return count;
    }

}
