import java.io.*;
public class Main {
    static int num = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String[] y;
        int count = 0;
        int answer = 0;
        for (int i=0; i<x; i++){
            answer = 0;
            y = br.readLine().split("");
            for(int j=0; j<y.length; j++){
                if(y[j].equals("O")){
                    count++;
                }else{
                    if(count!=0){
                        answer += num(count);
                        count = 0;
                        num=0;
                    }
                }
            }
            if(count!=0){
                answer += num(count);
                count = 0;
                num = 0;
            }
            System.out.println(answer);
        }
    }

    public static int num(int n) {
        if (n==0) {
            return num;
        }
        num = n + num(n - 1);
        return num;
    }
}