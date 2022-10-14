package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ListTest {
    ArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    @Test
    void remove() {
        Assertions.assertThat(list.size()).isEqualTo(4);
        list.remove(1);
        Assertions.assertThat(list.size()).isEqualTo(3);
        Assertions.assertThat(list.get(1)).isEqualTo(3);
    }
}
