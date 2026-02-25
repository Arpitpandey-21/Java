//3.2

public class MathOperation {
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add (int a,int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println("two integers"+ obj.add(10,20));
        System.out.println("two double"+ obj.add(10.0,20.0));
        System.out.println("three integers"+obj.add(10,20,30));
    }
}
