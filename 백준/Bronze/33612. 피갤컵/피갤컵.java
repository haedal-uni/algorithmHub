import java.io.*;
import java.time.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        YearMonth start = YearMonth.of(2024, 8);
        int x= Integer.parseInt(br.readLine());
        YearMonth date = start.plusMonths((x-1) * 7L);
        System.out.print(date.getYear() + " " + date.getMonthValue());
    }
}