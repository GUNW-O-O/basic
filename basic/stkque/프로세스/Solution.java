package stkque.프로세스;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int solution(int[] priorities, int location) {
    int answer = 0;
    int quemax = 9;
    int[] quepri = new int[10];
    Deque<Integer> que = new ArrayDeque<>();
    for (int a : priorities) {
      quepri[a]++;
      que.offerLast(a);
    }
    while (!que.isEmpty()) {
      while (quemax > 0 && quepri[quemax] == 0) {
        quemax--;
      }
      if (que.peekFirst() == quemax) {
        que.pollFirst();
        quepri[quemax]--;
        answer++;
        if (location == 0) {
          return answer;
        }
        location--;
      } else {
        int cur = que.pollFirst();
        que.offerLast(cur);
        if (location == 0) {
          location = que.size() - 1;
        } else {
          location--;
        }
      }
    }
    return answer;
  }
}