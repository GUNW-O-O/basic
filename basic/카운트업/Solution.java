package 카운트업;

import java.util.stream.IntStream;

public class Solution {
  public int[] solution(int start_num, int end_num) {
    return IntStream.rangeClosed(start_num, end_num).toArray();
    // 스트림 안쓰고?
    // int[] arr = new int[end_num - start_num + 1];
    // int idx = 0;
    // for(int i = start_num; i <= end_num; i++) {
    //   arr[idx] = i;
    //   idx++;
    // }
    // return arr;
  }
}
