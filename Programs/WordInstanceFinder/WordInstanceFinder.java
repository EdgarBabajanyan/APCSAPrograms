import java.util.Scanner;
import java.io.*;
/**
 * This is the WordInstanceFinder. It allows the user to enter a sentence of no less than 30 characters and it can search for a given keyword.
 *
 * Edgar Babajanyan
 * Rev.1 1/22/22
 */
class WordInstanceFinder {
    static int countOccurrences(String str, String word)
    {
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
        if (word.equals(a[i]))
            count++;
        }
     
        return count;
    }
    public static void main(String args[])
    {
        boolean ehandle = true;
        
        while(ehandle){
        
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter in a string of words that is at least 30 characters.");
            
            String str30 = in.nextLine();
            
            int stringlengthcheck = str30.length();
            
            if (stringlengthcheck < 30){
                System.out.println("String not long enough. Re-enter...");
                continue;
            }

            System.out.println("Now, enter a keyword you would like to search for:");
            
            String keyword = in.nextLine();
            
            String str30replace = str30;
            
            String newstr30 = str30replace.replaceAll("\\p{Punct}", "");
            
            
            String newerstr30 = newstr30.toLowerCase();
            
            String newkeyword = keyword.toLowerCase();
            
            int indexOfSubStr = newerstr30.indexOf(newkeyword);
            
            
            if(indexOfSubStr == -1){
                    System.out.println("We could not find the keyword in your string");
                }
            else{
                System.out.println("Your Keyword shows up " + countOccurrences(newerstr30, newkeyword) + " times.");
                System.out.println("Your keyword first appeared in your inputted sentence at index of : "+ indexOfSubStr);
            }
            
            System.out.println("Would you like to enter another String?");
        
            System.out.println("Enter 'y' if you'd like to. Enter 'n' to cancel.");
        
            String redoquestion = in.nextLine();

        
            if (redoquestion.equals("y")){
                continue;
            }
            if (redoquestion.equals("n")){
                System.out.print("Program Terminated");
                break;
            }
        }
    }
}
