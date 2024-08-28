import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())/5;
        int p = Integer.parseInt(br.readLine());
        int[] arr = new int[]{p-500, (int)(p-0.1*p), p-2000, (int)(p-0.25*p)};
        int min=p;
        int x=0;
        if(n>4){
            n=4;
        }
        for(int i=0;i<n; i++){
            x=arr[i];
            if(min>x){
                min=x;
            }
        }
        if(min<0){
            min=0;
        }
        System.out.println(min);
    }
}