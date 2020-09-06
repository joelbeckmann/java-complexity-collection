public class DeleteLastSE {
  public DeleteLastSE next;
  
  /**
   * Build a list with length n
   * Then delete every element one by one from end to start
   */

  public static void main(String[] args) {
    int n = args.length;
    DeleteLastSE list = new DeleteLastSE();
    build(list, n);
    deleteLastSE(list);
    
    while(list.next != null) {
      list = list.next;
    }
  }

  public DeleteLastSE() {
    this.next = null;
  }

  public static void deleteLastSE(DeleteLastSE l) {
    if (l.next != null) {
      deleteLastSE(l.next);
    }
    l.next = null;
  }
  
  public static void build(DeleteLastSE l, int length) {
    if (length > 0) {
      DeleteLastSE n = new DeleteLastSE();
      l.next = n;
      build(n, length - 1);
    }
  }
}

