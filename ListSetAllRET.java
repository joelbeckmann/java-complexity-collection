public class ListSetAllRET {
  public Object value;
  public ListSetAllRET next;
  
  /**
   * Create a list of length n
   * Then set the value of each list element to one Object
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllRET list = createList(i);
    list = setAll(list, new Object());
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllRET(ListSetAllRET next, Object value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllRET createList(int length) {
    ListSetAllRET result = null;
    while (length > 0) {
      result = new ListSetAllRET(result, new Object());
      length--;
    }
    return result;
  }

  public static ListSetAllRET setAll(ListSetAllRET list, Object o) {
    if (list != null) {
      list.value = o;
      list.next = setAll(list.next, o);
    }
    return list;
  }  
}

