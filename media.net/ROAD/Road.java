import java.util.*;
import java.lang.*;
import java.io.*;

class Road {
    static class Graph
    {
        // A class to represent a graph edge
        class Edge implements Comparable<Edge>
        {
            int src;
            int dest;
            int weight;
    
            // Comparator function used for sorting edges 
            // based on their weight
            public int compareTo(Edge e) {
                return this.weight - e.weight;
            }
        };
    
        // A class to represent a subset for union-find
        class Subset
        {
            int parent;
            int rank;
        };
    
        int V, E;    // V-> no. of vertices & E->no.of edges
        Edge edges[]; // collection of all edges

        // Creates a graph with V vertices and E edges
        Graph(int V, int E) {
            this.V = V;
            this.E = E;

            edges = new Edge[E];

            for (int i=0; i<E; ++i) {
                edges[i] = new Edge();
            }

        }
    
        // find set of an element i
        int find(Subset subsets[], int i) {
            if (subsets[i].parent != i) {
                subsets[i].parent = find(subsets, subsets[i].parent);
            }
    
            return subsets[i].parent;
        }
    
        // A function that does union of two sets of x and y
        // (uses union by rank)
        void union(Subset subsets[], int x, int y) {
            int xroot = find(subsets, x);
            int yroot = find(subsets, y);
    
            // Attach smaller rank tree under root of high rank tree
            // (Union by Rank)
            if (subsets[xroot].rank < subsets[yroot].rank) {
                subsets[xroot].parent = yroot;
            } else if (subsets[xroot].rank > subsets[yroot].rank) {
                subsets[yroot].parent = xroot;
            } else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }
    
        // The main function to construct MST using Kruskal's algorithm
        int kruskalMst()
        {
            Edge result[] = new Edge[V];  // Tnis will store the resultant MST
            int e = 0;  // An index variable, used for result[]

            for (int i = 0; i < V; i++) {
                result[i] = new Edge();
            }
    
            // Sort graph as per edge weights
            Arrays.sort(edges);

            // for(Edge ed : edges) {
            //     System.err.printf("%d %d %d\n", ed.src, ed.dest, ed.weight);
            // }
    
            // Allocate memory for creating V ssubsets
            Subset subsets[] = new Subset[V+1];

            for(int i = 0; i <= V; i++) {
                subsets[i] = new Subset();
            }
    
            // Create V subsets with single elements
            for (int v = 0; v <= V; v++) {
                subsets[v].parent = v;
                subsets[v].rank = 0;
            }

            for(Subset s : subsets) {
                System.out.printf("%d %d\n", s.parent, s.rank);
            }
    
            int i = 0;  // Index used to pick next edge
    
            while (e < V - 1) {
                // Pick the smallest edge. 
                Edge nextEdge = edges[i++];
    
                // check cycle
                int x = find(subsets, nextEdge.src);
                int y = find(subsets, nextEdge.dest);
    
                if (x != y) {
                    result[e++] = nextEdge;
                    union(subsets, x, y);
                }
            }
    

            int weight = 0;
            for (i = 0; i < e; ++i) {
                weight += result[i].weight;
            }

            return weight;
        }
    }
    public static void main (String[] args)
    {
 
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int V = N;
        int E = M;

        Graph graph = new Graph(V, E);
 
        for(int i = 0; i < M; i++) {
            graph.edges[i].src = s.nextInt();
            graph.edges[i].dest = s.nextInt();

            if(s.nextInt() == 0) {
                graph.edges[i].weight = 0;
            } else {
                graph.edges[i].weight = s.nextInt();
            }
        }
 
        System.out.println(graph.kruskalMst());
    }
}