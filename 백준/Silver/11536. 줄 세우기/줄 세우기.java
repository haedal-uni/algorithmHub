import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy);
        for(int i=0; i<n; i++) {
            if(!list.get(i).equals(copy.get(i))) {
                break;
            }
            if(i==n-1&&list.get(i).equals(copy.get(i))) {
                flag = true;
                System.out.print("INCREASING");
            }
        }
        if(!flag) {
            copy.sort(Collections.reverseOrder());
            for(int i=0; i<n; i++) {
                if(!list.get(i).equals(copy.get(i))) {
                    break;
                }
                if(i==n-1&&list.get(i).equals(copy.get(i))) {
                    flag = true;
                    System.out.print("DECREASING");
                }
            }
        }
        if(!flag) {
            System.out.print("NEITHER");
        }
    }
}