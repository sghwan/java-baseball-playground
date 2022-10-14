package mission2;

public class InputValidator {
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
}
