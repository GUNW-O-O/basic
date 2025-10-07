class Solution {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int a1 = numer1 * denom2;
    int a2 = numer2 * denom1;
    int a = a1 + a2;
    int b = denom1 * denom2;
    for (int i = 999; i > 1; i--) {
      if(a % i == 0 && b % i == 0) {
        a /= i;
        b /= i;
      }
    }
    return new int[]{a, b};
  }
}