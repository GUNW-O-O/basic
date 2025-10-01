package 수조작하기1;

public class Solution {
  public int solution(int n, String control) {
    for (char s : control.toCharArray()) {
      switch (s) {
        case 'w':
          n += 1;
          break;
        case 's':
          n -= 1;
          break;
        case 'd':
          n += 10;
          break;
        case 'a':
          n -= 10;
          break;
      }
    }
    return n;
  }
}
