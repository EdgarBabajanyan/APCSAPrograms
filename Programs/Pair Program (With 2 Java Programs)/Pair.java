import java.util.Scanner;
import java.lang.Math;
/* Edgar Babajanyan
 * Rev.1 10/12/2021
 * This is the PairTester "Backend". 
 * This is what the user interacts with. He/She types in a number and another
 * number. He/She gets information on the number based on these methods.
 * 
 */


public class Pair
{
    private double Num1 = 0;
    private double Num2 = 0;
            public double getSum(){
                double sumthing = Num1 + Num2;
                return sumthing;
            }
            public double getDiff(){
                double diffthing = Num1 - Num2;
                return diffthing;
            }
    
            public double getProduct(){
                double prodthing = Num1 * Num2;
                return prodthing;
            }
            public double getAvg(){
                double avgthing = (Num1 + Num2)/2;
                return avgthing;
            }
                
            public double getDist(){
                double disthing = Math.abs(Num1 - Num2);
                return disthing;
            }
            
            public double getMax(){
                double maxthing = Math.max(Num1,Num2);
                return maxthing;
            }
            public double getMin(){
                double minthing = Math.min(Num1, Num2);
                return minthing;
            }    
        public Pair(double Number1, double Number2)
            {
                Num1 = Number1;
                Num2 = Number2;

    }
}
