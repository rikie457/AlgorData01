package nl.semtych;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opdracht2Test {

    @Test
    void seqMinMax() {
        Opdracht2 opdracht2  = new Opdracht2(100);
        final int[] dataset = {0, 1, 4, 2, 8, 6};
        final int[] expected = new int[]{0,8};
        int[] result = opdracht2.seqMinMax(dataset);
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    void seqMinMax2() {
        Opdracht2 opdracht2  = new Opdracht2(100);
        final int[] dataset = {50,40,22,55,1,9,78};
        final int[] expected = new int[]{1,78};
        int[] result = opdracht2.seqMinMax(dataset);
        Assertions.assertArrayEquals(result, expected);
    }
}