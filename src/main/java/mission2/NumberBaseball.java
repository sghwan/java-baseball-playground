package mission2;

import java.util.ArrayList;
import java.util.List;

public class NumberBaseball {
    private final String gameNumber;
    private final ArrayList<Integer> numberList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public NumberBaseball() {
        gameNumber = pickNumbers();
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

    public String getGameNumber() {
        return gameNumber;
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }
}
