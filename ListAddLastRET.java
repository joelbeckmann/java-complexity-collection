public class ListAddLastRET {
  public ListAddLastRET next;
  
  /**
   * Create a list with length n by going through the whole 
   * list and add an element at the end n times.
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    ListAddLastRET list = new ListAddLastRET();
    while(n > 0) {
      list = addLast(list);
      n--;
    }
  }

  public ListAddLastRET() {
    this.next = null;
  }

  public static ListAddLastRET addLast(ListAddLastRET l) {
    if (l.next != null) {
      l.next = addLast(l.next);
    } else {
      ListAddLastRET n = new ListAddLastRET();
      l.next = n;
    }
    return l;
  }
}

