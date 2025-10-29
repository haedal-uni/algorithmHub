import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float n = Integer.parseInt(br.readLine());
        int e = 0;
        String[] s = br.readLine().split("");
        for(int i=0; i<n; i++){
            if(s[i].equals("e")){
                e++;
            }
        }
        if(e==n/2){
            System.out.print("yee");
        }else if(e>n/2){
            System.out.print("e");
        }else{
            System.out.print("2");
        }
    }
}