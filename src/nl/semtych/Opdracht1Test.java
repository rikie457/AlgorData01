package nl.semtych;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Opdracht1Test {

    @Test
    void sortedMinMax() {
        Opdracht1 opdracht1  = new Opdracht1(0);
        final int[] dataset = {0, 1, 4, 2, 8, 6};
        final int[] expected = new int[]{0,8};
        int[] result = opdracht1.sortedMinMax(dataset);
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    void sortedMinMax2() {
        Opdracht1 opdracht1  = new Opdracht1(0);
        final int[] dataset = {50,40,22,55,1,9,78};
        final int[] expected = new int[]{1,78};
        int[] result = opdracht1.sortedMinMax(dataset);
        Assertions.assertArrayEquals(result, expected);
    }
}