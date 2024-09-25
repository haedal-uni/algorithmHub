import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if(x>=y){
            System.out.print("Congratulations, you are within the speed limit!");
        }else{
            y=y-x;
            if(y<=20){
                System.out.print("You are speeding and your fine is $100.");
            }else if(y<=30){
                System.out.print("You are speeding and your fine is $270.");
            }else{
                System.out.print("You are speeding and your fine is $500.");
            }
        }
    }
}