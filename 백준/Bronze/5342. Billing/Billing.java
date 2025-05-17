import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0.0;
        while(true) {
            String x = br.readLine();
            if(x.equals("EOI")) break;
            switch(x) {
                case "Paper":
                    sum+= 57.99;
                    break;
                case "Printer":
                    sum+=120.50;
                    break;
                case "Planners":
                    sum+=31.25;
                    break;
                case "Binders":
                    sum+=22.50;
                    break;
                case "Calendar":
                    sum+=10.95;
                    break;
                case "Notebooks":
                    sum+=11.20;
                    break;
                case "Ink":
                    sum+=66.95;
                    break;
            }
        }
        System.out.print("$"+sum);
    }
}