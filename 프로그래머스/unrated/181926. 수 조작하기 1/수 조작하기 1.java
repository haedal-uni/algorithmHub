class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String plus1 = control.replaceAll("d","").replaceAll("a","").replaceAll("s","");
        String minus1 = control.replaceAll("w","").replaceAll("d","").replaceAll("a","");
        String plus10 = control.replaceAll("w","").replaceAll("s","").replaceAll("a","");
        String minus10 = control.replaceAll("w","").replaceAll("s","").replaceAll("d","");
        answer = n + plus1.length()-minus1.length()+(plus10.length()*10)-(minus10.length()*10);
        return answer;
    }
}