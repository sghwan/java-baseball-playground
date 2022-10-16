package mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberBaseballGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = "1";

        while (command.equals("1")) {
            NumberBaseball baseball = new NumberBaseball();
            GameCount count = new GameCount();
            InputView inputView = new InputView(baseball, count);
            inputView.answerLoop();
            command = br.readLine();
        }
    }
}
