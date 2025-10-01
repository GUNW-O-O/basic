package 수열구간3;

public class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    for (int[] s : queries) {
      int temp = arr[s[0]];
      arr[s[0]] = arr[s[1]];
      arr[s[1]] = temp;
    }
    return arr;
  }
}
