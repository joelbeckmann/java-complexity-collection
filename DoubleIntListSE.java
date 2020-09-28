public class DoubleIntListSE {
  public DoubleIntListSE next;
  public int value;
  
  /**
   * @author David Keller
   */
  
  public DoubleIntListSE(int i) {
    this.next = null;
    this.value = i;
  }

  public static DoubleIntListSE build(int n) {
    if(n <= 0) {
      return null;
    } else {
      DoubleIntListSE l = new DoubleIntListSE(0);
      l.next = build(n-1);
      return l;
    }
  }

  public void doubleItems() {
    DoubleIntListSE oldNext = this.next;
    DoubleIntListSE duplicate = new DoubleIntListSE(this.value);
    this.next = duplicate;
    duplicate.next = oldNext;
    
    if(oldNext != null) {
      oldNext.doubleItems();
    }
  }

  public static void main(String[] args) {
    DoubleIntListSE l = build(args.length);
    l.doubleItems();
    int i = args.length;
    while(i > 0) {
      DoubleIntListSE l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i - 1;
    }
  }
}

