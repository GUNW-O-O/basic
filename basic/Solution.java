class Solution {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int a1 = numer1 * denom2;
    int a2 = numer2 * denom1;
    int a = a1 + a2;
    int b = denom1 * denom2;
    if (a % 2 == 0 && b % 2 == 0) {
      a /= 2;
      b /= 2;
    }
    return new int[]{a, b};
  }
}