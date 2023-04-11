import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[V+1];
        for (int i = 0; i < V+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int V1 = Integer.parseInt(st.nextToken());
            int E1 = Integer.parseInt(st.nextToken());
            graph.get(V1).add(E1);
            graph.get(E1).add(V1);
        }

        for(int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        dfs(R);
        for(int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int V){
        visited[V] = count;
        for(int i=0; i<graph.get(V).size(); i++){
            int n = graph.get(V).get(i);
            if(visited[n] == 0){
                count++;
                dfs(n);
            }
        }
    }
}