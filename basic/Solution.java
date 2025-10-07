class Solution {
  public int solution(int n) {
    int gcd = gcd(6, n);
    int lcm = 6 * n / gcd;
    return lcm / 6;
  }

  private int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}
