import java.util.*;

class Solution {
    private List<Integer> list = new ArrayList<>();
    private List<Integer> list1 = new ArrayList<>();
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        for (int number : numbers) {
            list1.add(number);
        }
        a(list1);
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public void a(List<Integer> list1) {
        if (list1.size() == 0) {
            return;
        }
        for (int i = 0; i < list1.size() - 1; i++) {
            int sum = list1.get(0) + list1.get(i + 1);
            if (!list.contains(sum)) {
                list.add(sum);
            }
        }
        list1.remove(list1.get(0));
        a(list1);
    }
}
