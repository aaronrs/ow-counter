package net.astechdesign.counter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PopulationCounterTest {

    private PopulationCounter counter = new PopulationCounter();

    @Test
    public void shouldReturnZeroForZero() {
        assertThat(counter.count(0), is(0));
    }

    @Test
    public void shouldReturnOneForOne() {
        assertThat(counter.count(1), is(1));
    }

    @Test
    public void shouldReturnOneForPowersOfTwo() {
        int[] values = {2,3,7,15,20};
        for (int value : values) {
            assertThat(counter.count((int) Math.pow(2,value)), is(1));
        }
    }

    @Test
    public void shouldReturnXForTwoToPowerXMinusOne() {
        int[] values = {2,3,7,15,20};
        for (int value : values) {
            assertThat(counter.count((int) Math.pow(2,value) - 1), is(value));
        }
    }

    @Test
    public void shouldReturnTestValuesInReadme() {
        assertThat(counter.count(5), is(2));
        assertThat(counter.count(0), is(0));
        assertThat(counter.count(8), is(1));
        assertThat(counter.count(19), is(3));
    }
}