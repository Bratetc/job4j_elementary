package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenPoints0sem0And0sem2ThenDistance2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.000000000001);
    }
}