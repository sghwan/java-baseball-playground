package mission1;

public class Calculator {
    private int result = 0;
    private String operator = "";

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

    public void setResult(String value) {
        if (!isOperator(value)) {
            int currentValue = Integer.parseInt(value);
            result = getCurrentResult(result, currentValue, operator);
        }
    }

    public void setOperator(String value) {
        if (isOperator(value))
            operator = value;
    }

    public int calculate(String input) {
        String[] values = input.split(" ");

        for (int i = 0; i < values.length; i++) {
            setOperator(values[i]);
            setResult(values[i]);
        }

        return result;
    }
}
