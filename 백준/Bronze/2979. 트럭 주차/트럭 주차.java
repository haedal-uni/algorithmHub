import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[101];
        int max = 0;
        int min = 100;
        int x = 0;
        int y = 0;
        int sum = 0;
        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            max = Math.max(max, Math.max(x,y));
            min = Math.min(min, Math.min(x,y));
            for (int j=x; j<y; j++) {
                arr[j]++;
            }
        }
        for (int i=min; i<max+1; i++){
            if(arr[i]==1) {
                sum+=a;
            } else if(arr[i]==2){
                sum+=b*2;
            } else if(arr[i] == 3){
                sum+=c*3;
            }
        }
        System.out.print(sum);
    }
}