package 콜라츠수열;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
  public int[] solution(int n) {
    List<Integer> list = new ArrayList<>();
    list.add(n);
    while (n != 1) {
    n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
    list.add(n);
    }
    int[] answer = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
    answer[i] = list.get(i);
    }
    return answer;
    // return IntStream.concat(
    //     IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
    //     IntStream.of(1))
    //     .toArray();
  }
}
