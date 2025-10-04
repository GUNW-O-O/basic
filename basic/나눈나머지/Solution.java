package 나눈나머지;


public class Solution {
  public int solution(String number) {
    int answer = 0;
    for (char ch : number.toCharArray()) {
      answer += Integer.parseInt(Character.toString(ch));
    }
    return answer % 9;
    // return number.chars().map(c -> (c - '0') % 9).sum() % 9;
  }
}
