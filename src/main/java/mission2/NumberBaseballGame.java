package mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberBaseballGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //게임시작 및 컴퓨터 숫자 세팅
        NumberBaseball baseball = new NumberBaseball();

        while (true) {
            String input = br.readLine();
            InputValidator validator = new InputValidator();
            if (!validator.validateUserInput(input))
                continue;
            GameCount count = baseball.compare(input);
            System.out.println(count.toString());
        }
    }
}
