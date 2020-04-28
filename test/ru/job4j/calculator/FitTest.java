package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight178ThenWeight89dot69() {
        double man = 178;
        double expected = 89.69;
        double out = Fit.manWeight(man);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight166ThenWeight64dot39() {
        double woman = 166;
        double expected = 64.39;
        double out = Fit.womanWeight(woman);
        Assert.assertEquals(expected, out, 0.01);
    }
}