public class ListDoubleSE {
  public int value;
  public ListDoubleSE next;

  public static void main(String[] args) {
    int i = args.length;
    ListDoubleSE list = ListDoubleSE.build(i);
    doubleValues(list);

    int sum = 0;
    while(list != null) {
      sum += list.value;
      list = list.next;
    }
  }

  public ListDoubleSE() {
    this.next = null;
    this.value = 1;
  }

  public static ListDoubleSE build(int length) {
    if (length > 0) {
      ListDoubleSE l = new ListDoubleSE();
      l.value = length;
      l.next = build(length - 1);
      return l;
    }
    return null;
  }

  public static void doubleValues(ListDoubleSE l) {
    if (l.next != null) {
      doubleValues(l.next);
    }
    l.value = l.value * 2;
  }

}

