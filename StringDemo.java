public class StringDemo {

    public static void main(String[] args) {

        String name = "bhola";  //method mtlb wo jo kuch kaam krta h
                                //name h wo object h yaha

        // String substring= name.substring(0, 3);

        String toLowercase = name.toLowerCase();
        System.out.println(toLowercase);

        String toUppercase = name.toUpperCase();
        System.out.println(toUppercase);

        //System.out.println(substring);

        //System.out.println(name.trim()); 
        //ye method form fill karte time extra space hata deta h

        //int length = name.length(); 
        //yaha maine object ko call kiya h

        //length mtlb word mai total kitne letter h wo batata h

        //char c = name.charAt(4);

        //String name2 = "bhola";

        /*
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        //important
        */

        String str1 = "car";
        String str2 = "rat";

        System.out.println('c' + 0);  
        //0 se add krne pe ascii value aati h

        System.out.println('r' + 0);

        int i = str1.compareTo(str2);

        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(i);

    }

}