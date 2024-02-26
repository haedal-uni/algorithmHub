import java.io.*;
import java.util.*;
public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i=1; i<10000; i++){
            list.add(String.valueOf(i));
        }
        for(int i=1; i<10000; i++){
            list.remove(d(i));
        }
        Collections.sort(list, Comparator.comparingInt(Integer::parseInt));
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
    public static String d(int n){
        count = 0;
        for(int i=0; i<String.valueOf(n).length(); i++){
            count += Integer.parseInt(String.valueOf(n).split("")[i]);
        }
        return String.valueOf((count+n));
    }
}