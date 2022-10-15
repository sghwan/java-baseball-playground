package mission2;

import java.util.ArrayList;
import java.util.List;

public class NumberBaseball {
    private final String gameNumber;
    private final ArrayList<Integer> numberList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
    private final Count gameCount;

    public NumberBaseball() {
        gameNumber = pickNumbers();
        gameCount = new Count();
    }

    /**
     * 테스트를 위한 getter
     */
    public String getGameNumber() {
        return gameNumber;
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }

    /**
     * 사용자가 맞춰야 할 숫자를 세팅하는 메서드
     *
     * @return gameNumber;
     */
    private String pickNumbers() {
        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 7; i--) {
            int index = (int) (Math.random() * 10) % i;
            sb.append(numberList.get(index));
            numberList.remove(index);
        }

        return sb.toString();
    }

    private Count countHit(int index, String value) {
        for (int j = 0; j < value.length(); j++) {
            boolean isSameIndex = index == j;
            boolean isSameNumber = gameNumber.charAt(index) == value.charAt(j);
            //boolean isSameNumber = "123".charAt(index) == value.charAt(j); //테스트용
            gameCount.countStrike(isSameIndex, isSameNumber);
            gameCount.countBall(isSameIndex, isSameNumber);
        }
        return gameCount;
    }

    public Count countTotalHit(String value) {
        for (int i = 0; i < value.length(); i++) {
            countHit(i, value);
        }
        return gameCount;
    }

    public String countTotalHitToString(String value) {
        StringBuilder hitCount = new StringBuilder();
        Count count = countTotalHit(value);
        int strikeCount = count.getStrike();
        int ballCount = count.getBall();

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
