class SelectionSortSE { 

  public static void main(String args[]) {
    Random.args = args;
    int n = args.length;
    ValueList list = createList(n);

    sort(list);
  }

  public static void sort(ValueList list) {
    if (list == null) {
      return;
    }
    ValueList smallest = list;
    ValueList preSmallest = list;
    ValueList iterator = list.next;
    ValueList preIt = list;
    while (iterator != null) {
      if (iterator.value < smallest.value) {
        preSmallest = preIt;
        smallest = iterator;
      }
      preIt = iterator;
      iterator = iterator.next;
    }
    
    if (smallest != list) {
      int valSafe = list.value;
      list.value = smallest.value;
      smallest.value = valSafe;
      preSmallest.next = smallest.next;
      smallest.next = list.next;
      list.next = smallest;
    }
    
    sort(list.next);
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
