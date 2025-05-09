import java.io.*;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = date.parse(br.readLine());
        if(date1.after(date.parse("2023-09-16"))) {
            System.out.print("TOO LATE");
        }else{
            System.out.print("GOOD");
        }
    }
}