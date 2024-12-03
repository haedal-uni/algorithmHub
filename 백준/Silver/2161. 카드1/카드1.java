import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<n+1; i++){
            deque.add(i);
        }
        while(deque.size()>1){
            queue.add(deque.removeFirst());
            deque.addLast(deque.removeFirst());
        }
        for(int i=0; i<n-1; i++){
            sb.append(queue.poll()).append(" ");
        }
        sb.append(deque.poll());
        System.out.print(sb);
    }
}