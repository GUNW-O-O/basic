package 마지막두원소;

// import java.util.Arrays;

public class Solution {
  public int[] solution(int[] num_list) {
    int a = num_list[num_list.length - 1];
    if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
      a -= num_list[num_list.length - 2];
    } else
      a *= 2;
    // int[] result = Arrays.copyOf(num_list, num_list.length + 1);
    int[] result = new int[num_list.length + 1];
    System.arraycopy(num_list, 0, result, 0, num_list.length);
    result[result.length - 1] = a;
    return result;
  }
}
