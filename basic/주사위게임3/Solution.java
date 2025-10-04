package 주사위게임3;

public class Solution {
  public int solution(int a, int b, int c, int d) {
    int[] arr = { a, b, c, d };
    int match = 0;
    int min = Integer.MAX_VALUE;
    int max = 0;
    int[] x = new int[4];
    int z = 1;
    boolean flip = false;
    int target3 = arr[0];
    int target1 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[0] == arr[i])
        match++;
      else
        x[i] = arr[i];
      if (arr[i] < min)
        min = arr[i];
      if (arr[i] > max)
        max = arr[i];
    }

    if (match == 3) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != target3)
          target1 = arr[i];
      }
    }

    if (match == 2) {
      int[] others = new int[2];
      int idx = 0;
      for (int f : x) {
        if (f != 0)
          others[idx++] = f;
      }
      if (others[0] == others[1])
        flip = true;
      else
        z = others[0] * others[1];
    }

    int answer = 0;
    switch (match) {
      case 4:
        answer = 1111 * arr[0];
        break;
      case 3:
        answer = (int) Math.pow(10 * target3 + target1, 2);
        break;
      case 2:
        answer = flip ? (max + min) * Math.abs(max - min) : z;
        break;
      case 1:
        answer = min;
        break;
    }
    return answer;
  }
}