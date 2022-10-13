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


    public int calculate(String input) {
        String[] values = input.split(" ");
        int result = 0;
        String operator = "";
        for (int i = 0; i < values.length; i++) {
            if (isOperator(values[i]))
                operator = values[i];
            else {
                int currentValue = Integer.parseInt(values[i]);
                if (operator.equals(""))
                    result = Integer.parseInt(values[i]);
                if (operator.equals("+"))
                    result = add(result, currentValue);
                if (operator.equals("-"))
                    result = subtract(result, currentValue);
                if (operator.equals("*"))
                    result = multiply(result, currentValue);
                if (operator.equals("/"))
                    result = divide(result, currentValue);
            }
        }
        return result;
    }
}
