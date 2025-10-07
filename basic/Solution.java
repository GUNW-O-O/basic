class Solution {
  public int solution(int[] array) {
    int[] u = new int[1000];
    for (int i = 0; i < array.length; i++) {
      u[array[i]]++;
    }
    int max = 0;
    int idx = 0;
    for (int i = 0; i < u.length; i++) {
      if(u[i] > max) {
        max = u[i];
        idx = i;
      }
    }
    for (int i = 0; i < u.length; i++) {
      if(max == u[i] && idx != i) return -1;
    }
    return idx;
  }
}