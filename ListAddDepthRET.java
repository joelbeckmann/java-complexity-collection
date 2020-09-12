public class ListAddDepthRET {
  public ListAddDepthRET next;
  public int val;
  
  /**
   * Build a list with length n
   * At each step after the recursive function call, 
   * increase every element in the built list by one
   */

  public static void main(String[] args) {
    int n = args.length;
    ListAddDepthRET list = build(n);
    while(list.next != null) {
      list = list.next;
    }
  }

  public ListAddDepthRET() {
    this.next = null;
    this.val = 0;
  }
  
  public static ListAddDepthRET build(int i) {
    if (i > 0) {
      ListAddDepthRET l = new ListAddDepthRET();
      l.next = build(i-1);
      l = increaseByOne(l);
      return l;
    }
    return null;
  }
  
  public static ListAddDepthRET increaseByOne(ListAddDepthRET l) {
    l.val += 1;
    if (l.next != null) {
      l.next = increaseByOne(l.next);
    }
    return l;
  }

}

