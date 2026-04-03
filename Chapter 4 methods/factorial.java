public class factorial {
    public static void main(String[] args)
    {
        int n = 5;  // example

        int result = Factorial(n);

        System.out.println(result);
    }

    public static int Factorial(int n)
    {
        int fact = 1;

        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }

        return fact;
    }
}
