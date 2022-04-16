import java.util.Scanner;
/* Edgar Babajanyan
 * Rev.1 10/12/2021
 * This is the PairTester "Front-end". This is what the user interacts with. He/She types in a number and another
 * number. He/She then gets information on the number including the sum, 
 * difference, average, max number of the two numbers and the
 * smallest number of the two numbers. All of this is then printed to the terminal.
 */


public class PairTester
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input any number: ");
        double Num1 = in.nextDouble(); 
        
        System.out.println("Input another number different from the first number: ");
        double Num2 = in.nextDouble();
        
        Pair TestNums = new Pair(Num1, Num2);
        
        System.out.println("This is the sum of both numbers you entered " + TestNums.getSum() + ".");
        
        System.out.println("");
        
        System.out.println("This is the second number entered subtracted from the first number entered " + TestNums.getDiff() + ".");
        
        System.out.println("");
        
        System.out.println("This is the two numbers entered multiplied together " + TestNums.getProduct() + ".");
        
        System.out.println("");
        
        System.out.println("This is the two entered numbers averaged " + TestNums.getAvg());
    
        System.out.println("");
        
        System.out.println("This is the greatest number of the two entered numbers " + TestNums.getMax() + ".");
        
        System.out.println("");
        
        System.out.println("This is the lesser number of the two entered numbers " + TestNums.getMin() + ".");
        
    
    

    }
}
