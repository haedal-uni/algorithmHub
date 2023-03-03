class Solution {
	public long solution(long n) {
		long answer = 0;
		Double temp = Math.sqrt(n);
		if (temp == temp.intValue()) {
			answer = (long) Math.pow(temp +1 ,2);
		} else {
            answer = -1;
        }

		return answer;
	}
}