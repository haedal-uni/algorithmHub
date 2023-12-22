import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        String answer = "";
        answer = (score>=90) ? "A" : (score>=80&score<=89) ? "B" : (score>=70&score<=79)? "C" : (score>=60&score<=69)? "D" : "F";
        System.out.print(answer);
    }
}