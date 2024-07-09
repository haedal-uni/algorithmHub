import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        List<Integer> list;
        int x = Integer.parseInt(br.readLine());
        for(int i=0; i<x; i++){
            list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n; j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            for(int j=0; j<list.size()-1; j++){
                sum+=list.get(j+1)-list.get(j);
            }
            sb.append(sum*2).append("\n");
            sum=0;
        }
        System.out.println(sb);
    }
}