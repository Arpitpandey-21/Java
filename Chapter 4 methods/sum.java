
public class sum {
    public static void main(String[] args) {
       int[] a = {3,3,3,3,3,3,3,3,3};
        Sumofarray(a);
    }
 
public static void Sumofarray(int[] arr) {
 
    int res = 0;
    for(int i:arr)
    {
        res +=i;
    }
     System.out.println("Sum = " + res);
}
}

