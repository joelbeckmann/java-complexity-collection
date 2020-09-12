class MergeSortSE { 

  /**
   * perform merge sort by rearranging the references
   */

  public static void main(String args[]) {
    Random.args = args;
    int n = args.length;
    ValueList list = new ValueList(0);
    list.next = createList(n);
    
    sort(list, 1, n); 
  }

  public static void merge(ValueList list, int l, int m, int r) { 
    ValueList list1 = list.getElement(l - 1);
    ValueList list2 = list.getElement(m);
    
    while (list2.next != null && list1 != list2 && m != r) { 
      if (list1.next.value <= list2.next.value) {
        list1 = list1.next;
      } else {
        ValueList save = list2.next;
        list2.next = list2.next.next;
        save.next = list1.next;
        list1.next = save;
        list1 = list1.next;
        r--;
      }
    } 
  } 

  public static void sort(ValueList list, int l, int r) { 
    if (l < r) { 
      int m = (l + r) / 2; 
 
      sort(list, l, m); 
      sort(list, m + 1, r); 
      
      merge(list, l, m, r); 
    } 
  } 
  
  // Creates a ValueList of length n
  public static ValueList createList(int n) {
    if (n > 0) {
      ValueList list = new ValueList(Random.random());
      list.next = createList(n-1);
      return list;
    }
    return null;
  }
} 
