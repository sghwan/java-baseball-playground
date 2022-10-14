package mission1;

public class Calculator {
    private int result = 0;
    private String operator = "";

    public boolean isOperator(String value) {
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
    }

    public int add(int currentResult, int currentValue) {
        return currentResult + currentValue;
    }

    public int subtract(int currentResult, int currentValue) {
        return currentResult - currentValue;
    }

    public int multiply(int currentResult, int currentValue) {
        return currentResult * currentValue;
    }

    public int divide(int currentResult, int currentValue) {
        return currentResult / currentValue;
    }

    public int calculateNextResult(int currentResult, int currentValue) {
        if (operator.equals("+"))
            return add(currentResult, currentValue);
        if (operator.equals("-"))
            return subtract(currentResult, currentValue);
        if (operator.equals("*"))
            return multiply(currentResult, currentValue);
        if (operator.equals("/"))
            return divide(currentResult, currentValue);

        return currentValue;
    }

    public void updateResult(String value) {
        if (!isOperator(value)) {
            int currentValue = Integer.parseInt(value);
            result = calculateNextResult(result, currentValue);
        }
    }

    public void updateOperator(String value) {
        if (isOperator(value))
            operator = value;
    }

    public int calculate(String input) {
        String[] values = input.split(" ");

        for (String value : values) {
            updateOperator(value);
            updateResult(value);
        }

        return result;
    }
}
