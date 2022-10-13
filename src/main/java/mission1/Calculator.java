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

    public int getCurrentResult(String operator, int previousResult, int currentValue) {
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
            if (isOperator(values[i])) {
                operator = values[i];
                continue;
            }

            int currentValue = Integer.parseInt(values[i]);
            result = getCurrentResult(operator, result, currentValue);
        }

        return result;
    }
}
