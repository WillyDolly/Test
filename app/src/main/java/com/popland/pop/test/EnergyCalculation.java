package com.popland.pop.test;

import android.util.Log;

import java.math.BigInteger;

/**
 * Created by hai on 22/12/2016.
 */

public class EnergyCalculation {
    final double c = 300000;
    public float calculation(float mass){
        float energy = mass*2;
        return energy;
    }
    public static void log(){
        Log.d("ten", BigInteger.TEN+"");
    }
}
