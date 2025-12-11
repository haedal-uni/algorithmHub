import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int back = 0;
        int front = 0;
        for(int i=0; i<n; i++){
            if(Integer.parseInt(br.readLine()) == 0){
                front++;
            }else{
                back++;
            }
        }
        System.out.print(n-Math.max(front, back));
    }
}