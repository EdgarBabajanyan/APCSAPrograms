import java.util.Scanner;
import java.lang.Math;
/* Edgar babajanyan
 * Rev.1 10/12/2021
 * This is the DataTypesTester "Backend". 
 * This is what the front-end works with. He/She types in the numbers and then
 * He/She gets information on these numbers with the min and max methods.
 * 
 */


public class DataSet
{
    private double Num1 = 0;
    private double Num2 = 0;
    private double Num3 = 0;
    private double Num4 = 0;
    
            public double MathMax(){
                double maxthingfinal = (Math.max(Num1, Math.max(Num2, Math.max(Num3,Num4)))); // Came up with this stupid crazy solution to the error! It simplifies comparisons between
                return maxthingfinal; // 4 double values! I did the same for the minimum.
            }
            public double MathMin(){
                double minthing = (Math.min(Num1, Math.min(Num2, Math.min(Num3,Num4))));
                return minthing;
            }    
        public DataSet(double Number1, double Number2, double Number3, double Number4)
            {
                Num1 = Number1;
                Num2 = Number2;
                Num3 = Number3;
                Num4 = Number4;

    }
}
