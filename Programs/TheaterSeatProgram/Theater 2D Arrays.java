import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This is the TheaterSeat Program. It is able to search a 2D Array of Seats through two inputs. Value of the seat and/or location of the seat.
 * Users can also quit the program if they feel that they have purchased enough seats.
 *
 * Convenience of entering a capitalized input and it should still work as a valid input (S,P,Q)
 *
 * Edgar Babajanyan
 * 3/22/2022
 */

public class TwoDArray{
    public static void main(String[] args) {
        
        System.out.println("----------Welcome To Java Theater----------");
            
        System.out.println(" ");
            
        System.out.println("Columns  1   2   3   4   5   6   7   8   9  10");
            
        System.out.println("------------------------------------------------");
        
            
        
            
            int[][]  JavaTheater  =  {  // 9 rows horizontal
                                        // 10 rows vertical
                                        {  10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, //good
                                        
                                        {  10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, //good
                                        
                                        {  10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, //good
                                        
                                        {  10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, //good
                                        
                                        {  10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, //good
                                        
                                        {  10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, //good
                                        
                                        {  20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, //good
                                        
                                        {  20, 30, 30, 40, 50, 50, 40, 30, 30, 20 }, //good
                                        
                                        {  30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }
                                   };
        
        boolean looper = true;
        
        while(looper){
            for (int i = 0; i < JavaTheater.length; i++) {
                System.out.print("(Row) " + (i + 1) + "|");
                for (int j = 0; j < JavaTheater[i].length; j++) {
                    if(JavaTheater[i][j] == 0){
                        System.out.print(JavaTheater[i][j] + "   ");
                    }
                    else{
                       System.out.print(JavaTheater[i][j] + "  "); 
                    }
                }
                System.out.println();
            }
        
            Scanner in = new Scanner(System.in);
            
            int rowSelect = 0;
            
            int colSelect = 0;
            
            
            System.out.println(" ");
            
            System.out.println("Would you like a (s)eat, (p)rice, or to (q)uit?");
            
            String SeatRequest = in.nextLine();
            
            String seatRequestOff = SeatRequest.toLowerCase();
            
            
            if (seatRequestOff.equals("s")){
                System.out.println("Please enter the Row");
                
                boolean ehandle = true;
                
                while (ehandle) {
                    try {
                      rowSelect = in.nextInt();
                      if(rowSelect > 8 || rowSelect < 0){
                          System.out.print("These are not within our rows. Please enter a row between 1 and 9");
                          in.next();
                        }
                      else if(rowSelect < 8 && rowSelect > 0){
                          ehandle = false;
                        }  

                      else{
                          System.out.println("These are not within our rows. Please enter a row between 1 and 9");
                          in.next();
                      }
                    } 
                    catch (Exception e) {
                      System.out.println("Please enter row numbers only. (1 to 9)");
                      
                      System.out.println(" ");
                      
                      System.out.println("Please enter the Row");
                      in.next();
                    }
                }
                
                System.out.println("Please enter the Column");
                
                boolean ehandle2 = true;
                
                // Fix error trapping for columns and you need to error trap s, p, q...
                
                while (ehandle2) { 
                    try {
                      colSelect = in.nextInt();
                      if(colSelect > 9 && colSelect < 1){
                          System.out.print("These are not within our columns. Please enter a column between 1 and 10");
                          in.next();
                        }
                      else{
                          ehandle2 = false;
                      }
                    } 
                    catch (Exception e) {
                      System.out.println("Please enter column numbers only. (1 to 10)");
                      System.out.println(" ");
                      System.out.println("Please enter the Column");
                      in.next();
                    }
                }
                
                rowSelect --;
                
                colSelect--;
                
                
                if(JavaTheater[rowSelect][colSelect] == 0){
                    System.out.println("This seat isn't avaliable");
                    System.out.println("You may need to purchase a different seat");
                    System.out.println(" ");
                }
                
                else{
                    JavaTheater[rowSelect][colSelect] = 0;
                    
                    System.out.println("You purchased a seat in Row " + (1 + rowSelect) + " and in Column " + (1 + colSelect) + ".");
                    
                    System.out.println(" ");
                    
                    System.out.println("Enjoy the movie!");
                    
                    System.out.println(" ");
                }
                
                
        
                
                
                
            }
            else if(seatRequestOff.equals("p")){
                
                System.out.println("Enter a price from the seating! 10, 20, 30, 40, 50 ($)");
                
                int priceRequest = 0;
                
                boolean ehandle3 = true;
                
                while (ehandle3) {
                    try {
                      priceRequest = in.nextInt();
                      if(priceRequest!=10 && priceRequest!= 20 && priceRequest!=30 && priceRequest!=40 && priceRequest!=50){
                          System.out.println("This isn't a price we offer. Please re-enter your price point. (10, 20, 30, 40, 50)");
                          in.next();
                      }
                      else{
                          ehandle3 = false;
                        }
                    } 
                    catch (Exception e) {
                      System.out.println("Please enter prices only within our price range. (10, 20, 30, 40, 50)");
                      in.next();
                    }
                }
            
                boolean found = false;
                for (int i = 0; i < JavaTheater.length; i++) {
                        for (int j = 0; j < JavaTheater[i].length; j++) {
                            if (JavaTheater[i][j] == priceRequest){
                                System.out.println("Your seat is in Row " + (i + 1) + " and Column " + (j + 1) + ".");
                                
                                System.out.println(" ");
                                
                                System.out.println("Thank you and Enjoy the Movie!");
                                
                                System.out.println(" ");
                                
                                JavaTheater[i][j] = 0;
                                
                                found = true;
                                
                                i = 10;
                                
                                
                                break;
                                
                                
                            }
                        }
                 }
                        
                if (!found) {
                    System.out.println("There was no seat avaliable at this price.");
                    System.out.println(" ");
                    System.out.println("Please re-enter a different price point.");
                    System.out.println(" ");
                }
                
                
                // Must add error trapping in case seat isn't avaliable
                //JavaTheater[rowSelect][colSelect] = 0;
                
                
                
                
                
                
                
                
            }
            else if(seatRequestOff.equals("q")){
                System.out.println("Thank you and Goodbye!");
                break;
            }
            else{
                System.out.println("Unrecognized input. Re-enter please");
                System.out.println(" ");
            }
            
            
            //if(
            
            // Prompt user for a seat --> Column and Row?
            // Prompt user for a price --> First seat with that Price
            
            // Prompt user to quit also --> Always
            
            //while(ehandle){
                
               // try{
              //      
                //}
            
            
            
            
            
            
            
            
        
        
        
        }  
    }
}    