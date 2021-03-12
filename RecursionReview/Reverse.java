public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("yes"));
    }
    
    public static String reverse(String word) {
        if(word.length() < 1) return "";
        int l = word.length()-1;
        return word.substring(l) + reverse(word.substring(0, l));
    }
}
