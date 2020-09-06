public class ListSetAllListSE {
  public ListSetAllListSE value;
  public ListSetAllListSE next;
  
  /**
   * Create a list 'list' and 'o' of length n
   * Then set the value of each list element to o
   */

  public static void main(String[] args) {
    int i = args.length;
    ListSetAllListSE list = createList(i);
    ListSetAllListSE o = createList(i);
    setAll(list, o);
    while (list.next != null) {
      list = list.next;
    }
  }

  public ListSetAllListSE(ListSetAllListSE next, ListSetAllListSE value) {
    this.next = next;
    this.value = value;
  }

  public static ListSetAllListSE createList(int length) {
    ListSetAllListSE result = null;
    while (length > 0) {
      result = new ListSetAllListSE(result, null);
      length--;
    }
    return result;
  }

  public static void setAll(ListSetAllListSE list, ListSetAllListSE o) {
    if (list != null) {
      list.value = o;
      setAll(list.next, o);
    }
  }  
}

