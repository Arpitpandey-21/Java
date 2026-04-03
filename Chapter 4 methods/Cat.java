public class Cat {
    
    public static void main(String[] args) {
        
        String name = "boca";
        
        name = catuppercase(name);
        
        System.out.println(name);
    }
    
    public static String catuppercase(String name) {
        return name.toUpperCase();
    }
}