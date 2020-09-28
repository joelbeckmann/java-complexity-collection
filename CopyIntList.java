public class CopyIntList {
  public CopyIntList next;
  public int value;
  
  /**
   * @author David Keller
   */
  
  public CopyIntList(int i) {
    this.next = null;
    this.value = i;
  }

  public static CopyIntList build(int n) {
    if(n <= 0) {
      return null;
    } else {
      CopyIntList l = new CopyIntList(0);
      l.next = build(n-1);
      return l;
    }
  }

  public CopyIntList copy() {
    if(this.next == null) {
      return new CopyIntList(this.value);
    } else {
      CopyIntList l_new = new CopyIntList(this.value);
      l_new.next = this.next.copy();
      return l_new;
    }
  }

  public static void main(String[] args) {
    CopyIntList l = build(args.length);
    CopyIntList l2 = l.copy();
    //while(l2.next != null) {
    //  l2 = l2.next;
    //}
  }
}

