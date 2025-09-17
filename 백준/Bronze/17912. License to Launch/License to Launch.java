import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(x[i]));
        }
        Collections.sort(list);
        int a = list.get(0);
        for(int i=0; i<n; i++){
            if(a==Integer.parseInt(x[i])){
                System.out.print(i);
                break;
            }
        }
    }
}