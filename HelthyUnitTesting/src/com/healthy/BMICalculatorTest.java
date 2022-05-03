package com.healthy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMICalculatorTest {

    @Test

    public void test() {
        assertTrue(BMICalculator.isDietRecommended(89,1.72));
    }


}