import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        boolean flag = false;
        for(int i=0; i<3; i++) {
            if(x>=Integer.parseInt(br.readLine())) {
                if(i==0){
                    System.out.print("Watermelon");
                    flag = true;
                    break;
                }else if(i==1){
                    System.out.print("Pomegranates");
                    flag = true;
                    break;
                }else{
                    System.out.print("Nuts");
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.print("Nothing");
        }
    }
}