import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        boolean flag = false;
        for(int i=1; i<x.length+1; i++){
            if(Integer.parseInt(x[i-1])!=i){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print(-1);
        }else{
            System.out.print(x.length);
        }
    }
}