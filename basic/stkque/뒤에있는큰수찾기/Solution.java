package stkque.뒤에있는큰수찾기;

import java.util.Stack;

class Solution {
  public int[] solution(int[] numbers) {
    int n = numbers.length;
    int[] answer = new int [n];
    Stack<Integer> stk = new Stack<>();
    for (int i = 0; i < numbers.length; i++) {
      while (!stk.isEmpty() && numbers[i] > numbers[stk.peek()]) {
        int cur = stk.pop();
        answer[cur] = numbers[i];
      }
      stk.push(i);
    }
    while (!stk.isEmpty()) {
      int cur = stk.pop();
      answer[cur] = -1;
    }
    return answer;
  }
}