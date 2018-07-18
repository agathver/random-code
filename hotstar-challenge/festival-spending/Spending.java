import java.util.*;

class Festival {
    long t1 = 0;
    long t2 = 0;
    long t3 = 0;
    
    public void update(long s) {
        if (s >= t1) {
            t3 = t2;
            t2 = t1;
            t1 = s;
        } else if (s >= t2) {
            t3 = t2;
            t2 = s;
        } else if(s > t3) {
            t3 = s;
        }
    }
    
    public long total() {
        return t1 + t2 + t3;
    }
}

class Spending {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        // Test cases
        for(int i = 0; i < T; i++) {
            // year
            HashMap<String,Festival> spending = new HashMap<>();
            int N = s.nextInt();
            for(int j = 0; j < N; j++) {
                String festival = s.next();
                long X = s.nextLong();
                
                if(!spending.containsKey(festival)) {
                    spending.put(festival, new Festival());
                }
                
                spending.get(festival).update(X);
            }
            
            String maxFestival = null;
            long maxSpend = -1;
            
            for(Map.Entry<String, Festival> entry : spending.entrySet()) {
                String key = entry.getKey();
                Festival value = entry.getValue();
                long spent = value.total();
                
                if(spent > maxSpend || (spent == maxSpend && key.compareTo(maxFestival) < 0)) {
                    maxFestival = key;
                    maxSpend = spent;
                }
                
            }
            
            System.out.println(maxFestival + " " + maxSpend);
        }

    }
}
