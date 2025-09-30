package 코드처리하기;

public class Solution {
  public String solution(String code) {
    char[] arr = code.toCharArray();
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    int mode = 0;
    // for (int i = 0; i < code.length(); i++) {
    //   char current = code.charAt(i);
    //   if (current == '1') {
    //     mode = mode == 0 ? 1 : 0;
    //     continue;
    //   }

    //   if (i % 2 == mode) {
    //     answer.append(current);
    //   }
    // }
    for (char s : arr) {
      if (mode == 0) {
        if (arr[idx] == 49)
          mode = 1;
        else if (idx % 2 == 0) {
          sb.append(arr[idx]);
        }
      } else if (mode == 1) {
        if (arr[idx] == 49)
          mode = 0;
        else if (idx % 2 == 1) {
          sb.append(arr[idx]);
        }
      }
      idx++;
    }
    return (sb.length() == 0) ? "EMPTY" : sb.toString();
  }
}