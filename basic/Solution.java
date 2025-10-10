import java.util.Arrays;

class Solution {
  public double solution(int[] numbers) {
    double answer = Arrays.stream(numbers).sum();
    answer /= numbers.length;
    return answer;
    // return Arrays.stream(numbers).average().orElse(0);
  }
}