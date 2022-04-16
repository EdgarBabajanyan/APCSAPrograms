import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 * This program is designed to take a user's input of 12 numbers or integers to be precise. The program then distributes those numbers into
 * three categories. Even, Odd, and Negative. It then tells the user which numbers fall into which category by displaying them as arrays.
 *
 * Edgar Babajanyan
 * 2/25/2022
 */
public class IntegersProgram
{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
          
    int [] twelveInt = new int [12];
          
    int countEven = 0;
          
    int countOdd = 0;
          
    int countNeg = 0;
                 
    
          
    for (int i = 0; i < twelveInt.length; i++) {
        System.out.println("Enter the #" + (i + 1) + " integer.");
        boolean ehandle = true;
        while (ehandle) {
            try {
              twelveInt [i] = in.nextInt();
              if (twelveInt[i] % 2 == 0){
                  countEven++;
              }
              if (twelveInt[i] % 2 != 0){
                  countOdd++;
              }
              if (twelveInt[i] < 0){
                  countNeg++;
              } 
              ehandle = false;
            } 
            catch (Exception e) {
              System.out.println("Please enter integers only");
              System.out.println("Enter the #" + (i + 1) + " integer.");
              in.next();
            }
        }
    }
    
    int [] evens = new int [countEven];    
    int [] odds = new int [countOdd];
    int [] negatives = new int [countNeg];
        
    
    countEven = 0;
    countOdd = 0;
    countNeg = 0;
    
        
    
    for (int i : twelveInt) {
            if (i % 2 == 0){
                evens[countEven++] = i;
            }
            if (i % 2 != 0){
                odds[countOdd++] = i;
            }
            if (i < 0){
                negatives[countNeg++] = i;
            }          
        }
              
    System.out.println("Here are the Even numbers you entered");
    System.out.println(Arrays.toString(evens));
          
    System.out.println("Here are the Odd numbers you entered");
    System.out.println(Arrays.toString(odds));
          
    System.out.println("Here are the Negative numbers you entered");
    System.out.println(Arrays.toString(negatives));
  }
}
      
          
          //System.out.print(Arrays.toString(twelveInt));
    