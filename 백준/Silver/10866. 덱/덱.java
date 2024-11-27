import java.io.*;
import java.util.*;
public class Main {
    public static Deque<Integer> deque = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken());
            switch (sb.toString()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    ans.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    ans.append(pop_back()).append("\n");
                    break;
                case "size":
                    ans.append(deque.size()).append("\n");
                    break;
                case "empty":
                    ans.append(empty()).append("\n");
                    break;
                case "front":
                    ans.append(front()).append("\n");
                    break;
                case "back":
                    ans.append(back()).append("\n");
                    break;
            }
            sb.delete(0, sb.length());
        }
        System.out.print(ans);
    }

    private static void push_front(int x) {
        deque.addFirst(x);
    }

    private static void push_back(int x) {
        deque.addLast(x);
    }

    private static int pop_front() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.removeFirst();
    }

    private static int pop_back() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.removeLast();
    }

    private static int empty() {
        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int front() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getFirst();
    }

    private static int back() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getLast();
    }
}