class Solution {
  public int[] solution(int start_num, int end_num) {
    int[] answer = new int[start_num - end_num + 1];
    int idx = 0;
    int num = start_num;
    for (int i = 0; i < answer.length; i++) {
      answer[idx] = num;
      idx++;
      num--;
    }
    return answer;
    // return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray()
  }
}