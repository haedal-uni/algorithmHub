import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input>0) {
                q.offer(input);
            }else{
                if(q.isEmpty()){
                    sb.append(0).append("\n");

                }else{
                    sb.append(q.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}