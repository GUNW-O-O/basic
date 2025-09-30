package 이어붙인수;

public class Solution {
  public int solution(int[] num_list) {
    StringBuilder sbo = new StringBuilder();
    StringBuilder sbe = new StringBuilder();
    for (int i : num_list) {
      if(i%2 == 1) sbo.append(i);
      else sbe.append(i);
    }
    return Integer.parseInt(sbo.toString()) + Integer.parseInt(sbe.toString());
  }
}
