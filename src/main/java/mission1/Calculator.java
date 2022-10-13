package mission1;

public class Calculator {
    public boolean isOperator(String value) {
        if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"))
            return true;

        return false;
    }

    public int calculate(String input) {
        String[] values = input.split(" ");
        int result = 0;
        String operator = "";
        for (int i = 0; i < values.length; i++) {
            if (isOperator(values[i]))
                operator = values[i];
            else {
                if (operator.equals("")) {
                    result = Integer.parseInt(values[i]);
                } else {
                    if (operator.equals("+"))
                        result += Integer.parseInt(values[i]);
                    if (operator.equals("-"))
                        result -= Integer.parseInt(values[i]);
                    if (operator.equals("*"))
                        result *= Integer.parseInt(values[i]);
                    if (operator.equals("/"))
                        result /= Integer.parseInt(values[i]);
                }
            }
        }
        return result;
    }
}
