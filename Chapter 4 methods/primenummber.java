public class primenummber {
    public static void main (String[] args)
    {
        int x;
        System.out.println(isPrime(x=13));
    }
    public static boolean isPrime(int x){
       int res = 0;
        for(int i=1;i<=x/2;i++)
        {
            if(x % i == 0 )
            {
                res++;
            }
        }
        return res == 1;

    }
}
