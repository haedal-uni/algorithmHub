class Solution {
	public int[] solution(long n) {
		String num = String.valueOf(n);
		StringBuilder sb = new StringBuilder(num);
		sb.reverse();
		String[] hh = sb.toString().split("");
		int[] answer = new int[hh.length];
		for (int i=0; i<hh.length; i ++) {
			answer[i] = Integer.parseInt(hh[i]);
		}

		return answer;
	}
}