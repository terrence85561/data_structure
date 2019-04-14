package com.company;

import java.util.Arrays;

public class testFinal {

    private final double[] coords;
    public testFinal(double[] a){
        System.out.println(Arrays.toString(a));
        coords = a;
    }
    public double[] getCoords(){
        return this.coords;
    }

    public static void main(String[] args) {
        double[] a = {3.0,4.0};
        testFinal T = new testFinal(a);
        a[0] = 0.0;
        System.out.println(Arrays.toString(T.getCoords()));

    }
}
