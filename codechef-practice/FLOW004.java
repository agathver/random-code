import java.util.Scanner;

public class FLOW004
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        for(int i = 0; i < T; i++) {
            int n = s.nextInt();
            
            int last = n % 10;
            
            while(n > 9) {
                n /= 10;
            }
            
            System.out.println(n + last);
        }
    }
}
