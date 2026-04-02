import java.util.Scanner;
public class Sample {

    public static void main(String args[]){
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter the value of a=");
        double a = sc.nextDouble();
         
                     
        if(a % 2 ==0)
        {
            System.out.println("a is even number");
        }
                  else
                  {
                      System.out.println("a is odd number");
                  }
    }
}
