package datastructure.src.linkedlist;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.append(1);
    linkedList.append(2);
    linkedList.append(3);
    linkedList.append(4);
    linkedList.syso();
    linkedList.delete(2);
    linkedList.syso();
  }
}
