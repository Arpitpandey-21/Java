//calculator basic operation perform switch case
//happy number or

import java.util.Scanner;
public class parimdrom {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n=");
        int n = sc.nextInt();
        int a;
        int real = n;
        int r = 0;
        while (n > 0) {
            a = n % 10;
            r = r * 10 + a;
            n = n / 10;
        }
        if (real == r) {
            System.out.println("Number is palindrome=");
        } else {
            System.out.println("Number is not palidrome=");
        }

    }
}
