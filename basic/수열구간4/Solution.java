package 수열구간4;

class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    for (int[] que : queries) {
      int s = que[0];
      int e = que[1];
      int k = que[2];
      for(int i = s; i <= e; i++) {
        if(i % k == 0) {
          arr[i] += 1;
        }
      }
    }
    return arr;
  }
}