public class ListSetAllSelfSE {
  public ListSetAllSelfSE value;
  public ListSetAllSelfSE next;
  
  /**
   * Create a list 'list' of length n
   * Then set the value of each list element to list
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllSelfSE list = createList(i);
    setAll(list, list);
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllSelfSE(ListSetAllSelfSE next, ListSetAllSelfSE value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllSelfSE createList(int length) {
    ListSetAllSelfSE result = null;
    while (length > 0) {
      result = new ListSetAllSelfSE(result, null);
      length--;
    }
    return result;
  }

  public static void setAll(ListSetAllSelfSE list, ListSetAllSelfSE o) {
    if (list != null) {
      list.value = o;
      setAll(list.next, o);
    }
  }  
}

