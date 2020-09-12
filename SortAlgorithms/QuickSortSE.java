public class QuickSortSE { 
  ValueList head; 

  public ValueList partitionLast(ValueList start, ValueList end) { 
	  if(start == end || start == null || end == null) {
		  return start; 
		}

	  ValueList pivot_prev = start; 
	  ValueList cur = start; 
	  int pivot = end.value; 
	  
	  while(start != end) { 
		  if(start.value < pivot) { 
			  pivot_prev = cur; 
			  int temp = cur.value; 
			  cur.value = start.value; 
			  start.value = temp; 
			  cur = cur.next; 
		  } 
		  start = start.next; 
	  } 
	  
	  int temp = cur.value; 
	  cur.value = pivot; 
	  end.value = temp; 

	  return pivot_prev; 
  } 

  public void sort(ValueList start, ValueList end) { 
	  if(start == end) { 
		  return;
		}
		  
	  ValueList pivot_prev = partitionLast(start, end); 
	  sort(start, pivot_prev); 
	  
	  if (pivot_prev != null && pivot_prev == start) {
		  sort(pivot_prev.next, end); 
		} else if (pivot_prev != null && pivot_prev.next != null) {
		  sort(pivot_prev.next.next, end); 
		}
  } 

  public static void main(String[] args) { 
    int n = args.length;
    Random.args = args;
	  QuickSortSE list = new QuickSortSE(); 
	  
	  list.head = createList(n);

	  ValueList end = list.head;
	  while(end.next != null) {
		  end = end.next; 
		}
		
	  list.sort(list.head , end); 
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
