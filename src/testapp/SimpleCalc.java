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
this.a=5;
this.b=5;
}

public double getSum() {

return this.a+this.b;
}
public double getDiff() {

return this.a-this.b;
}
public double getMult() {

return this.a*this.b;
}
public double getDiv() {

return this.a/this.b;
}
}
