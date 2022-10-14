package mission2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class NumberBaseballTest {

    NumberBaseball numberBaseball;

    @BeforeEach
    void setUp() {
        numberBaseball = new NumberBaseball();
    }

    @Test
    @DisplayName("인스턴스가 생성될 시 생성자에서 pickNumbers()가 호출되어 게임 숫자가 세팅된다.")
    void pickNumbers() {
        ArrayList<Integer> list = numberBaseball.getNumberList();
        String gameNumber = numberBaseball.getGameNumber();

        assertThat(list.size()).isEqualTo(6);
        assertThat(gameNumber.length()).isEqualTo(3);
    }

    @AfterEach
    void tearDown() {
        numberBaseball = null;
    }
}
