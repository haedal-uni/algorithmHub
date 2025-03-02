import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = {1, 0, 0, 4};
        String[] x = br.readLine().split("");
        int temp = 0;
        for (String s : x) {
            switch (s) {
                case "A":
                    temp = arr[0];
                    arr[0] = arr[1];
                    arr[1] = temp;
                    break;
                case "B":
                    temp = arr[0];
                    arr[0] = arr[2];
                    arr[2] = temp;
                    break;
                case "C":
                    temp = arr[0];
                    arr[0] = arr[3];
                    arr[3] = temp;
                    break;
                case "D":
                    temp = arr[1];
                    arr[1] = arr[2];
                    arr[2] = temp;
                    break;
                case "E":
                    temp = arr[1];
                    arr[1] = arr[3];
                    arr[3] = temp;
                    break;
                case "F":
                    temp = arr[2];
                    arr[2] = arr[3];
                    arr[3] = temp;
                    break;
            }
        }
        int min = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                min = i+1;
            }
            if(arr[i]==4){
                max = i+1;
            }
        }
        sb.append(min).append("\n").append(max);
        System.out.print(sb);
    }
}