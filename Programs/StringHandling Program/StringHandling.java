import java.util.Scanner;
/* Edgar Babajanyan
 * Rev.1 10/24/2021
 * This is the StringHandling Program. It does the following:
 * Displays The initial string the user entered
 * Displays the length of the initial string
 * Displays the index location of the first space in the initial string
 * Displays the word after the 3rd space in your initial string
 * Displays the string from index 12 to the end of the string
   * Displays the first 8 characters of your initial string
 * Concatenates the text from # 4 & #5 above (insert a double backslash between the two)
 * Prints out the characters, using the charAt() method to display the 5th, 9th, and 12th indexes from the initial string
 * Finds the index location of the first occurrence of the string “th” and of the string
“is” and displays the appropriate message to the screen if found or not.
 */
public class StringHandling
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter your string of words, sentences, or both!");
        
        String entrypoint = in.nextLine();
        
        System.out.println("");
        
        System.out.println("This is the string you inputted: " + entrypoint);
        
        System.out.println("");
        
        int manippointone = entrypoint.length();
        
        System.out.println("");
        
        System.out.println("Your string is " + manippointone + " characters long.");
        
        System.out.println("");
        
        int maniptwo = entrypoint.indexOf(" ");
        
        System.out.println("The first space in your string at character number: " + (maniptwo + 1));
        
        System.out.println("");
        
        String manipthirdspace = entrypoint.substring(maniptwo + 1);
        
        int Space = manipthirdspace.indexOf(" ");
        
        String manipthirdspacetwo = manipthirdspace.substring(Space + 1);
        
        int Space2 = manipthirdspacetwo.indexOf(" ");
        
        String manipthirdspacethree = manipthirdspacetwo.substring(Space2 + 1);
        
        int Space3 = manipthirdspacethree.indexOf(" ");
        
        String manipthirdspacefinal = manipthirdspacethree.substring(0, Space3);
        
        System.out.println("The word after the third space in your string is: " + manipthirdspacefinal);
        
        System.out.println("");
        
        String manipindex = entrypoint.substring(12);
        
        System.out.println("This is the string displayed from the 12th character to the end of your string: " + manipindex);
        
        System.out.println("");
        
        String firstEightChars = "";  // Fancy if else statement!
 
        if (entrypoint.length() > 8) 
        {
            firstEightChars = entrypoint.substring(0, 8);
        } 
        else
        {
            firstEightChars = entrypoint;
        }
 
        System.out.println("These are the first eight characters printed: " + firstEightChars);
        
        System.out.println("");
        
        // String manipConcat = manipthirdspacefinal;
        
        // String manipConcatfinal = manipConcat.concat(manipindex);
        
        System.out.println("The word after the 3rd space and the string after the 12th character are: " + manipthirdspacefinal + "\\" + "\\" + manipindex);
        
        System.out.println("");
        
        char fifth = entrypoint.charAt(4);
        
        char ninth = entrypoint.charAt(8);
        
        char twelfth = entrypoint.charAt(11);
        
        

        System.out.println("The characters found at the 5th, 9th, and 12th positions of your string are: " + fifth + ", " + ninth + " and " + twelfth);
        
        System.out.println("");
        
        String thoccur = "th";  
        
        int indexOfentrypoint = entrypoint.indexOf(thoccur);
        
        if (indexOfentrypoint == -1)
        {
            System.out.println("There was no appearance of the string 'th' in your inputted string.");
        }
        else
        {
            System.out.println("The string 'th' first appeared in your string at character number : "+ indexOfentrypoint);
        }
        
        
    
    

    }
}
