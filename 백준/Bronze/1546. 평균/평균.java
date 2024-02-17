import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list =new ArrayList<>();
        int a = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        double num = 0;
        for(int i=0; i<a; i++){
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            num += list.get(i)*100.0/ list.get(list.size()-1);
        }
        System.out.println(num/list.size());
    }
}