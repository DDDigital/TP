
package testapp;
import java.util.Scanner;
public class TestApp {
public static void main(String[] args) {
// TODO code application logic here
Scanner in = new Scanner(System.in);
System.out.print("1st num: ");
double a = Double.valueOf(in.nextLine());
System.out.print("2nd num: ");
double b = Double.valueOf(in.nextLine());
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("GIT test application");
}

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

}
}