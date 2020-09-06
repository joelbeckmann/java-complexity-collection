public class ListAddLastSE {
  public ListAddLastSE next;
  
  /**
   * Create a list with length n by going through the whole 
   * list and add an element at the end n times.
   */

  public static void main(String[] args) {
    int n = args.length;
    ListAddLastSE list = new ListAddLastSE();
    while(n > 0) {
      addLast(list);
      n--;
    }
  }

  public ListAddLastSE() {
    this.next = null;
  }

  public static void addLast(ListAddLastSE l) {
    if (l.next != null) {
      addLast(l.next);
    } else {
      ListAddLastSE n = new ListAddLastSE();
      l.next = n;
    }
  }
}

