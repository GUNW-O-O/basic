package 주사위게임3;

public class Solution {
  public int solution(int a, int b, int c, int d) {
    int[] arr = { a, b, c, d };
    int[] count = new int[7];
    for (int i = 0; i < 4; i++) {
      count[arr[i]]++;
    }

    int answer = 0;

    for (int i = 1; i <= 6; i++) {
      if (count[i] == 4) {
        answer = 1111 * i;
        return answer;
      }
    }

    for (int i = 1; i <= 6; i++) {
      if (count[i] == 3) {
        int p = i, q = 0;
        for (int j = 1; j <= 6; j++) {
          if (count[j] == 1) {
            q = j;
            break;
          }
        }
        answer = (int) Math.pow(10 * p + q, 2);
        return answer;
      }
    }

    int firstPair = 0, secondPair = 0, single1 = 0, single2 = 0;
    for (int i = 1; i <= 6; i++) {
      if (count[i] == 2) {
        if (firstPair == 0)
          firstPair = i;
        else
          secondPair = i;
      } else if (count[i] == 1) {
        if (single1 == 0)
          single1 = i;
        else
          single2 = i;
      }
    }

    if (firstPair != 0 && secondPair != 0) {
      answer = (firstPair + secondPair) * Math.abs(firstPair - secondPair);
      return answer;
    } else if (firstPair != 0) {
      answer = single1 * single2;
      return answer;
    }

    int min = arr[0];
    for (int i = 1; i < 4; i++)
      if (arr[i] < min)
        min = arr[i];
    answer = min;
    return answer;
  }
}