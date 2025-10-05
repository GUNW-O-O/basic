import java.util.ArrayList;
import java.util.List;

class Solution {
  public int solution(String my_string, String is_suffix) {
    List<String> list = new ArrayList<>();
    for(int i = my_string.length(); i > 0; i--) {
      list.add(my_string.substring(i-1, my_string.length()));
    }
    for(String s : list) {
      if(is_suffix.equals(s)) return 1;
    }
    return 0;
    // return myString.endsWith(isSuffix) ? 1 : 0;
  }
}