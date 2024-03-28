import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[8001];
        int x = Integer.parseInt(br.readLine());
        int y = 0;
        int z = 0;
        int max = -4000;
        int min = 4000;
        int mid = 0;
        int mode = 0;
        int sum = 0;
        int count = 0;
        boolean check = false;
        for (int i = 0; i < x; i++) {
            y = Integer.parseInt(br.readLine());
            sum += y;
            arr[y + 4000]++;
            if (min > y) {
                min = y;
            }
            if (max < y) {
                max = y;
            }
        }
        for (int i = min + 4000; i < max + 4001; i++) {
            if (arr[i] > 0) {
                if (count < (x + 1) / 2) {
                    count += arr[i];
                    mid = i - 4000;
                }
                if (z < arr[i]) {
                    z = arr[i];
                    mode = i - 4000;
                    check = true;
                } else if (z == arr[i] && check == true) {
                    mode = i - 4000;
                    check = false;
                }
            }
        }
        sb.append(Math.round((double) sum / x)).append("\n")
                .append(mid).append("\n")
                .append(mode).append("\n")
                .append(max - min);
        System.out.println(sb);
    }
}