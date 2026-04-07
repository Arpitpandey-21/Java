import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is NOT an Armstrong number");
        }
    }

    public static boolean isArmstrong(int x) {
        int temp = x;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;  
            temp /= 10;
        }

        return sum == x;
    }
}
