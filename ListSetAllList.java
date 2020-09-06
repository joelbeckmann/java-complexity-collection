public class ListSetAllList {
  public ListSetAllList value;
  public ListSetAllList next;
  
  /**
   * Create a list 'list' and 'o' of length n
   * Then set the value of each list element to o
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllList list = createList(i);
    ListSetAllList o = createList(i);
    list = setAll(list, o);
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllList(ListSetAllList next, ListSetAllList value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllList createList(int length) {
    ListSetAllList result = null;
    while (length > 0) {
      result = new ListSetAllList(result, null);
      length--;
    }
    return result;
  }

  public static ListSetAllList setAll(ListSetAllList list, ListSetAllList o) {
    if (list != null) {
      list.value = o;
      list.next = setAll(list.next, o);
    }
    return list;
  }  
}

