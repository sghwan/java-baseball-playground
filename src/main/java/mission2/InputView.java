package mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final InputValidator validator = new InputValidator();
    private final NumberBaseball baseball;
    private GameCount count;

    public InputView(NumberBaseball baseball, GameCount count) {
        this.baseball = baseball;
        this.count = count;
    }

    public void answerLoop() throws IOException {
        while (count == null || count.getStrike().getCount() != 3) {
            String input = numberInput();
            count = baseball.compare(input);
            printCountString(count);
            printSentenceIfCorrectAnswer(count);
        }
    }

    public String numberInput() throws IOException {
        System.out.print("각 자리수가 서로 다른 세자리 숫자를 입력해 주세요 : ");
        String input = br.readLine();
        if (!validator.validateUserInput(input))
            return null;

        return input;
    }

    public void printSentenceIfCorrectAnswer(GameCount count) {
        if(count == null)
            return;

        if (count.getStrike().getCount() != 3)
            return;

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printCountString(GameCount count) {
        if (count == null) {
            System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
            return;
        }

        System.out.println(count);
    }
}
