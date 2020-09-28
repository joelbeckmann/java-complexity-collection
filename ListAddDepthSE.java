public class ListAddDepthSE {
  public ListAddDepthSE next;
  public int val;
  
  /**
   * Build a list with length n
   * At each step after the recursive function call, 
   * increase every element in the built list by one
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    ListAddDepthSE list = new ListAddDepthSE();
    build(list, n);
    while(list.next != null) {
      list = list.next;
    }
  }

  public ListAddDepthSE() {
    this.next = null;
    this.val = 0;
  }
  
  public static void build(ListAddDepthSE l, int i) {
    if (i > 0) {
      ListAddDepthSE n = new ListAddDepthSE();
      l.next = n;
      build(n, i-1);
      increaseByOne(l);
    }
  }
  
  public static void increaseByOne(ListAddDepthSE l) {
    l.val += 1;
    if (l.next != null) {
      increaseByOne(l.next);
    }
  }

}

