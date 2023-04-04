import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] stack;
    public static int sp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        stack = new int[num];
        StringTokenizer st;
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top" :
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int x){
        stack[sp] = x;
        sp++;

    }
    public static int pop(){
        if(sp==0){
            return -1;
        }
        int res = stack[sp-1];
        stack[sp-1] = 0;
        sp--;
        return res;
    }
    public static int size(){
        return sp;
    }
    public static int empty(){
        if (sp==0){
            return 1;
        }
        return 0;
    }

    public static int top(){
        if (sp==0){
            return -1;
        }
        return stack[sp-1];
    }
}
