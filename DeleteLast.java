public class DeleteLast {
  public DeleteLast next;
  
  /**
   * Build a list with length n
   * Then delete every element one by one from end to start
   */

  public static void main(String[] args) {
    int n = args.length;
    DeleteLast list = build(n);
    deleteLast(list);
    while(list.next != null) {
      list = list.next;
    }
  }

  public DeleteLast() {
    this.next = null;
  }

  public static DeleteLast deleteLast(DeleteLast l) {
    if (l.next != null) {
      l.next = deleteLast(l.next);
    }
    return null;
  }
  
  public static DeleteLast build(int length) {
    DeleteLast l = new DeleteLast();
    if (length > 0) {
      l.next = build(length - 1);
    }
    return l;
  }
}

