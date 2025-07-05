import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int current = 0;
        int ammo = 0;
        boolean save = false;
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            switch (command) {
                case "save":
                    ammo = current;
                    save = true;
                    break;
                case "load":
                    current = save ? ammo : 0;
                    break;
                case "shoot":
                    current--;
                    break;
                case "ammo":
                    current += k;
                    break;
            }
            sb.append(current).append("\n");
        }
        System.out.print(sb);
    }
}