public class ListSetAll {
  public Object value;
  public ListSetAll next;
  
  /**
   * Create a list of length n
   * Then set the value of each list element to one Object
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAll list = ListSetAll.createList(i);
    list = setAll(list, new Object());
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAll(ListSetAll next, Object value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAll createList(int length) {
    ListSetAll result = null;
    while (length > 0) {
      result = new ListSetAll(result, new Object());
      length--;
    }
    return result;
  }

  public static ListSetAll setAll(ListSetAll list, Object o) {
    if (list == null) {
        return null;
    }
    list.value = o;
    list.next = setAll(list.next, o);
    return list;
  }  
}

