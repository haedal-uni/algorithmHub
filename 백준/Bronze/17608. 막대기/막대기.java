import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int sum = 1;
        int y = 0;
        int z = 0;
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        y = list.get(n-1);
        for(int i=n-2; i>=0; i--){
            z = list.get(i);
            if(y<z){
                sum++;
                y=z;
            }
        }
        System.out.print(sum);
    }
}