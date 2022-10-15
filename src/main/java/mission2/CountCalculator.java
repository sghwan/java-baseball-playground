package mission2;

public class CountCalculator {
    private final String gameNumber;
    private GameCount gameCount;

    public CountCalculator(String gameNumber) {
        this.gameNumber = gameNumber;
    }

    private void newGameCount() {
        gameCount = new GameCount();
    }

    private void countHit(int index, String value) {
        for (int j = 0; j < value.length(); j++) {
            boolean isSameIndex = index == j;
            boolean isSameNumber = gameNumber.charAt(index) == value.charAt(j);
            //boolean isSameNumber = "123".charAt(index) == value.charAt(j); //테스트용
            gameCount.count(isSameIndex, isSameNumber);
        }
    }

    private void countTotalHit(String value) {
        for (int i = 0; i < value.length(); i++) {
            countHit(i, value);
        }
    }

    public GameCount calculateCount(String value) {
        newGameCount();
        countTotalHit(value);
        return gameCount;
    }
}
