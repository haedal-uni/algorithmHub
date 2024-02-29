import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(d(Integer.parseInt(br.readLine())));
    }
    public static int d(int x) {
        int count = 0;
        if (x < 100) {
            return x;
        }else if(x<122){
            if(x>110){
                count=100;
            }else{
                count=99;
            }
        }
        else {
            count = 100;
            for (int i=123; i<x+1; i++) {
                int a = i/100;
                int b = (i/10)%10;
                int c = i%10;
                if ((a-b) == (b-c)) {
                    count++;
                }
            }
        }
        return count;
    }
}