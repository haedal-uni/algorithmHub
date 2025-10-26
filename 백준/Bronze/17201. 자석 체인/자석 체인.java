import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())*2;
        String[] s = br.readLine().split("");
        String x = s[0];
        boolean flag = true;
        if(x.equals("1")){
            for(int i=1; i<n; i++){
                if(i%2==0 && !s[i].equals("1")){
                    System.out.print("No");
                    flag = false;
                    break;
                }else if(i%2==1 && !s[i].equals("2")){
                    System.out.print("No");
                    flag = false;
                    break;
                }
            }
        }else{
            for(int i=1; i<n; i++){
                if(i%2==1 && !s[i].equals("1")){
                    System.out.print("No");
                    flag = false;
                    break;
                }else if(i%2==0 && !s[i].equals("2")){
                    System.out.print("No");
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.print("Yes");
        }
    }
}