import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        palindrome();

        return true;
    }
}

class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number=");
        int x;
        int real = n;
        int rev=0;
        while(n>0)
        {
            x=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(real==rev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome:");
        }
    
    


    }



} 
    

