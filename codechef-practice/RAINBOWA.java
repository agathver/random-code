import java.util.Scanner;

public class RAINBOWA
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        
        for(int i = 0; i < T; ++i) {
            int N = s.nextInt();
            int[] array = new int[N];
            
            for(int j = 0; j < N; ++j) {
                array[j] = s.nextInt();
            }
            
            int last = 1;
            boolean asc = true;
            boolean rainbow = true;
            for(int j = 0; j < N && rainbow; ++j) {
                int c = array[j];
                int d = array[N - j - 1];
                
                //System.err.println(c);
                
                if(c != d) {
                    rainbow = false;
                    System.err.println("uneven");
                }
                
                if(c > 7) {
                    rainbow = false;
                    System.err.println("c > 7");
                }
                
                if(asc && c != last && c != last + 1) {
                    rainbow = false;
                    System.err.println("increasing");
                } else if(!asc && c != last && c != last - 1) {
                    rainbow = false;
                    System.err.println("decreasing");
                }
                
                if(c == 7) {
                    asc = false;
                }
                
                last = c;
            }
            
            rainbow = rainbow && !asc;
            
            System.out.println(rainbow ? "yes" : "no");
        }
    }
}
