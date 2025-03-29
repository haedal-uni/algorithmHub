import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        boolean flag = false;
        int a = 0;
        if(x.length<3){
            flag = true;
        }else{
            a = Integer.parseInt(x[0]);
            a -= Integer.parseInt(x[1]);
            for(int i=1; i<x.length-1; i++) {
                if(Integer.parseInt(x[i])-Integer.parseInt(x[i+1])!=a){
                    flag=false;
                    break;
                }else{
                    flag=true;
                }
            }
        }
        if(flag) {
            System.out.print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        }else{
            System.out.print("흥칫뿡!! <(￣ ﹌ ￣)>");
        }
    }
}