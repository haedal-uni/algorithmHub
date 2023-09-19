class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] ans = my_string.split("");
        for(int i=0; i<indices.length; i++){
            ans[indices[i]] = "";
        }
        for(int i=0; i<ans.length; i++){
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}