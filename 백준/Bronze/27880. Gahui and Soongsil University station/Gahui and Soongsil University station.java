import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String input = br.readLine();
            if (input==null || input.isBlank()) {
                break;
            }
            String[] line = input.split(" ");
            if (line[0].equals("Stair")) {
                sum+=17*Integer.parseInt(line[1]);
            } else {
                sum+=21*Integer.parseInt(line[1]);
            }
        }
        System.out.print(sum);
    }
}