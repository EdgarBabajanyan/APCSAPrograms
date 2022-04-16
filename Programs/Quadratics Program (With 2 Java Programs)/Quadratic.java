import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.min;
import static java.lang.Math.max;
/**
 * This is the Quadratic Class, this is the backend program for 
 * the Quadratic Tester. This contains the methods and processes.
 *
 * Edgar Babajanyan
 * 11/22/2021
 */
public class Quadratic
{
    private double a = 0;
    private double b = 0;
    private double c = 0;
    
    double d =(b*b)-(4*a*c);
    double sol1=(-b+Math.sqrt(d))/(2*a);
    double sol2=(-b-Math.sqrt(d))/(2*a);
    
            public boolean hasSolutions(){
                return false;
            }
    

        
            public double getSolution1(){
                System.out.print("The Least of the two Solutions is: ");
                double minimum = (Math.min(sol1, sol2));
                return(minimum);
        }
            public double getSolution2(){
                System.out.print("The Greatest of the two Solutions is: ");
                double maximum = (Math.max(sol1, sol2));
                return(maximum);
        }

        public Quadratic(double Number1, double Number2, double Number3)
            {
                a = Number1;
                b = Number2;
                c = Number3;
    }
}
