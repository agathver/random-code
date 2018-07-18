import java.util.Scanner;

public class LADDU
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for(int i = 0; i < T; i++) {
            int activities = s.nextInt();
            boolean indian = "INDIAN".equals(s.next());
            int laddus = 0;

            for(int j = 0; j < activities; j++) {
                String activity = s.next();

                switch(activity) {
                    case "CONTEST_WON":
                    int rank = s.nextInt();
                    laddus += 300 + Math.max(20 - rank, 0);
                    break;
                    case "TOP_CONTRIBUTOR":
                    laddus += 300;
                    break;
                    case "BUG_FOUND":
                    int severity = s.nextInt();
                    laddus += severity;
                    break;
                    case "CONTEST_HOSTED":
                    laddus += 50;
                    break;
                }
            }
            
            System.out.println(laddus / (indian ? 200 : 400 ));
        }
    }
}
