import java.util.Scanner;

public class LECANDY
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        for(int i = 0; i < T; i++) {
            int n = s.nextInt();
            int c = s.nextInt();
           
            int demand = 0;
            for(int j = 0; j < n; j++) {
                demand += s.nextInt();
            }
            
            System.out.println(demand <= c ? "Yes" : "No");
        }
    }
}
