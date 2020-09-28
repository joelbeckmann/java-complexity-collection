public class BuildIntListSE {
  public BuildIntListSE next;
  public int value;
  
  /**
   * @author David Keller
   */
  
  public BuildIntListSE(int i) {
    this.next = null;
    this.value = i;
  }

  public static BuildIntListSE build(int n) {
    if(n <= 0) {
      return null;
    } else {
      BuildIntListSE l = new BuildIntListSE(n);
      l.next = build(n-1);
      return l;
    }
  }

  public static void helper(BuildIntListSE l, int i) {
    l = build(i);
  }

  public static void main(String[] args) {
    BuildIntListSE l = null;
    helper(l, args.length);
    int i = args.length;
    while(i > 0) {
      BuildIntListSE l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i-1;
    }
  }
}

