import java.util.Scanner;

public class TEMPLELA
{
    
    private static boolean check(int[] h) {
        int n = h.length;
        int half = n / 2;
        
        if((n & 1) == 0) {
            return false;
        }
        
        if(h[0] != 1 || h[n - 1] != 1) {
            return false;
        }
        
        for(int i = 0; i < half; i++) {
            if(h[i + 1] - h[i] != 1) {
                return false;
            }
        }
        
        for(int i = half; i < n - 1; i++) {
            if(h[i] - h[i + 1] != 1) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        
        for(int i = 0; i < S; i++) {
            int n = s.nextInt();
           
            int[] h = new int[n];
            
            for(int j = 0; j < n; j++) {
                h[j] = s.nextInt();
            }
            
            System.out.println(check(h) ? "yes" : "no");
        }
    }
}
