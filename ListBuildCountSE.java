public class ListBuildCountSE {
  public ListBuildCountSE next;
  public int value;
  
  /**
   * @author David Keller
   */
  
  public ListBuildCountSE(int i) {
    this.next = null;
    this.value = i;
  }

  public static void appN(ListBuildCountSE l1, int n) {
    if(n > 0) {
      ListBuildCountSE l = new ListBuildCountSE(0);
      l1.next = l;
      appN(l, n-1);
    }
  }

  public static void main(String[] args) {
    ListBuildCountSE l = new ListBuildCountSE(0);
    appN(l, args.length);
    int i = args.length;
    while(i > 0) {
      ListBuildCountSE l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i - 1;
    }
  }
}

