public class ListBuildCount2SE {
  public ListBuildCount2SE next;
  public int value;
  
  public ListBuildCount2SE(int i) {
    this.next = null;
    this.value = i;
  }

  public static void appN(ListBuildCount2SE l1, int n) {
    if(n > 0) {
      appN(l1, n-1);
      if(l1.next == null) {
        ListBuildCount2SE l2 = new ListBuildCount2SE(0);
        l1.next = l2;
      } else {
        ListBuildCount2SE l2 = new ListBuildCount2SE(0);
        l2.next = l1.next.next;
        l1.next = l2;
      }
    }
  }

  public static void main(String[] args) {
    ListBuildCount2SE l = new ListBuildCount2SE(0);
    appN(l, args.length);
    int i = args.length;
    while(i > 0) {
      ListBuildCount2SE l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i - 1;
    }
  }
}


