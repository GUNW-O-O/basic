package 조건문자열;

public class Solution {
  public int solution(String ineq, String eq, int n, int m) {
    if(eq.equals("=")) {
      if(ineq.equals(">")) {
        return n >= m ? 1 : 0;
      } else return n <= m ? 1 : 0;
    } else {
      if(ineq.equals(">")) {
        return n > m ? 1 : 0;
      } else return n < m ? 1 : 0;
    }
  }
}
