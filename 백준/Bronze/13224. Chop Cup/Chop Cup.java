import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int[] arr = {1, 0, 0};
        int temp = 0;
        for (String s : x) {
            if (s.equals("A")) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            } else if (s.equals("B")) {
                temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            } else {
                temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                System.out.print(i+1);
                break;
            }
        }
    }
}