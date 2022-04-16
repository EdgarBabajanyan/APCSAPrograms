import java.util.Scanner;
import java.lang.Math;
/**
 * This is the Quadratic Tester Program. Here, the program displays real
 * solutions of the Quadratic formula given double values a,b, and c. It also displays which of the solutions are greater than or lesser than each other.
 *
 * Edgar Babajanyan
 * 11/22/2021
 */
public class QuadraticTester
{
    public static void main(String[] args) { 
                
                Scanner in = new Scanner(System.in);
                
                System.out.println("Enter a value for a: ");
                double a = in.nextDouble();
                System.out.println("Enter a value for b: ");
                double b = in.nextDouble();
                System.out.println("Enter a value for c: ");
                double c = in.nextDouble();
                
                double d =(b*b)-(4*a*c);
                double sol1=(double)(-b+Math.sqrt(d))/(2*a);
                double sol2=(double)(-b-Math.sqrt(d))/(2*a);
                
                Quadratic SolutionFinder = new Quadratic(a,b,c);
                
            if (d < 0){
                System.out.println("There are no real solutions for your inputted numbers.");
                  
            }
            else{
                System.out.println("The Real Solutions for your inputted numbers are: " + "x1 = " + sol1 + " and " + "x2 = " + sol2);
        }
        
        
        if (d < 0){
            System.out.println(SolutionFinder.hasSolutions());
        }
        
        System.out.println(SolutionFinder.getSolution1());
        System.out.println(SolutionFinder.getSolution2());
    }
}
