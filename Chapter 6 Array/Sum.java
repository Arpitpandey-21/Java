import java.util.Scanner;

public class Sum{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // pehle input lo
            sum = sum + arr[i];      // fir sum karo
        }

        System.out.println("Sum of array = " + sum);
    }
    
}
