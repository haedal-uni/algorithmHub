class Solution {
    public int solution(int order) {
        String as = "" + order + "";
        int answer = as.length();
        as = as.replaceAll("3","").replaceAll("6","").replaceAll("9", "");
        return answer-as.length();
    }
}