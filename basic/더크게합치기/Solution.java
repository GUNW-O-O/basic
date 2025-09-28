package 더크게합치기;

public class Solution {
  public int solution(int a, int b) {
    // String ab = Integer.toString(a) + Integer.toString(b);
    // String ba = Integer.toString(b) + Integer.toString(a);

    // int c = Integer.parseInt(ab);
    // int d = Integer.parseInt(ba);
    // int answer = (c >= d) ? c : d;
    // return answer;
    int answer = 0;
    int aLong = Integer.parseInt("" + a + b);
    int bLong = Integer.parseInt("" + b + a);
    answer = aLong > bLong ? aLong : bLong;

    return answer;
  }
}
