import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        if(d==1){
            for(int i=0; i<n; i++){
                String[] str = br.readLine().split("");
                for (String s : str) {
                    switch (s) {
                        case "d":
                            sb.append("q");
                            break;
                        case "b":
                            sb.append("p");
                            break;
                        case "q":
                            sb.append("d");
                            break;
                        case "p":
                            sb.append("b");
                            break;
                    }
                }
                sb.append("\n");
            }
        }else{
            for(int i=0; i<n; i++){
                String[] str = br.readLine().split("");
                for (String s : str) {
                    switch (s) {
                        case "d":
                            sb.append("b");
                            break;
                        case "b":
                            sb.append("d");
                            break;
                        case "q":
                            sb.append("p");
                            break;
                        case "p":
                            sb.append("q");
                            break;
                    }
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);

    }
}