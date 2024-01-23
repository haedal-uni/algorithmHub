import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i=1; i<31; i++){
            list.add(""+i);
        }
        String a = "";
        for(int i=0; i<28; i++){
            a = br.readLine();
            list.remove(a);
        }
        sb.append(list.get(0)).append("\n").append(list.get(1));
        System.out.println(sb);
    }
}