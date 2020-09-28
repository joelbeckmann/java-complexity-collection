public class CopyIntListCount {
  public CopyIntListCount next;
  public int value;
  
   /**
   * @author David Keller
   */
  
  public CopyIntListCount(int i) {
    this.next = null;
    this.value = i;
  }

  public static CopyIntListCount build(int n) {
    if(n <= 0) {
      return null;
    } else {
      CopyIntListCount l = new CopyIntListCount(0);
      l.next = build(n-1);
      return l;
    }
  }

  public CopyIntListCount copy() {
    if(this.next == null) {
      return new CopyIntListCount(this.value);
    } else {
      CopyIntListCount l_new = new CopyIntListCount(this.value);
      l_new.next = this.next.copy();
      return l_new;
    }
  }

  public static void main(String[] args) {
    CopyIntListCount l = build(args.length);
    CopyIntListCount l2 = l.copy();
    while(l2.next != null) {
      l2 = l2.next;
    }
  }
}

