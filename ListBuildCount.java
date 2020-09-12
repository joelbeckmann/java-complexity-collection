public class ListBuildCount {
  public ListBuildCount next;
  public int value;
  
  public ListBuildCount(int i) {
    this.next = null;
    this.value = i;
  }

  public static ListBuildCount appN(int n) {
    if(n > 0) {
      ListBuildCount l = new ListBuildCount(0);
      l.next = appN(n-1);
      return l;
    }
    return null;
  }

  public static void main(String[] args) {
    ListBuildCount l = new ListBuildCount(0);
    appN(args.length);
    int i = args.length;
    while(i > 0) {
      ListBuildCount l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i - 1;
    }
  }
}
