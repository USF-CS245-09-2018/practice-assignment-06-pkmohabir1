public class ArrayQueue implements Queue {



	protected Object[] arr = new Object[1000000];
	protected int head = 0;
	protected int tail = 0;
	protected int n = 0;
	
	public Object dequeue(){
		if(empty()){
			throw new IllegalArgumentException("empty");
		}
		Object obj = arr[head];
		
		head = (head+1) % arr.length;
		n--;
		return obj;
	}
	
	
	public void enqueue(Object item){
		if (n == arr.length){// when number of elements is the size of array
			grow_array();
		}
		arr[tail++] = item;
		if(tail == arr.length){
			tail = 0;
		}
		n++;
	}
	
	
	public boolean empty(){
		if (head ==tail){
			return true;
		}
		return false;
	}



	
	public void grow_array(){
		Object [] newArray = new Object[n*2];
		tail = 0;
		for (int i = head; i < n*2;i++){
			newArray[i] = arr[(head+1) % arr.length];
		}
		head = 0;
		arr = newArray;
		tail = n;
		
	}

}
