import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            for(int j=0; j<x; j++){
                st = new StringTokenizer(br.readLine()," ");
                sb.append(st.nextToken());
                ss.append(st.nextToken());
                if(sb.toString().equals("R")){
                    if(ss.toString().equals("P")){
                        b++;
                    }else if(ss.toString().equals("S")){
                        a++;
                    }
                }else if(sb.toString().equals("P")){
                    if(ss.toString().equals("R")){
                        a++;
                    }else if(ss.toString().equals("S")){
                        b++;
                    }
                }else{
                    if(ss.toString().equals("R")){
                        b++;
                    }else if(ss.toString().equals("P")){
                        a++;
                    }
                }
                ss.delete(0, ss.length());
                sb.delete(0, sb.length());
            }
            if(a>b){
                ans.append("Player 1").append("\n");
            }else if(a==b){
                ans.append("TIE").append("\n");
            }else{
                ans.append("Player 2").append("\n");
            }
            a=0;
            b=0;
        }
        System.out.print(ans);
    }
}