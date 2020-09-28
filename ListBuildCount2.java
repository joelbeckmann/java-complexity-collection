public class ListBuildCount2 {
  public ListBuildCount2 next;
  public int value;
  
  /**
   * @author David Keller
   */
  
  public ListBuildCount2(int i) {
    this.next = null;
    this.value = i;
  }

  public static ListBuildCount2 appN(int n) {
    if(n > 0) {
      ListBuildCount2 l1 = new ListBuildCount2(0);
      l1.next = appN(n-1);
      if(l1.next == null) {
        ListBuildCount2 l2 = new ListBuildCount2(0);
        l1.next = l2;
      } else {
        ListBuildCount2 l2 = new ListBuildCount2(0);
        l2.next = l1.next.next;
        l1.next = l2;
      }
      return l1;
    }
    return null;
  }

  public static void main(String[] args) {
    ListBuildCount2 l = appN(args.length);
    int i = args.length;
    while(i > 0) {
      ListBuildCount2 l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i - 1;
    }
  }
}


