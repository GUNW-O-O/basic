package flag에따라;

public class Solution {
  public int solution(int a, int b, boolean flag) {
    return flag ? (a+b) : (a+(b*-1));
  }
}
