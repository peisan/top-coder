import java.util.*;

public class BigOEasy {
    static final String UNBOUNDED = "Unbounded";
    static final String BOUNDED = "Bounded";

    boolean[][] edges;
    public String isBounded(String[] graph) {

        // edges as boolean 2d array
        edges = new boolean[graph.length][graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length(); j++) {
                edges[i][j] = (graph[i].charAt(j) == 'Y');
            }
        }

        // each vertex
        for (int currentVertex = 0; currentVertex < edges.length; currentVertex++) {
            int num_of_circle = 0;

            // each edge
            for (int nextVertex = 0; nextVertex < edges[currentVertex].length; nextVertex++) {
                // check if circular
                if (edges[currentVertex][nextVertex]) {
                    if(checkCircular(currentVertex, nextVertex, new boolean[edges.length])){
                        num_of_circle++;
                    }
                }

                // unbounded if more than one circulars
                if(num_of_circle > 1){
                    return UNBOUNDED;
                }
            }
        }
        return BOUNDED;
    }

    private boolean checkCircular(int startVertex, int currentVertex, boolean visited[]) {
        visited[currentVertex] = true;
        for(int nextVertex = 0; nextVertex < edges.length; nextVertex++){
            if(edges[currentVertex][nextVertex]){
                if(startVertex == nextVertex){
                    return true;
                }else if(visited[nextVertex]){
                    continue;
                }else{
                    if(checkCircular(startVertex, nextVertex, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

