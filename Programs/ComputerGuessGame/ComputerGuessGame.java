import java.util.Random;
import java.util.Scanner;
/**
 * This is the ComputerGuessGame! The computer generates a integer and it
 * is your job to try and guess it.
 *
 * Edgar Babajanyan
 * 12/23/21
 */
import java.util.Random;
import java.util.Scanner; 

public class ComputerGuessGame
{
    
    public static void main(String[] args) 
    {
/*@4*/  boolean ehandle = true;
/*@5*/  Random generator = (args.length == 0) ? (new Random()) : (new Random(Integer.parseInt(args[0])));
/*@5*/  Scanner in = new Scanner(System.in);
        
/*@4*/  while(ehandle)
        {         
            int secret = generator.nextInt(500);
            int guesscount = 0;
            int fullguesscount = 0;  
            System.out.println("I am thinking of a number from 0-500.");
            System.out.println("Try to guess my number: ");
            
            try
            {       
/*@3*/          String n;
/*@3*/          int _n;
                
/*@2*/          do  
                {           
/*@1*/              n = in.nextLine(); 
/*@3*/              _n = Integer.parseInt(n);
                    guesscount++;
                    fullguesscount++;
                    
                    if(_n > secret) 
                        System.out.println("My number is lower than " + n + " Guess again: ");
                    else 
                        System.out.println("My number is higher than " + n + " Guess again: " );
                    
                    if (guesscount > 1 && _n > secret)
                    {
                        if(_n > secret)
                        {
                            System.out.println("Bad Guess. I told you number is lower!");
                            guesscount = 0;
                            continue;
                        }
                    }
                    
                    if (guesscount > 1 && _n < secret)
                    {
                        if(_n < secret)
                        {
                            System.out.println("Bad Guess. I told you that my number is greater!");
                            guesscount = 0;
                            continue;
                        }
                    }
/*@2*/          } while(_n != secret);
                        
                System.out.println("Congratulations! It only took you " + fullguesscount + " guesses!");
                break;
            }
            catch(Exception e)
            {
                System.out.print("Bad input");
                continue;
            }
        }
    }
}