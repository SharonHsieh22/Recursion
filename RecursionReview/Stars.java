public class Stars {
    public static void main(String[] args) {
        System.out.println(triangle(5));
    }
    
    public static String triangle(int stars) {
        if(stars < 1) return "";
        return "*" + triangle(stars-1);        
    }
}
