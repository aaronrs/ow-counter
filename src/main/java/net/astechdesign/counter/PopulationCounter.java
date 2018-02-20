package net.astechdesign.counter;

public class PopulationCounter {

    public static final int ONE = 0x0001;
    private static final String MSG = "Input value: %d, Bit count: %d";

    public static void main(String[] args) {

        PopulationCounter counter = new PopulationCounter();

        int[] values = {5, 0, 8, 15, 19};

        for (int value : values) {
            System.out.println( String.format(MSG, value, counter.count(value)));
        }
    }

    public int count(int value) {
        int count = 0;
        while (value > 0) {
            count += (value & ONE);
            value = value >>> 1;
        }
        return count;
    }
}
