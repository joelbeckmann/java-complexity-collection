public class ListSetAllSelf {
  public ListSetAllSelf value;
  public ListSetAllSelf next;
  
  /**
   * Create a list 'list' of length n
   * Then set the value of each list element to list
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllSelf list = createList(i);
    list = setAll(list, list);
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllSelf(ListSetAllSelf next, ListSetAllSelf value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllSelf createList(int length) {
    ListSetAllSelf result = null;
    while (length > 0) {
      result = new ListSetAllSelf(result, null);
      length--;
    }
    return result;
  }

  public static ListSetAllSelf setAll(ListSetAllSelf list, ListSetAllSelf o) {
    if (list != null) {
      list.value = o;
      list.next = setAll(list.next, o);
    }
    return list;
  }   
}

