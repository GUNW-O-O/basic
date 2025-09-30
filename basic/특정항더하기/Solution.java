package 특정항더하기;

public class Solution {
  public int solution(int a, int d, boolean[] included) {
    int result = 0;
    for(int i = 0; i < included.length; i++) {
      result += included[i] ? (a + d * i) : 0;
    }
    return result;
    // return IntStream.range(0, included.length).
    //     map(idx -> included[idx]?a+(idx*d):0)
    //     .sum();
  }
}
