import java.util.*;
import java.lang.String;
/**
 * This is the Grade program. Given a letter grade, it will produce a numeric value for the given grade.
 * Edgar Babajanyan
 * 11/22/2021
 */

class Grade

{
    double numericValue = 0;
    String grade = "";
    Grade(){
    Scanner in = new Scanner(System. in );
    System.out.print("Enter in a Letter Grade: ");
    
    grade = in.nextLine();
    }
    
    double getLetterGrade()
    
    {
    
    if (grade.equals("A+") || grade.equals("A")){
    
        numericValue = 4.0;
    }
    else if (grade.equals("A-")){
    
        numericValue = 3.7;  
    }
    
    else if (grade.equals("B+")){
    
        numericValue = 3.3;
    }
    
    else if (grade.equals("B")){
    
        numericValue = 3.0;
    }
    
    else if (grade.equals("B-")){
    
        numericValue = 2.7;
    }
    
    else if (grade.equals("C+")){
    
        numericValue = 2.3;
    }
    
    else if (grade.equals("C")){
    
        numericValue = 2.0;
    }
    
    else if (grade.equals("C-")){
    
        numericValue = 1.7;
    }
    
    else if (grade.equals("D+")){
    
        numericValue = 1.3;
    }
    
    else if (grade.equals("D")){
    
        numericValue = 1.0;
    }
    
    else if (grade.equals("F")){
    
        numericValue = 0;    
    }
    
    else{
        System.out.println("Letter not in grading system");
    }
    
    return numericValue;
    
    }
    
}
    
    class Main
    
    {
    
    public static void main(String[] args)
    
    {
    
    Grade finalgrade = new Grade();
    
    double numericGrade = finalgrade.getLetterGrade();
    
    System.out.println("Your grade is: "+ numericGrade);
    
    }
}

