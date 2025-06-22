import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = {1500, 6000, 15500, 40000, 75000, 125000};
        int sum = 0;
        for(int i=0; i<n; i++){
            String x = br.readLine();
            if(x.equals("Poblano")){
                sum+=arr[0];
            }else if(x.equals("Mirasol")){
                sum+=arr[1];
            }else if(x.equals("Serrano")){
                sum+=arr[2];
            }else if(x.equals("Cayenne")){
                sum+=arr[3];
            }else if(x.equals("Thai")){
                sum+=arr[4];
            }else{
                sum+=arr[5];
            }
        }
        System.out.print(sum);
    }
}