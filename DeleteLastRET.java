public class DeleteLastRET {
  public DeleteLastRET next;
  
  /**
   * Build a list with length n
   * Then delete every element one by one from end to start
   *
   * @author Joel Beckmann
   */

  public static void main(String[] args) {
    int n = args.length;
    DeleteLastRET list = build(n);
    list = DeleteLastRET(list);
    
    while(list.next != null) {
      list = list.next;
    }
  }

  public DeleteLastRET() {
    this.next = null;
  }

  public static DeleteLastRET DeleteLastRET(DeleteLastRET l) {
    if (l.next != null) {
      l.next = DeleteLastRET(l.next);
    }
    return null;
  }
  
  public static DeleteLastRET build(int length) {
    DeleteLastRET l = new DeleteLastRET();
    if (length > 0) {
      l.next = build(length - 1);
    }
    return l;
  }
}

