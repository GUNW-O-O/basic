package map.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public String solution(String[] participant, String[] completion) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : participant) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    for (String s : completion) {
      map.put(s, map.get(s) - 1);
    }
    for(String key : map.keySet()) {
      if(map.get(key) > 0) {
        return key;
      }
    }
    return "";
  }
}