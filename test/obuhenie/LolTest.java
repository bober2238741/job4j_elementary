package obuhenie;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LolTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Lol.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Lol.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}