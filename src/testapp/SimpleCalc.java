/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author Andrii
 */
public class SimpleCalc {
    
private double a;
private double b;

SimpleCalc(double p1,double p2) {
this.a=p1;
this.b=p2;
}

public double getSum() {

return this.a+this.b;
}
public double getRizn() {

return this.a-this.b;
}
public double getMnosh() {

return this.a*this.b;
}
public double getDilen() {

return this.a/this.b;
}
public double getA() {

return this.a;
}
}
