package 주사위게임2;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
  public int solution(int a, int b, int c) {
    int answer;
    if (a == b && b == c) {
      answer = (a + b + c) * ((int) Math.pow(a, 2) +
          (int) Math.pow(a, 2) +
          (int) Math.pow(a, 2))
          * ((int) Math.pow(a, 3) +
              (int) Math.pow(a, 3) +
              (int) Math.pow(a, 3));
    } else if (a == b || b == c || c == a) {
      answer = (a + b + c) *
          ((int) Math.pow(a, 2) +
              (int) Math.pow(b, 2) +
              (int) Math.pow(c, 2));
    } else {
      answer = a + b + c;
    }
    return answer;
  }
  // public int solution(int a, int b, int c) {
  //   Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());

  //   return (a + b + c) *
  //       (numbers.size() < 3 ? a * a + b * b + c * c : 1) *
  //       (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1);
  // }
}