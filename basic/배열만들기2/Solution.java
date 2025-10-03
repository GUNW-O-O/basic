package 배열만들기2;

import java.util.stream.IntStream;

public class Solution {
  public int[] solution(int l, int r) {
    int[] answer = IntStream.rangeClosed(l, r)
    .filter(e -> String.valueOf(e)
      .chars()
      .allMatch(ch -> ch == '0' || ch == '5'))
    .toArray();
    return answer.length == 0 ? new int[]{-1} : answer ;
  }
}
