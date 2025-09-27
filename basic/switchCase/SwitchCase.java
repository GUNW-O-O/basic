package switchCase;
import java.util.Scanner;

// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 
// 변환해서 출력하는 코드를 작성해 보세요.
public class SwitchCase {
  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   String str = sc.next();
  //   List<Character> list = new ArrayList<>();
  //   for (char c : str.toCharArray()) {
  //     if(Character.isUpperCase(c)) {
  //       list.add(Character.toLowerCase(c));
  //     } else {
  //       list.add(Character.toUpperCase(c));
  //     }
  //   }
  //   for (Character s : list) {
  //     System.out.print(s);
  //   }

  //   sc.close();
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for (char c : str.toCharArray()) {
      if(Character.isUpperCase(c)) {
        System.out.print(Character.toLowerCase(c));
      } else {
        System.out.print(Character.toUpperCase(c));
      }
    }

    sc.close();
  }
}