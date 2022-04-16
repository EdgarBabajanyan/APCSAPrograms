import java.util.Scanner;
/**
 * Edgar Babajanyan
 * Rev.1 10/25/2021
 * Takes as inputs the employee name, their hourly wage, total regular hours worked, and any overtime hours worked. 
 * It then displays the employee’s total weekly pay.
 * 
 * No method needed for this program
 */
public class EmployeeSalary
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter your name: ");
    
    String Employment = in.nextLine();
    
    System.out.println("Please enter your hourly wage: ");
    
    double hourwage = in.nextDouble();
    
    System.out.println("Please enter the amount of regular hours you have worked this week: ");
    
    double hoursworked = in.nextDouble();
    
    System.out.println("Please enter the overtime hours you have worked this week: ");
    
    double hoursworkedovertime = in.nextDouble();
    
    
    
    double reghourpay = hourwage * hoursworked;
    
    double reghourpaymoddedforot = hourwage * 1.5;
    
    double othourpay = hoursworkedovertime * reghourpaymoddedforot; 
    
    double weeklypay = reghourpay + othourpay;
    
    System.out.println("Hello " + Employment + "!" + "Your weekly pay is " + weeklypay + "!");
    
    
    
    
    
    
    
    
    


    }
}
