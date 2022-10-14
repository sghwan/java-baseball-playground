package mission2;

import java.util.ArrayList;
import java.util.List;

public class NumberBaseball {
    private String gameNumber;
    private ArrayList<Integer> numberList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public NumberBaseball() {
        gameNumber = pickNumbers();
    }

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
