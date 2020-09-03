public class ListSetAllSE {
  public Object value;
  public ListSetAllSE next;
  
  /**
   * Create a list of length n
   * Then set the value of each list element to one Object
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllSE list = ListSetAllSE.createList(i);
    setAll(list, new Object());
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllSE(ListSetAllSE next, Object value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllSE createList(int length) {
    ListSetAllSE result = null;
    while (length > 0) {
      result = new ListSetAllSE(result, new Object());
      length--;
    }
    return result;
  }

  public static void setAll(ListSetAllSE list, Object o) {
    if (list == null) {
        return;
    }
    list.value = o;
    setAll(list.next, o);
  }  
}

