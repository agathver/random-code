import java.util.*;

class BCake {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int B = s.nextInt();

        int[] students = new int[N];
        int[] cakes = new int[N];

        for(int i = 0; i < N; i++) {
            students[i] = s.nextInt();
            cakes[i] = 1;
        }

        B -= N;

        while(B > 0) {
            double min = Double.MAX_VALUE;
            int minI = 0;

            for(int i = 0; i < N; i++) {
                double ratio = cakes[i] * 1.0 / students[i];
                //System.err.printf("Room %d ratio: %f\n", i, ratio);
                if(ratio < min) {
                    min = ratio;
                    minI = i;
                }
            }

            //System.err.println("Cake goes to "+minI);

            cakes[minI]++;
            B--;

        }

        int max = 0;
        for(int i = 0; i < N; i++) {
            int c = (int)(students[i] * 1.0 / cakes[i] + 0.5);

            if(c > max) {
                max = c;
            }
        }

        System.out.println(max);
    }
}