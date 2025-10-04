package 글자이어붙여;

public class Solution {
  public String solution(String my_string, int[] index_list) {
    char[] chars = my_string.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < index_list.length; i++) {
      int s = index_list[i];
      sb.append(chars[s]);
    }
    return sb.toString();
  }
}
