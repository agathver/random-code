import java.util.Scanner;
import java.io.*;

public class INTEST
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            int d = s.nextInt();
            if (d % k == 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}