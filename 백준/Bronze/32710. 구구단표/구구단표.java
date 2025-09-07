import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x<=10){
            System.out.print("1");
        }else{
            if(x%9==0 && x/9<10
                    || x%8==0 && x/8<10
                    || x%7==0 && x/7<10
                    || x%6==0 && x/6<10
                    || x%5==0 && x/5<10
                    || x%4==0 && x/4<10
                    || x%3==0 && x/3<10
                    || x%2==0 && x/2<10
            ){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
    }
}