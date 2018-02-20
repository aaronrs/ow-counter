package net.astechdesign.counter;

public class PopulationCounter {

    public static final int ONE = 0x0001;

    public int count(int value) {
        int count = 0;
        while (value > 0) {
            count += (value & ONE);
            value = value >>> 1;
        }
        return count;
    }
}
