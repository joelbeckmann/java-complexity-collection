public class ListSetAllSelfRET {
  public ListSetAllSelfRET value;
  public ListSetAllSelfRET next;
  
  /**
   * Create a list 'list' of length n
   * Then set the value of each list element to list
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllSelfRET list = createList(i);
    list = setAll(list, list);
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllSelfRET(ListSetAllSelfRET next, ListSetAllSelfRET value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllSelfRET createList(int length) {
    ListSetAllSelfRET result = null;
    while (length > 0) {
      result = new ListSetAllSelfRET(result, null);
      length--;
    }
    return result;
  }

  public static ListSetAllSelfRET setAll(ListSetAllSelfRET list, ListSetAllSelfRET o) {
    if (list != null) {
      list.value = o;
      list.next = setAll(list.next, o);
    }
    return list;
  }   
}

