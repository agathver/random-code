import java.util.*;

class WordComm {

    static class Graph {
        HashMap<String, List<String>> adj;

        public Graph(List<String> vertices) {
            adj = new HashMap<>();
            for(String vertex : vertices) {
                ArrayList<String> h = new ArrayList<>();
                
                for(String v : vertices) {
                    if(singleEdit(vertex, v)) {
                        h.add(v);
                    }
                }
                
                adj.put(vertex, h);
            }

            // for(String vertex : vertices) {
            //     System.err.print(vertex + ": ");
            //     for(String v : adj.get(vertex)) {
            //         System.err.print(v + " ");
            //     }

            //     System.err.println();
            // }
        }
    

        static int min(int x,int y,int z) { 
            if (x <= y && x <= z) {
                return x;
            }
            if (y <= x && y <= z) {
                return y;
            }
            else {
                return z;
            }
        } 
    
        static boolean singleEdit(String s1, String s2) 
        { 
            int m = s1.length();
            int n = s2.length();
 
            if (Math.abs(m - n) > 1) {
                return false;
            }
        
            int count = 0; // Count of edits
        
            int i = 0, j = 0;
            while (i < m && j < n)
            {
                if (s1.charAt(i) != s2.charAt(j)) {
                    if (count == 1) {
                        return false;
                    }

                    if (m > n) {
                        i++;
                    }
                    else if (m < n) {
                        j++;
                    }
                    else {
                        i++;
                        j++;
                    }
                    count++;
                } else {
                    i++;
                    j++;
                }
            }
        
            if (i < m || j < n) {
                count++;
            }
        
            return count == 1;
        }
 
        int shortestDistance(String src, String dest) {

            HashMap<String, Integer> dist = new HashMap<>();
    
            for(String k : adj.keySet()) {
                dist.put(k, -1);
            }
    
            // Distance of source vertex from itself is always 0
            dist.put(src, 0);
    
            Queue<String> q = new LinkedList<>();
            q.add(src);

            while(q.peek() != null) {
                String current = q.poll();
                int d = dist.get(current);
                
                for(String v : adj.get(current)) {
                    if(v.equals(dest)) {
                        return d  + 1;
                    }
                    if(dist.get(v) == -1) {
                        dist.put(v, d + 1);
                        q.add(v);
                    }
                }
            }

            return -1;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        while(true) {
            String word = s.next();

            if(word.equals("END")) {
                break;
            }
            
            //System.err.println(word);
            
            words.add(word);
        }

        //System.err.println("Making graph");

        String src = s.next();
        String dest = s.next();

        Graph g = new Graph(words);

        System.out.println(g.shortestDistance(src, dest));

    }
}