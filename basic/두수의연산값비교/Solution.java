package 두수의연산값비교;

public class Solution {
  public int solution(int a, int b) {
    return Math.max(Integer.parseInt(""+ a + b), (2*a*b));
  }
}
