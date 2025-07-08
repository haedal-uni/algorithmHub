import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lion = 0;
        int tiger = 0;
        for(int i=0; i<9; i++){
            String s = br.readLine();
            if(s.equals("Lion")){
                lion++;
            }else{
                tiger++;
            }
            if(lion>=5 || tiger>=5){
                break;
            }
        }
        if(lion>=5){
            System.out.print("Lion");
        }else{
            System.out.print("Tiger");
        }
    }
}