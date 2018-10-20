public class ArrayStack implements Stack {
	
	protected Object [] arr;
	protected int top ;
	protected int n = 0; 
	public ArrayStack(){
		top = -1;
		arr = new Object [1000000];
	}
	
	public void push(Object item){
		if(n == arr.length){
			resizeArrayStack();
		}
		arr[++top] = item;
		
		n++;
	}
	public Object pop(){
		if(!empty()){
			throw new IllegalArgumentException("empty");
		}
		n--;
		return arr[top--];

	}
	public Object peek(){
	
		if(empty()){
			throw new IllegalArgumentException("empty");
		
		}
		
		return arr[top];
	}
	
	private void resizeArrayStack(){
		Object[] newArr = new Object[n*2];
		for(int i=0; i<n*2;i++){
			newArr[i] = arr[i];
		}
		arr = newArr;
		
	}
	
	public boolean empty(){
		return true;
	}

}
