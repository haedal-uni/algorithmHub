import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int x = 1;
        int y=0;
        int z=0;
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split("");
            sb.delete(0, sb.length());
            for(int j=s.length-1; j>=0; j--){
                y=0;
                z=0;
                if(x%2==1){
                    sb.append(s[j]);
                }else{
                    y = Integer.parseInt(s[j])*2;
                    if(y>=10){
                        z = y%10+y/10;
                        sb.append(z);
                    }else{
                        sb.append(y);
                    }
                }
                x++;
            }
            int sum = 0;
            for(int j=0; j<sb.length(); j++){
                sum+=Integer.parseInt(sb.substring(j,j+1));
            }
            if(sum%10==0){
                ans.append("T").append("\n");
            }else{
                ans.append("F").append("\n");
            }
        }
        System.out.print(ans);
    }
}