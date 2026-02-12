

import java.util.Scanner;

public class calculator_switch_case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nCalculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Modulus");
            System.out.println("5. Exit");
            System.out.print("Choose operation: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Calculator Closed ");
                break;
            }

            System.out.print("Enter value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter value of b: ");
            int b = sc.nextInt();

            switch (choice) {

                case 1:
                    int sum;
                    sum=a+b;
                    System.out.println("Sum = ");
                    System.out.print(sum);
                    break;

                case 2:

                    int sub;
                    sub=a-b;
                    System.out.println("sub= ");
                    System.out.print(sub);
                    break;

                case 3:
                    int mul;
                    mul=a*b;
                    System.out.println("mul=");
                    System.out.print(mul);
                    break;

                case 4:
                        int modulus;
                            if(b > 0)
                            {
                                modulus=a%b;
                                System.out.println("modulus=");
                                System.out.print(modulus);
                            }

                default:
                    System.out.println("Invalid Choice ");
            }
        }

    }
}
