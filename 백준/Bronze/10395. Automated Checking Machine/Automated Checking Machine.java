import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        boolean flag = false;
        for(int i=0; i<x.length; i++){
            if(x[i].equals(y[i])){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print("N");
        }else{
            System.out.print("Y");
        }
    }
}