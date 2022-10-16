package mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberBaseballGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumberBaseball baseball = new NumberBaseball();
        InputValidator validator = new InputValidator();
        String command = "1";

        while (true) {
            System.out.print("각 자리수가 서로 다른 세자리 숫자를 입력해 주세요 : ");
            String input = br.readLine();
            if (!validator.validateUserInput(input))
                continue;
            GameCount count = baseball.compare(input);
            System.out.println(count.toString());
            if (count.getStrike().getCount() == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            }
        }
    }
}
