import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder zero = new StringBuilder();
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = new StringBuilder();
        StringBuilder four = new StringBuilder();
        StringBuilder five = new StringBuilder();
        StringBuilder six = new StringBuilder();
        StringBuilder seven = new StringBuilder();
        StringBuilder eight = new StringBuilder();
        StringBuilder nine = new StringBuilder();
        StringBuilder ten = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        zero.append("0000").append("\n").append("0  0").append("\n")
                .append("0  0").append("\n").append("0  0").append("\n").append("0000");
        one.append("   1").append("\n").append("   1").append("\n")
                .append("   1").append("\n").append("   1").append("\n").append("   1");
        two.append("2222").append("\n").append("   2").append("\n")
                .append("2222").append("\n").append("2").append("\n").append("2222");
        three.append("3333").append("\n").append("   3").append("\n")
                .append("3333").append("\n").append("   3").append("\n").append("3333");
        four.append("4  4").append("\n").append("4  4").append("\n")
                .append("4444").append("\n").append("   4").append("\n").append("   4");
        five.append("5555").append("\n").append("5").append("\n")
                .append("5555").append("\n").append("   5").append("\n").append("5555");
        six.append("6666").append("\n").append("6").append("\n").append("6666")
                .append("\n").append("6  6").append("\n").append("6666");
        seven.append("7777").append("\n").append("   7").append("\n").append("   7")
                .append("\n").append("   7").append("\n").append("   7");
        eight.append("8888").append("\n").append("8  8").append("\n").append("8888")
        .append("\n").append("8  8").append("\n").append("8888");
        nine.append("9999").append("\n").append("9  9").append("\n").append("9999")
        .append("\n").append("   9").append("\n").append("   9");
        String[] x = br.readLine().split("");
        for (String s : x) {
            switch (s) {
                case "0":
                    sb.append(zero).append("\n\n");
                    break;
                case "1":
                    sb.append(one).append("\n\n");
                    break;
                case "2":
                    sb.append(two).append("\n\n");
                    break;
                case "3":
                    sb.append(three).append("\n\n");
                    break;
                case "4":
                    sb.append(four).append("\n\n");
                    break;
                case "5":
                    sb.append(five).append("\n\n");
                    break;
                case "6":
                    sb.append(six).append("\n\n");
                    break;
                case "7":
                    sb.append(seven).append("\n\n");
                    break;
                case "8":
                    sb.append(eight).append("\n\n");
                    break;
                case "9":
                    sb.append(nine).append("\n\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}