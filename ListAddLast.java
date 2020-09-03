public class ListAddLast {
  public ListAddLast next;
  
  /**
   * Create a list with length n by going through the whole 
   * list and add an element at the end n times.
   */

  public static void main(String[] args) {
    int n = args.length;
    ListAddLast list = new ListAddLast();
    while(n > 0) {
      list = addLast(list);
    }
  }

  public ListAddLast() {
    this.next = null;
  }

  public static ListAddLast addLast(ListAddLast l) {
    if (l.next != null) {
      l.next = addLast(l.next);
    } else {
      ListAddLast n = new ListAddLast();
      l.next = n;
    }
    return l;
  }
}

