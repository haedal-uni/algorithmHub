class Solution {
    public boolean solution(int x) {
		int num = x;
		int answer = 0;
		int length = (int)(Math.log10(x)+1);
		for (int i=0; i<length; i++){
			answer += x % 10;
			x /= 10;
		}

		if (num % answer == 0) {
			return true;
		}
		return false;
    }
}