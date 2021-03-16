public class Stars {
    public static void main(String[] args) {
       System.out.println(triangle(5));
       System.out.println(reverseTriangle(5));
    }

    public static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }       
    
    public static String triangle(int n) {
        if(n < 1) return "";
        printStars(n);
        return triangle(n-1);
    }
    
    public static String reverseTriangle(int n) { 
        if(n < 1) return "";
        String l = reverseTriangle(n-1); 
        printStars(n);
        return l;
        
    }
}

