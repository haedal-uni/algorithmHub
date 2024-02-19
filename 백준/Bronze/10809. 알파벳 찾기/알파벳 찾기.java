import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] st = br.readLine().split("");
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        int num = 0;
        for(int i=0; i<st.length; i++){
            num = st[i].charAt(0)-97;
            if(arr[num]==-1){
                arr[num]=i;
            }
        }
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}