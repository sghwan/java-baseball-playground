package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String str1 = "1,2";
        //contains()는 예상값이 결과값에 하나라도 존재하면 test 통과
        assertThat(str1.split(",")).contains("1");
        assertThat(str1.split(",")).contains("2");

        //contains()는 예상값과 결과값에 대한 순서가 상관 없다.
        assertThat(str1.split(",")).contains("2", "1");

        //contains()는 예상값에 중복이 있더라도 결과값에 중복된 값들이 존재하기만 하면 test 통과
        assertThat(str1.split(",")).contains("2", "1", "1", "2");

        //containsExactly()는 예상값이 결과값이 순서가 완벽히 동일해며 중복이 없어야 한다.
        assertThat("1,2".split(",")).containsExactly("1", "2");

        String str2 = "1";
        assertThat(str2.split(",")).contains("1");
    }

    @Test
    void substring() {
        String str = "(1,2)";
        assertThat(str.substring(1, str.length() - 1)).isEqualTo("1,2");
    }
}
