public class ListAddDepth {
  public ListAddDepth next;
  public int val;

  public static void main(String[] args) {
    int n = args.length;
    ListAddDepth list = build(n);
    while(list.next != null) {
      list = list.next;
    }
  }

  public ListAddDepth() {
    this.next = null;
    this.val = 0;
  }
  
  public static ListAddDepth build(int i) {
    if (i > 0) {
      ListAddDepth l = new ListAddDepth();
      l.next = build(i-1);
      l = increaseByOne(l);
      return l;
    }
    return null;
  }
  
  public static ListAddDepth increaseByOne(ListAddDepth l) {
    l.val += 1;
    if (l.next != null) {
      l.next = increaseByOne(l.next);
    }
    return l;
  }

}

