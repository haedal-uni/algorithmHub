import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine().equalsIgnoreCase("n")){
            System.out.println("Naver D2");
        }else{
            System.out.println("Naver Whale");
        }
    }
}