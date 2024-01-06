import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x;
        double answer = 0;
        double sum = 0;
        double avg = 0;
        for(int i=0; i<20; i++){
            x = br.readLine().split(" ");
            avg = Double.parseDouble(x[1]);
            if(!x[2].equals("P")){
                switch (x[2]) {
                    case "A+" :
                        answer+=(4.5*avg);
                        sum += avg;
                        break;
                    case "A0" :
                        answer+=(4.0*avg);
                        sum += avg;
                        break;
                    case "B+" :
                        answer += (3.5*avg);
                        sum += avg;
                        break;
                    case "B0":
                        answer +=(3.0*avg);
                        sum += avg;
                        break;
                    case "C+" :
                        answer+=(2.5*avg);
                        sum += avg;
                        break;
                    case "C0" :
                        answer+=(2.0*avg);
                        sum += avg;
                        break;
                    case "D+" :
                        answer += (1.5*avg);
                        sum += avg;
                        break;
                    case "D0" :
                        answer += avg;
                        sum += avg;
                        break;
                    case "F" :
                        answer += 0.0;
                        sum += avg;
                        break;
                }
            }
        }
        System.out.printf("%.6f", answer/sum);
    }
}