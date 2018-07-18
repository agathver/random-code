import java.util.Scanner;
import java.util.Arrays;

public class COPS
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i = 0; i < T; ++i) {
            int M = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();

            int range = x * y;

            boolean[] unsafe = new boolean[100];
            //Arrays.fill(safe, true);

            int[] cops = new int[M];

            for(int j = 0; j < M; ++j) {
                cops[j] = s.nextInt() - 1;
            }

            for(int cop : cops) {

                int end = Math.min(99, cop + range);
                int start = Math.max(0, cop - range);
                for(int k = start; k <= end; ++k) {
                    unsafe[k] = true;
                }
            }

            int count = 0;
            for(int k = 0; k < 100; ++k) {
                if(!unsafe[k]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
