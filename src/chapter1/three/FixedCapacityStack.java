package chapter1.three;


public class FixedCapacityStack<Item> implements Cloneable{  // ·ºÐÍ
	private Item[] a; // stack entries
	private int N; // size
	
	@SuppressWarnings("unchecked")
	
	public FixedCapacityStack(int cap)
	{ a = (Item[]) new Object[cap]; }
	
	public boolean isEmpty() { return N == 0; }
	public boolean isFull() {return N == a.length;}
	
	public int size() { return N; }
	
	public void push(Item item)
	{ if (N == a.length) 
		resize(2*a.length);
		a[N++] = item; 
	}
	
	public Item pop()
	{ Item item =  a[--N]; 
		a[N] = null;
		if (N > 0 && N == a.length/4) resize(a.length/2);
		return item;
	}
	
//	private Item peek() {
//		if (isEmpty())
//			throw new NoSuchElementException("stack underflow");
//		return a[N-1];
//		
//	}
	
	private void resize(int max)
	{ // Move stack of size N <= max to a new array of size max.
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++)
			temp[i] = a[i];
		a = temp;
	}
	
	private FixedCapacityStack<Item> copy() throws CloneNotSupportedException{
		@SuppressWarnings("unchecked")
		FixedCapacityStack<Item> temp =  (FixedCapacityStack<Item>) super.clone();
		return temp;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		FixedCapacityStack<String> s;
		s = new FixedCapacityStack<String>(2);
		s.push("chen");
		
		FixedCapacityStack<String> s1 = s.copy();
		System.out.println(s1.pop());
	}
}
