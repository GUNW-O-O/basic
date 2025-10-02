package datastructure.src.linkedlist;

public class LinkedList {

  Node header;

  public static class Node {
    int data;
    Node next = null;
  }

  LinkedList() {
    header = new Node();
  }

  void append(int d) {
    Node end = new Node();
    end.data = d;
    Node n = header;
    while (n.next != null) {
      n = n.next;
    }
    n.next = end;
  }

  void delete(int d) {
    Node n = header;
    while (n.next != null) {
      if(n.next.data == d) {
        n.next = n.next.next;
      } else n = n.next;
    }
  }

  void syso() {
    Node n = header.next;
    while (n.next != null) {
      System.out.print(n.data + " - ");
      n = n.next;
    }
    System.out.println(n.data);
  }
  
}