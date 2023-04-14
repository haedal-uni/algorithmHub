import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] array;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[M];
        nm(0);
        System.out.println(sb);
    }
    public static void nm(int index){
        if(index==M){
            for(int i=0; i<M; i++){
                sb.append(array[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=1; i<N+1; i++) {
            array[index] = i;
            nm(index+1);
        }
    }
}