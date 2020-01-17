package nl.semtych;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opdracht3Test {

    @Test
    void recMinMax() {
        Opdracht3 opdracht3  = new Opdracht3(100);
        final int[] dataset = {0, 1, 4, 2, 8, 6};
        final int[] expected = new int[]{0,8};
        int[] result = opdracht3.recMinMax(dataset);
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    void recMinMax2() {
        Opdracht3 opdracht3  = new Opdracht3(100);
        final int[] dataset = {50,40,22,55,1,9,78};
        final int[] expected = new int[]{1,78};
        int[] result = opdracht3.recMinMax(dataset);
        Assertions.assertArrayEquals(result, expected);
    }
}