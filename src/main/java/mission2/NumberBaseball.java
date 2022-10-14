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

    public boolean checkStringLength(String value) {
        if (value.length() > 3)
            return false;

        return true;
    }

    public boolean compareNumber(int start, int length, String value) {
        for (int i = start + 1; i < length; i++) {
            if (value.charAt(start) == value.charAt(i))
                return true;
        }

        return false;
    }

    public boolean checkDuplicateNumber(String value) {
        int length = value.length();

        for (int i = 0; i < length - 1; i++) {
            if (compareNumber(i, length, value))
                return true;
        }

        return false;
    }

    public boolean validateUserInput(String userInput) {
        if (!checkStringLength(userInput) || checkDuplicateNumber(userInput))
            return false;

        return true;
    }

    public String getGameNumber() {
        return gameNumber;
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }
}
