import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        String[] arr;
        for (int i=0; i<N; i++){
            arr = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                pq.offer(Integer.parseInt(arr[j]));
            }
        }
        for(int i=0; i<N-1; i++){
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}