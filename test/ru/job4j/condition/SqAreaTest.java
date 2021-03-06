package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6andK2ThenSquare2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.000000000001);
    }
}