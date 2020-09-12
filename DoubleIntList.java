public class DoubleIntList {
  public DoubleIntList next;
  public int value;
  
  public DoubleIntList(int i) {
    this.next = null;
    this.value = i;
  }

  public static DoubleIntList build(int n) {
    if(n <= 0) {
      return null;
    } else {
      DoubleIntList l = new DoubleIntList(0);
      l.next = build(n-1);
      return l;
    }
  }

  public void doubleItems() {
    DoubleIntList oldNext = this.next;
    DoubleIntList duplicate = new DoubleIntList(this.value);
    this.next = duplicate;
    duplicate.next = oldNext;
    
    if(oldNext != null) {
      oldNext.doubleItems();
    }
  }

  public static void main(String[] args) {
    DoubleIntList l = build(args.length);
    l.doubleItems();
    int i = args.length;
    while(i > 0) {
      DoubleIntList l2 = l;
      while(l2.next != null) {
        l2 = l2.next;
      }
      i = i - 1;
    }
  }
}

