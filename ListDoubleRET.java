public class ListDoubleRET {
  public int value;
  public ListDoubleRET next;

  public static void main(String[] args) {
    int i = args.length;
    ListDoubleRET list = ListDoubleRET.build(i);
    list = doubleValues(list);

    int sum = 0;
    while(list != null) {
      sum += list.value;
      list = list.next;
    }
  }

  public ListDoubleRET() {
    this.next = null;
    this.value = 1;
  }

  public static ListDoubleRET build(int length) {
    if (length > 0) {
      ListDoubleRET l = new ListDoubleRET();
      l.value = length;
      l.next = build(length - 1);
      return l;
    }
    return null;
  }

  public static ListDoubleRET doubleValues(ListDoubleRET l) {
    if (l.next != null) {
      l.next = doubleValues(l.next);
    }
    l.value = l.value * 2;
    return l;
  }

}

