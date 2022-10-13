package mission1;

public class Calculator {
    public boolean isOperator(String value) {
        if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"))
            return true;

        return false;
    }

    public int add(int previousResult, int currentValue) {
        return previousResult + currentValue;
    }

    public int subtract(int previousResult, int currentValue) {
        return previousResult - currentValue;
    }

    public int multiply(int previousResult, int currentValue) {
        return previousResult * currentValue;
    }

    public int divide(int previousResult, int currentValue) {
        return previousResult / currentValue;
    }

    public int getCurrentResult(int previousResult, int currentValue, String operator) {
        if (operator.equals("+"))
            return add(previousResult, currentValue);
        if (operator.equals("-"))
            return subtract(previousResult, currentValue);
        if (operator.equals("*"))
            return multiply(previousResult, currentValue);
        if (operator.equals("/"))
            return divide(previousResult, currentValue);

        return currentValue;
    }

    public int calculate(String input) {
        String[] values = input.split(" ");
        int result = 0;
        String operator = "";

        for (int i = 0; i < values.length; i++) {
            if (!isOperator(values[i])) {
                int currentValue = Integer.parseInt(values[i]);
                result = getCurrentResult(result, currentValue, operator);
            }

            operator = values[i];
        }

        return result;
    }
}
