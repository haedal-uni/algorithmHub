import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        arr1[0] = Integer.parseInt(st.nextToken());
        arr2[0] = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;

        for(int i=0; i<2; i++){
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if (arr1[0] == x) {
                arr1[1] = x;
            } else {
                arr1[i+2] = x;
            }
            if (arr2[0] == y) {
                arr2[1] = y;
            } else {
                arr2[i+2] = y;
            }
        }

        if (arr1[1] == 0) {
            sb.append(arr1[0]).append(" ");
        } else {
            if(arr1[2]==0){
                sb.append(arr1[3]).append(" ");
            }else{
                sb.append(arr1[2]).append(" ");
            }
        }

        if (arr2[1] == 0) {
            sb.append(arr2[0]).append(" ");
        } else {
            if(arr2[2]==0){
                sb.append(arr2[3]).append(" ");
            }else{
                sb.append(arr2[2]).append(" ");
            }
        }
        System.out.println(sb);
    }
}