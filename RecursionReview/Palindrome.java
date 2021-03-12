public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("refer"));
        System.out.println(isPalindrome("idk"));
        System.out.println(isPalindrome("racecar"));
    }
    
    public static boolean isPalindrome(String word) {
        int l = word.length()-1;
        if(word.length() < 2) return true;        
        if(word.charAt(0) == word.charAt(l)) {
            return isPalindrome(word.substring(1, l));
        }
        return false;
    }
}
