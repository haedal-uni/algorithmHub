import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        int sum = 0;
        int num = 0;
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            String[] x = br.readLine().split(" ");
            max = -1;
            for(int j=0;j<5; j++){
                for(int k=j+1;k<5;k++){
                    for(int l=k+1;l<5;l++){
                        sum = (Integer.parseInt(x[j])+Integer.parseInt(x[k])+Integer.parseInt(x[l]))%10;
                        if(sum > max){
                            max = sum;
                        }
                    }
                }
            }
            arr[i] = max;
        }
        max = -1;
        for(int i=0; i<n; i++){
            if(arr[i] >= max){
                num = i+1;
                max = arr[i];
            }
        }
        System.out.print(num);
    }
}