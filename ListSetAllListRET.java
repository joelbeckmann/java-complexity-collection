public class ListSetAllListRET {
  public ListSetAllListRET value;
  public ListSetAllListRET next;
  
  /**
   * Create a list 'list' and 'o' of length n
   * Then set the value of each list element to o
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllListRET list = createList(i);
    ListSetAllListRET o = createList(i);
    list = setAll(list, o);
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllListRET(ListSetAllListRET next, ListSetAllListRET value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllListRET createList(int length) {
    ListSetAllListRET result = null;
    while (length > 0) {
      result = new ListSetAllListRET(result, null);
      length--;
    }
    return result;
  }

  public static ListSetAllListRET setAll(ListSetAllListRET list, ListSetAllListRET o) {
    if (list != null) {
      list.value = o;
      list.next = setAll(list.next, o);
    }
    return list;
  }  
}

