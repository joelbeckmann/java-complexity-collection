public class ValueList {
  ValueList next;
  int value;
  
  public ValueList() {
    this.next = null;
    this.value = 0;
  }
  
  public ValueList(int val) {
    this.next = null;
    this.value = val;
  }
  
  public ValueList(ValueList list, int val) {
    this.next = list;
    this.value = val;
  }
  
  public String toString() {
    String out = this.value + " ";
    if (this.next != null) {
      out += this.next.toString();
    }
    return out;
  }
  
  /**
  * returns the nth element in the list or the last
  * if there are less than n elements in the list
  */
  public ValueList getElement(int pos) {
    if (this.next != null && pos > 0) {
      return this.next.getElement(pos -1);
    }
    return this;
  }

}
