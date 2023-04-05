import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int size = 0;
    static int front=0;
    static int[] queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        queue = new int[N];
        StringTokenizer st;
        for (int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int x){
        queue[size] = x;
        size++;
    }
    public static int pop(){
        if(front==size){
            return -1;
        }else{
            int answer = queue[front];
            front++;
            return answer;
        }
    }
    public static int size(){
        return size-front;
    }
    public static int empty(){
        if(front==size){
            return 1;
        }else {
            return 0;
        }
    }
    public static int front(){
        if(front==size){
            return -1;
        }else{
            return queue[front];
        }
    }
    public static int back(){
        if(front==size){
            return -1;
        }else{
            return queue[size-1];
        }
    }
}