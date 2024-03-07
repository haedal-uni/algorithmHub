import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n+1];
        int count=0;
        int min = 10001;
        for(int i=2; i<=Math.sqrt(n); i++){
            for(int j=i*i; j<=n; j+=i){
                x[j] = 1;
            }
        }
        x[0]=1;
        x[1]=1;
        for(int i=m; i<n+1; i++){
            if(x[i]==0){
                count+=i;
                if(min>i){
                    min = i;
                }
            }
        }
        if(count==0){
            sb.append(-1);
        }else{
            sb.append(count).append("\n").append(min);
        }
        System.out.println(sb);
    }
}