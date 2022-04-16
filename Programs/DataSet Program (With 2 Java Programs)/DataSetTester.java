import java.util.Scanner;
/* Edgar Babajanyan
 * Rev.1 10/12/2021
 * This is the DataSetTester "Front-end". This is what the user interacts with. He/She types in 4 numbers.
 * He/She then gets the greatest and least of the 4 numbers entered
 * All of this is then printed to the terminal.
 */


public class DataSetTester
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input any number: ");
        double Num1 = in.nextDouble(); 
        
        System.out.println("Input another number different from the first number: ");
        double Num2 = in.nextDouble();
        
        System.out.println("Input another number different from the second number: ");
        double Num3 = in.nextDouble();
        
        System.out.println("Input another number different from the thrid number: ");
        double Num4 = in.nextDouble();
        
        DataSet NumAnalyze = new DataSet(Num1, Num2, Num3, Num4);
        
        System.out.println("This is the greatest number of the 4 numbers entered: " + NumAnalyze.MathMax() + ".");
        
        System.out.println("This is the lesser of the 4 numbers entered: " + NumAnalyze.MathMin() + ".");
        
        
    
    

    }
}
