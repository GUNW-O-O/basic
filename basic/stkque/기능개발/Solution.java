package stkque.기능개발;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int[] solution(int[] progresses, int[] speeds) {
    Deque<Integer> progress = new ArrayDeque<>();
    Deque<Integer> speed = new ArrayDeque<>();
    Deque<Integer> complete = new ArrayDeque<>();

    for (int i : progresses) {
      progress.offerLast(i);
    }
    for (int i : speeds) {
      speed.offerLast(i);
    }
    while (!progress.isEmpty()) {
      int cnt = 0;
      while (!progress.isEmpty() && progress.peekFirst() >= 100) {
        progress.pollFirst();
        speed.pollFirst();
        cnt++;
      }
      for (int i = 0; i < progress.size(); i++) {
        int spd = speed.pollFirst();
        int cur = progress.pollFirst() + spd;
        progress.offerLast(cur);
        speed.offerLast(spd);
      }
      if(cnt > 0) {
        complete.offerLast(cnt);
      }
    }

    int[] answer = new int[complete.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = complete.pollFirst();
    }
    return answer;
  }
}