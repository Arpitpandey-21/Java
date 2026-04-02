import java.util.Scanner;
public class Operation {

    public static void main(String args[]){
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter the value of a=");
        double a = sc.nextDouble();
         
                     
        System.out.println("Enter the value of b=");
                 
        double b= sc.nextDouble();
                  System.out.println("Sum="+(a+b));
                 System.out.println("Subtraction="+(a-b));
                 System.out.println("Multiple="+(a*b));
                 System.out.println("Division="+(a/b));
                 System.out.println("Modulus="+(a%b));
    }
}
