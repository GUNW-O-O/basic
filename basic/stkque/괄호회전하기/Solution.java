package stkque.괄호회전하기;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int solution(String s) {
    Deque<Character> que = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
      que.offerLast(c);
    }
    int answer = 0;
    for (int i = 0; i < que.size(); i++) {
      int cnt = 0;
      Deque<Character> stk = new ArrayDeque<>();
      for (Character c : que) {
        switch (c) {
          case '(': stk.offerLast(c);
            break;
          case '{': stk.offerLast(c);
            break;
          case '[': stk.offerLast(c);
            break;
          case ')': 
            if(!stk.isEmpty() && stk.peekLast() == '(') {
              stk.pollLast();
            }
            else cnt = -1;
            break;
          case '}': 
            if(!stk.isEmpty() && stk.peekLast() == '{') {
              stk.pollLast();
            }
            else cnt = -1;
            break;
          case ']': 
            if(!stk.isEmpty() && stk.peekLast() == '[') {
              stk.pollLast();
            }
            else cnt = -1;
            break;
          default: break;
        }
        if (cnt < 0) {
          break;
        }
      }
      if(stk.isEmpty() && cnt >= 0) {
        answer++;
      }
      char cur = que.pollFirst();
      que.offerLast(cur);
    }
    return answer;
  }
}
