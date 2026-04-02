import java.util.Scanner;
public class Age {

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);



        System.out.println("Enter your age:");
        int age = sc.nextInt();


        if(age >= 18)
        {
            System.out.println("You are a adult");
        }
                  else
                  {
                      System.out.println("You are not a adult");
                  }
    }
}