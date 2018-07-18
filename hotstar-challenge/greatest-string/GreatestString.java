//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class GreatestString {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int x_ = 0; x_ < T; x_++) {
            StringBuilder S = new StringBuilder(s.next());
            int Q = s.nextInt();

            for(int i = 0; i < S.length() && Q > 0; i++) {
                char src = S.charAt(i);
                if(src == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u') {
                    char target = src++;
                    S.setCharAt(i, src);
                    Q--;
                }
            }

            System.out.println(S);
        }
    }
}

