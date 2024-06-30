import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        x = arr[0];
        y = arr[1];
        if(arr.length==3){
            z = arr[2];
            for(int i=1; i<=x; i++){
                if(x%i==0&&y%i==0&&z%i==0){
                    sb.append(i).append("\n");
                }
            }
        }else{
            for(int i=1; i<=x; i++){
                if(x%i==0&&y%i==0){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}