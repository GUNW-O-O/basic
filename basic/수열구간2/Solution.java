package 수열구간2;

import java.util.stream.IntStream;

public class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];
    int idx = 0;
    for (int[] q : queries) {
      int s = q[0];
      int e = q[1];
      int k = q[2];
      int target = Integer.MAX_VALUE;
      for (int i = s; i <= e; i++) {
        if (arr[i] > k) {
          if (target > arr[i]) {
            target = arr[i];
          }
        }
      }
      answer[idx] = target == Integer.MAX_VALUE ? -1 : target;
      idx++;
    }
    return answer;
  }

  // public int[] solution(int[] arr, int[][] queries) {
  //   int[] answer = {};
  //   return IntStream.range(0, queries.length)
  //       .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
  //           .map(i -> arr[i])
  //           .filter(i -> i > queries[q][2])
  //           .min().orElse(-1))
  //       .toArray();
  // }
}