import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int count = 1;
        String[] ans = {"SK","CY"};
        while (x!=0){
            if(x%3==0){
                x/=3;
            }
            if(x-3>0){
                x-=3;
            }else{
                x-= 1;
            }
            if(count==0){
                count=1;
            }else {
                count=0;
            }
        }
        System.out.println(ans[count]);
    }
}