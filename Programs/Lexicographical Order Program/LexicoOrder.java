import java.util.Scanner;
/**
 * This program takes 3 words, phrases, sentences, or whatever it may be. It then takes the three and sorts them in Lexicographical order.
 *
 * Edgar Babajanyan
 * 11/24/2021
 */
    class LexicoOrder {
      public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
                
        System.out.println("Enter a word: ");
        String firstword = in.nextLine();
        
        System.out.println("Enter another word: ");
        String secondword = in.nextLine();
        
        System.out.println("Enter one more word: ");
        String thirdword = in.nextLine();
         
    
        String[] words = {firstword, secondword, thirdword};
    
         for(int i = 0; i < 3; ++i) { // Learned for loops to complete this. I worked off examples and it seems to have worked out.
          for (int j = i + 1; j < 3; ++j) {
          
            if (words[i].compareTo(words[j]) > 0){ 
    

              String temp = words[i];
              words[i] = words[j];
              words[j] = temp;
            }
          }
        }
    
        System.out.println("In lexicographical order:");
        
        for(int i = 0; i < 3; i++) {
          System.out.println(words[i]);
        }
      }
    }

