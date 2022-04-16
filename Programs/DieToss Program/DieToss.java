import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This is the DieToss Program. You enter an integer to roll a dice that many times. Then, it will find the longest string(s) of duplicate rolls.
 * The die rolls are between 1 and 6 inclusive.
 *
 *
 * Edgar Babajanyan
 * 3/10/2022 + EXTENSION (Got sick. Made this monstrosity of a DieToss Program because I got really bored)
 */

public class DieToss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        new DieToss().performDieToss(in);
        in.close();
    }
    
    public void performDieToss(Scanner scanner) {
        Random random = new Random();
        
        do {
            int numberOfTosses = getNumberOfTosses(scanner);
            int[] dieToss = createRandomArray(random, numberOfTosses);
            int[] indexes = findLargestDuplicates(dieToss);
            
            String beginning = "The " + numberOfTosses + " die rolls are: ";
            System.out.println(generateOutput(beginning, dieToss));
            
            if (indexes[1] == 0) {
                System.out.println("There were no duplicate dice rolls");
            } else {
                beginning = "The first, longest duplicate run is: ";
                System.out.println(generateOutput(beginning, dieToss, indexes));
            }
        } while (continueRolling(scanner));
    }
    
    private int getNumberOfTosses(Scanner in) {
        int numberOfTosses = 0;
        int minimum = 10;
        int maximum = 30;
        String warnBounds = "Be sure that it is an integer that is 10 or greater but only up to 30";
        
        System.out.println("Tell me how many dice you want me to throw?");
        System.out.println(warnBounds);
        
        do {
            numberOfTosses = valueOf(in.nextLine());
            if (!isNumberInRange(numberOfTosses, minimum, maximum)) {
                System.out.println(warnBounds);
                System.out.println("Tell me how many dice you want me to throw?");
            }
        } while (!isNumberInRange(numberOfTosses, minimum, maximum));
        
        return numberOfTosses;
    }
    
    private boolean isNumberInRange(int number, int minimum, int maximum) {
        return number >= minimum && number <= maximum;
    }
    
    private int valueOf(String line) {
        try {
            return Integer.valueOf(line);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    private int[] createRandomArray(Random random, int numberOfTosses) {
         int[] dieToss = new int[numberOfTosses];
         
         for (int i = 0; i < dieToss.length; i++) {
             dieToss[i] = 1 + random.nextInt(6);
         }
         
         return dieToss;
    }
    
    private int[] findLargestDuplicates(int[] dieToss) {
        int beginIndex = 0;
        int duplicateValue = 0;
        int duplicateCount = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        int DuplicateCount = 0;
        
        for (int index = 0; index < dieToss.length; index++) {
            if (dieToss[index] == duplicateValue) {
                duplicateCount++;
                if (index >= (dieToss.length - 1)) {
                    if (duplicateCount > DuplicateCount) {
                        maxStartIndex = beginIndex;
                        maxEndIndex = index;
                        DuplicateCount = duplicateCount;
                    }
                }
            } else {
                if (index < (dieToss.length - 1)) {
                    if (duplicateCount > DuplicateCount) {
                        maxStartIndex = beginIndex;
                        maxEndIndex = index - 1;
                        DuplicateCount = duplicateCount;
                    }
                } else {
                    if (duplicateCount > DuplicateCount) {
                        maxStartIndex = beginIndex;
                        maxEndIndex = index;
                        DuplicateCount = duplicateCount;
                    }
                    
                    if (maxEndIndex < maxStartIndex) {
                        maxEndIndex = index;
                    }
                }
                
                beginIndex = index;
                duplicateValue = dieToss[index];
                duplicateCount = 1;
            }
        }
        
        int[] indexes = {maxStartIndex, maxEndIndex};
        return indexes;
    }
    
    private String generateOutput(String beginning, int[] dieToss) {
        return (beginning + Arrays.toString(dieToss));
    }
    
    private String generateOutput(String beginning, int[] dieToss, int[] indexes) {
        String output = beginning + "[";
        for (int index = 0; index < dieToss.length; index++) {
            if (indexes[0] == index) {
                output += "(";
            }

            output += dieToss[index];
            if (indexes[1] == index) {
                output += ")";
            }

            if (index < (dieToss.length - 1)) {
                output += ", ";
            }
        }
        output += "]";
        
        return output;
    }
    
    private boolean continueRolling(Scanner in) {
        System.out.println("Would you like to reroll (y or n)?");
        String line = in.nextLine();
        if (line.length() > 0) {
            char c = Character.toLowerCase(line.charAt(0));
            return c == 'y';
        } else {
            return false;
        }
    }

}