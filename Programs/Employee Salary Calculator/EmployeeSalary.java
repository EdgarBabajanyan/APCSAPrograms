import java.util.Scanner;
/**
 * Edgar Babajanyan
 * Rev.2 10/25/2021, 1/20/22
 * Takes as inputs the employee name, their hourly wage, total regular hours worked, and any overtime hours worked. 
 * It then displays the employee’s total weekly pay.
 * 
 * 
 */
public class EmployeeSalary
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    Scanner in2nd = new Scanner(System.in);
    
    boolean ehandle = true;
    
    double NumInit = 0;
    
    double NumInit2 = 0;
    
    double NumInit3 = 0;
    
    while(ehandle){
        System.out.println("Please enter your name: ");
        
        String Employment = in2nd.nextLine();
        
        System.out.println("Please enter your hourly wage: ");
        
        String hourwage = in.nextLine();
        
        try{
            NumInit = Double.parseDouble(hourwage);
        
            }
            catch(Exception e){
                System.out.println("Bad Input. Enter your hourly wage as a number.");
                continue;
            }
        
        System.out.println("Please enter the amount of regular hours you have worked this week: ");
        
        String hoursworked = in.nextLine();
        
        try{
            NumInit2 = Double.parseDouble(hoursworked);
        
            }
            catch(Exception e){
                System.out.println("Bad Input. Enter your hours worked as a number.");
                continue;
            }
        
        if (NumInit2 < 40){    
            System.out.println("Please enter the overtime hours you have worked this week: ");
            
            String hoursworkedovertime = in.nextLine();
            
            try{
                NumInit3 = Double.parseDouble(hoursworkedovertime);
            
                }
                catch(Exception e){
                    System.out.println("Bad Input. Enter your overtime as a number.");
                    continue;
                }
            }
        if (NumInit2 > 40){
            System.out.println("Your hours worked cannot be greater than 40. Re-enter...");
            continue;
        }
        if (NumInit2 < 1){
            System.out.println("Your hours worked cannot be less than 1. Re-enter...");
            continue;
        }
        
        double reghourpay = NumInit * NumInit2;
        
        double reghourpaymoddedforot = NumInit * 1.5;
        
        double othourpay = NumInit3 * reghourpaymoddedforot; 
        
        double weeklypay = reghourpay + othourpay;
        
        System.out.println("Hello " + Employment + "!");
        
        System.out.println("Your hourly wage is " + NumInit);
        
        System.out.println("You had " + NumInit3 + " overtime hours");

        System.out.println("Your weekly pay is " + weeklypay + "!");
        
        System.out.println("Would you like to enter another employee?");
        
        System.out.println("Enter 'y' if you'd like to. Enter 'n' to cancel.");
        
        String redoquestion = in2nd.nextLine();

        
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
