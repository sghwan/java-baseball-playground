package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set의 크기를 size() 메서드를 통해 확인")
    void size() {
        //Set Collection은 중복을 허락하지 않는다.
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("Set의 원소를 확인 contains() 메소드를 통해 확인 ")
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("Set의 원소를 확인 contains() 메소드를 통해 확인 @ParameterizeTest 사용")
    void containsByParameterizeTest(int element) {
        assertThat(numbers.contains(element)).isTrue();
    }
}
