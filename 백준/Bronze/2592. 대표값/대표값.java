import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int[] arr = new int[101];
        int x = 0;
        int y = 0;
        int max = 0;
        int mode = 0;
        for(int i=0; i<10; i++){
            x= Integer.parseInt(br.readLine());
            sum+=x;
            y = arr[x/10];
            arr[x/10] = ++y;
            if(max<y){
                max = y;
                mode= x;
            }
        }
        sb.append(sum/10).append("\n").append(mode);
        System.out.println(sb);
    }
}