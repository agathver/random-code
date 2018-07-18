import java.util.Scanner;

public class FLOW007
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        for(int i = 0; i < T; i++) {
            int n = s.nextInt();
            
            int r = 0;
            
            while(n != 0) {
                r = (r * 10) + (n % 10);
                n /= 10;
            }
            
            System.out.println(r);
        }
    }
}
