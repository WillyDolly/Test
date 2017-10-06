package com.popland.pop.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hai on 22/12/2016.
 */

public class EnergyCalculationTest {
    @Test
    public void ConverterUnitTest() throws Exception {
        float input = 1;
        float output;
        float expected = 80000000000f;
        float delta =    0.1f;
        EnergyCalculation ec = new EnergyCalculation();
        output = ec.calculation(input);
        assertEquals(expected,output,delta);
    }
}
