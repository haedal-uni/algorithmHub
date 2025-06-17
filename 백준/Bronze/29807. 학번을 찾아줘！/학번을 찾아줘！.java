import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        int[] arr = new int[5];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(x[i]);
        }
        int sum = 0;
        int a = 0;
        int b = 0;
        a = arr[0];
        b = arr[2];
        if(a>b){
            sum+=(a-b)*508;
        }else{
            sum+=(b-a)*108;
        }
        a=arr[1];
        b=arr[3];
        if(a>b){
            sum+=(a-b)*212;
        }else{
            sum+=(b-a)*305;
        }
        if(n==5){
            sum+=arr[4]*707;
        }
        System.out.print(sum*4763);
    }
}