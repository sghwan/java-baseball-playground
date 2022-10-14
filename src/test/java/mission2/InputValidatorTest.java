package mission2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    InputValidator inputValidator;

    @BeforeEach
    void setUp() {
        inputValidator = new InputValidator();
    }

    @ParameterizedTest
    @CsvSource(value = {"123,true", "1234,false"})
    @DisplayName("checkStringLength()은 문자열 길이가 일정 제한을 넘는지 판단합니다.")
    void checkStringLength(String value, boolean expected) {
        boolean actual = inputValidator.checkStringLength(value);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"123,false", "121,true"})
    @DisplayName("checkDuplicateNumber()은 문자열에서 중복여부를 판단합니다.")
    void checkDuplicateNumber(String value, boolean expected) {
        boolean actual = inputValidator.checkDuplicateNumber(value);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"123,true", "456,true", "121,false", "1234,false"})
    @DisplayName("validateUserInput()은 사용자가 입력한 값이 3자리이고 중복이 없는 수인지 확인한다.")
    void validateUserInput(String userInput, boolean expected) {
        boolean actual = inputValidator.validateUserInput(userInput);
        assertThat(actual).isEqualTo(expected);
    }

    @AfterEach
    void tearDown() {
        inputValidator = null;
    }
}