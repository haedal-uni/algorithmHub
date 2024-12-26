import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<x.length(); i++){
            list.add(x.substring(i));
        }
        Collections.sort(list);
        for(String s:list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}