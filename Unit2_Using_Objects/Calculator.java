/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2_Using_Objects;

/**
 *
 * @author 67364
 */
import java.util.Scanner;
public class Calculator {
    double x;
    double y;

    public Calculator(double x, double y) {
	this.x = x;
	this.y = y;
    }
    
    public void add(){
	System.out.println(x + y);
    }
    
    public void subtract(){
	System.out.println(x - y);
    }
    
    public void multiply(){
	System.out.println(x * y);
    }
    
    public void divide(){
	System.out.println(x / y);
    }
    
    public void remainder(){
	System.out.println(x % y);
    }
}

class TestCalculator{
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the value of x: ");
	double x = in.nextDouble();
	System.out.print("Enter the value for y: ");
	double y = in.nextDouble();
	Calculator calc1 = new Calculator(x, y);
	
	System.out.println("");
	calc1.add();
	calc1.subtract();
	calc1.multiply();
	calc1.divide();
	
    }
}
