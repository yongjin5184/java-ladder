package ladder.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("랜덤 제너레이터 테스트")
class RandomGeneratorTest {

    @DisplayName("랜덤 제너레이터 생성 테스트")
    @Test
    public void createRandomGeneratorTest() {
        assertThat(RandomGenerator.create()).isBetween(0, 1);
    }
}