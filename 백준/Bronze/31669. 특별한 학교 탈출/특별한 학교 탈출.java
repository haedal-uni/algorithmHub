import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        String[] arr;
        for(int i=0; i<1; i++){
            arr = br.readLine().split("");
            for(int j=0; j<arr.length; j++){
                if(arr[j].equals("X")){
                    list.add((j+1)+"");
                }
            }
        }
        for(int i=0;i<n-1; i++){
            arr = br.readLine().split("");
            for(int j=0;j<m; j++){
                if(arr[j].equals("O")){
                    list.remove((j+1)+"");
                }
            }
        }
        if(list.isEmpty()){
            System.out.print("ESCAPE FAILED");
        }else{
            System.out.print(list.get(0));
        }
    }
}