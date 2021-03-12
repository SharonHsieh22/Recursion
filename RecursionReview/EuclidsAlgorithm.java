public class EuclidsAlgorithm {
    public static void main(String[] args) {
        System.out.println(GCF(252, 105));
    }
    
    public static int GCF(int n1, int n2) {
        if(n1 == n2) return n1;
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        return GCF(max-min, min);
    }
}
