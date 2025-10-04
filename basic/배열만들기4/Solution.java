package 배열만들기4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int[] solution(int[] arr) {
    // 제한시간 초과;;
    // List<Integer> list = new ArrayList<>();
    // int idx = 0;
    // while (idx < arr.length) {
    // if (list.size() == 0) {
    // list.add(arr[idx]);
    // idx++;
    // } else if (list.size() != 0 && list.get(list.size() - 1) < arr[idx]) {
    // list.add(arr[idx]);
    // idx++;
    // } else if (list.size() != 0 && list.get(list.size() - 1) > arr[idx]) {
    // list.remove(list.size() - 1);
    // }
    // }
    // int[] stk = new int[list.size()];
    // for(int i = 0; i < list.size(); i++) {
    // stk[i] = list.get(i);
    // }
    // return stk;
    List<Integer> stk = new ArrayList<>();
    for (int num : arr) {
      while (!stk.isEmpty() && stk.get(stk.size() - 1) >= num) {
        stk.remove(stk.size() - 1);
      }
      stk.add(num);
    }
    int[] result = new int[stk.size()];
    for (int i = 0; i < stk.size(); i++) {
      result[i] = stk.get(i);
    }
    return result;
  }
}
