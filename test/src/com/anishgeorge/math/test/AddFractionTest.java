package com.anishgeorge.math.test;

import com.anishgeorge.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionTest {

    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue()); // intValue is scaffolding
    }

    @Test
    public void nonZeroPlusZero() {
        Fraction sum = new Fraction(1).plus(new Fraction(0));
        assertEquals(1, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        Fraction sum = new Fraction(4).plus(new Fraction(6));
        assertEquals(10, sum.intValue());
    }

    @Test
    public void negativeInputsWithNegativeOutput() {
        Fraction sum = new Fraction(-3).plus(new Fraction(2));
        assertEquals(-1, sum.intValue());
    }
}
