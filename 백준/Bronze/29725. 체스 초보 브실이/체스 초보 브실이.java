import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i=0; i<8; i++){
            String s = br.readLine();
            for(int j=0; j<8; j++){
                char ch = s.charAt(j);
                switch(ch){
                    case 'p':
                        sum-=1;
                        break;
                    case 'P' :
                        sum+=1;
                        break;
                    case 'b':
                        sum-=3;
                        break;
                    case 'B' :
                        sum+=3;
                        break;
                    case 'n':
                        sum-=3;
                        break;
                    case 'N' :
                        sum+=3;
                        break;
                    case 'r':
                        sum-=5;
                        break;
                    case 'R' :
                        sum+=5;
                        break;
                    case 'q':
                        sum-=9;
                        break;
                    case 'Q' :
                        sum+=9;
                        break;
                }
            }
        }
        System.out.print(sum);
    }
}