import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        long product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product *= arr[i];
        }
        System.out.println("Multiple is:" + product);
    }
}
