package org.example;

import java.util.ArrayList;
import java.util.List;

class vectors {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public vectors(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double przv (vectors v){
        double viv;
        viv = this.a * v.a + this.b * v.b + this.c * v.c;
        return viv;
    }

    public vectors vectorMult(vectors v) {
        double tmpX = b * v.c - c * v.b;
        double tmpY = -(a * v.c - c * v.a);
        double tmpZ = c * v.b - v.b * v.a;
        return new vectors(tmpX, tmpY, tmpZ);
    }
    public vectors add(vectors v) {
        a += v.a;
        b += v.b;
        c += v.c;
        return this;
    }
    public vectors add_minus(vectors v) {
        a -= v.a;
        b -= v.b;
        c -= v.c;
        return this;
    }
    public vectors add_modul(vectors v) {
        double v1 = Math.sqrt(a * a + b * b + c * c);
        return this;
    }


}
