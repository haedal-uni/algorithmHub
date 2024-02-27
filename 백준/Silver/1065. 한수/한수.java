import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int df = 0;
        String ans = "o";
        String[] st;
        if(x<100){
            count = x;
        }else if(x<122){
            if(x>110){
                count=100;
            }else{
                count=99;
            }
        }
        else{
            count+=100;
            for(int i=123; i<x+1; i++){
                st = String.valueOf(i).split("");
                for(int j=1; j<st.length-1; j++){
                   df = Integer.parseInt(st[0]) - Integer.parseInt(st[1]);
                   if(Integer.parseInt(st[j])-Integer.parseInt(st[j+1])!=df){
                       ans = "x";
                   }
                }
                if(!ans.equals("x")){
                    count++;
                }
                ans="";
            }
        }
        System.out.println(count);
    }
}