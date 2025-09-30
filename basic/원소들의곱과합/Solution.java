package 원소들의곱과합;

import java.util.Arrays;

public class Solution {
  public int solution(int[] num_list) {
    int mul = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    int sumpow = Arrays.stream(num_list).sum();
    sumpow = (int)Math.pow(sumpow, 2);
    return mul < sumpow ? 1 : 0;
  }
}
