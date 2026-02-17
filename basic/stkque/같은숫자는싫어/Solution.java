package stkque.같은숫자는싫어;

import java.util.*;

public class Solution {
  public int[] solution(int[] arr) {

    Deque<Integer> que = new ArrayDeque<>();
    for (int a : arr) {
      if (que.isEmpty()) {
        que.offer(a);
      }
      else if (a != que.peekLast()) {
        que.offerLast(a);
      }
    }
    int[] answer = new int[que.size()];

    int i = 0;
    for (int n : que) {
      answer[i++] = n;
    }

    return answer;
  }
}