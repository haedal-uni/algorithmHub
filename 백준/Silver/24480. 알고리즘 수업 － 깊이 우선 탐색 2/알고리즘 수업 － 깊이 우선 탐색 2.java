import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] visited;
    static List<PriorityQueue<Integer>> graph = new ArrayList<>();
    static int count;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[V + 1];
        for (int i = 0; i < V + 1; i++) {
            graph.add(new PriorityQueue<>(Comparator.reverseOrder()));
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int V1 = Integer.parseInt(st.nextToken());
            int E1 = Integer.parseInt(st.nextToken());
            graph.get(V1).add(E1);
            graph.get(E1).add(V1);
        }
        count = 1;
        dfs(R);
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int V) {
        visited[V] = count;
        while (!graph.get(V).isEmpty()) {
            int N = graph.get(V).poll();
            if (visited[N] == 0) {
                count++;
                dfs(N);
            }
        }
    }
}