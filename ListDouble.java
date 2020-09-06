public class ListDouble {
  public int value;
  public ListDouble next;

  public static void main(String[] args) {
    int i = args.length;
    ListDouble list = ListDouble.build(i);
    list = doubleValues(list);

    int sum = 0;
    while(list != null) {
      sum += list.value;
      list = list.next;
    }
  }

  public ListDouble() {
    this.next = null;
    this.value = 1;
  }

  public static ListDouble build(int length) {
    if (length > 0) {
      ListDouble l = new ListDouble();
      l.value = length;
      l.next = build(length - 1);
      return l;
    }
    return null;
  }

  public static ListDouble doubleValues(ListDouble l) {
    if (l.next != null) {
      l.next = doubleValues(l.next);
    }
    l.value = l.value * 2;
    return l;
  }

}

