class Solution {
    public String solution(String phone_number) {
        String num = phone_number.substring(phone_number.length()-4);
        return "*".repeat(phone_number.length()-4).concat(num);
    }
}