import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int bonus = 0;
        int score = 0;
        for(int i=0; i<n; i++){
            if(s[i].charAt(0)==79){
                score+=i+1+bonus;
                bonus+=1;
            }else{
                bonus=0;
            }
        }
        System.out.print(score);
    }
}