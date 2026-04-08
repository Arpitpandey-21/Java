public class number{
    public static void main(String[] args) {
        
        int i, j,k;

        for (i = 1; i <= 4; i++) {
            k=1;
            for (j = 1; j <= 4; j++) {
                
                if (j <= i) {
                    System.out.print(k);
                    k=k+2;
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println(); 
        }
    }
}
/*1
13
135
1357*/
