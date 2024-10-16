import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr = new int[n][2];
        int[] score = new int[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                    score[i]++;
                }
            }
        }
        for (int i:score) {
            sb.append(i+1).append(" ");
        }
        System.out.print(sb);
    }
}