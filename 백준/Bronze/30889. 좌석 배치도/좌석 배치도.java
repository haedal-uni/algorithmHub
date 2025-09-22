import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[10][20];
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            arr[s.charAt(0) - 'A'][Integer.parseInt(s.substring(1))-1]++;
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    sb.append(".");
                }else{
                    sb.append("o");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}