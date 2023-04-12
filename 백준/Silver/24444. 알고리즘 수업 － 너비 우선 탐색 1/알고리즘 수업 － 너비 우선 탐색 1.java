import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] visited;
    static int count;
    static List<List<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[N+1];
        for(int i=0; i<N+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int N1 = Integer.parseInt(st.nextToken());
            int M1 = Integer.parseInt(st.nextToken());
            graph.get(M1).add(N1);
            graph.get(N1).add(M1);
        }

        for (int i=1; i<graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        bfs(R);
        for(int i=1; i<visited.length; i++){
            sb.append(visited[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void bfs(int n){
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = count;
        while (!queue.isEmpty()){
            int x = queue.poll();
            for(int i=0; i<graph.get(x).size(); i++){
                int node = graph.get(x).get(i);
                if(visited[node] == 0){
                    visited[node]=++count;
                    queue.offer(node);
                }
            }
        }
    }
}
