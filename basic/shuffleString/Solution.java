package shufflestring;


class Solution {
  public String solution(String str1, String str2) {
    // char[] a = str1.toCharArray();
    // char[] b = str2.toCharArray();
    // List<String> list = new ArrayList<>();
    // for (int i = 0; i < str1.length(); i++) {
    //   list.add(Character.toString(a[i]));
    //   list.add(Character.toString(b[i]));
    // }
    // String answer = String.join("", list);
    // return answer;
    StringBuilder sb = new StringBuilder();
    char[] a = str1.toCharArray();
    char[] b = str2.toCharArray();
    for (int i = 0; i < str1.length(); i++) {
      sb.append(a[i]);
      sb.append(b[i]);
    }
    String answer = sb.toString();
    return answer;
  }
}