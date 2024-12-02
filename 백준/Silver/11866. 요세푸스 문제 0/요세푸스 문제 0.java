import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int i = 0;
        for(int j=1; j<n+1; j++){
            list.add(j);
        }
        while(!list.isEmpty()){
            i = (i+k-1)%list.size();
            sb.append(list.get(i));
            list.remove(i);
            if(!list.isEmpty()){
                sb.append(", ");
            }
        }
        sb.insert(0,"<");
        sb.append(">");
        System.out.print(sb);
    }
}