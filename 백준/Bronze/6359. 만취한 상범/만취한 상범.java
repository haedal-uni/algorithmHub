import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            arr = new int[x+1];
            for(int j=2; j<x+1; j++){
                for(int k=1; x>=k*j; k++){
                    y = k*j;
                    if(arr[y]==0){
                        arr[y]=1;
                    }else{
                        arr[y] = 0;
                    }
                }
            }
            for(int z=1; z<x+1; z++){
                if(arr[z]==0){
                    count++;
                }
            }
            sb.append(count).append("\n");
            count = 0;
        }
        System.out.println(sb);
    }
}