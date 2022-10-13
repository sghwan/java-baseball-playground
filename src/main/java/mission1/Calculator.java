package mission1;

public class Calculator {
    public int calculate(String input) {
        String[] values = input.split(" ");
        int result = 0;
        String operator = "";
        for (int i = 0; i < values.length; i++) {
            switch (values[i]) {
                case "+":
                    operator = "+";
                    break;
                case "-":
                    operator = "-";
                    break;
                case "*":
                    operator = "*";
                    break;
                case "/":
                    operator = "/";
                    break;
                default:
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
                    break;
            }
        }
        return result;
    }
}
