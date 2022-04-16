import java.util.Scanner;
/**
 * This program prints out all of the prime integers up until and including
 * the integer that the user entered.
 *
 * Edgar Babajanyan
 * 12/13/2021
 */
public class PrimeNum
{
    static boolean isPrimeNum(int nummayPrime){    
        if(nummayPrime==1||nummayPrime==0){
        return false;
    }
    for(int i=2; i<nummayPrime; i++){
            
        if(nummayPrime%i==0){
        return false;
            }
}
        return true;
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean ehandle = true;
        int NumInit = 0;
        while (ehandle){
            System.out.println("Enter any Integer after 2!");  
            System.out.println("Then, you will be able to view all of the prime numbers up until your input number!");
            String myAns = in.next();
            try{
                NumInit = Integer.parseInt(myAns);
                        for(int i=1; i<=NumInit; i++){
                            if(isPrimeNum(i)) {
                                System.out.println(i + " ");
                            }
                }
        
            }
            catch(Exception e){
                continue;
            }
            System.out.println("Would you like to enter in another integer over 2?");
            System.out.println("Press y for yes or n for no");
            String redocycle = in.next();
            if (redocycle.equals("n")){
                ehandle = false;
            }
            if (redocycle.equals("y")){
                continue;
            }
        }
    }
}