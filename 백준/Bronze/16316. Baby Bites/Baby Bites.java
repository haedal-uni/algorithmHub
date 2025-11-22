import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean flag = false;
        for(int i=1; i<n+1; i++){
            String s = st.nextToken();
            if(s.equals("mumble")){
                continue;
            }
            if(!s.equals(i+"")){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.print("makes sense");
        }else{
            System.out.print("something is fishy");
        }
    }
}