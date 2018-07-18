import java.util.*;
/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(int m, int n,String magazine, String note) {
        magazineMap = new HashMap<>(m);
        noteMap = new HashMap<>(n);
        for(String s : magazine.split(" ")) {
            int count = magazineMap.getOrDefault(s,0);
            magazineMap.put(s, count + 1);
        }
        
        for(String s : note.split(" ")) {
            int count = noteMap.getOrDefault(s,0);
            noteMap.put(s, count + 1);
        }
    }
    
    public boolean solve() {
        for(Map.Entry<String,Integer> e : noteMap.entrySet()) {
            int avail = magazineMap.getOrDefault(e.getKey(), 0);
            if(avail < e.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(m, n,scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
