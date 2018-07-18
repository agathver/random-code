import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int b[] = new int[n];
        
        for(int i = k; i < n; i++) {
            b[i-k] = a[i];
        }

        for(int i = 0; i < k; i++) {
            b[n-k + i] = a[i];
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
