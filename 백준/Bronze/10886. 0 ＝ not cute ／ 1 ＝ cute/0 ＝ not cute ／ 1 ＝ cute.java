import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0;i<n; i++){
            if(Integer.parseInt(br.readLine())==1){
                count++;
            }
        }
        if(count<n-count){
            System.out.println("Junhee is not cute!");
        }else{
            System.out.println("Junhee is cute!");
        }
    }
}