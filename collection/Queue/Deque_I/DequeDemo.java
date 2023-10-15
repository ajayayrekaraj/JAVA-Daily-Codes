import java.util.*;
class DequeDemo{
	public static void main(String[]args){

		Deque obj=new ArrayDeque();

		obj.offer(10);
		obj.offer(20);
		obj.offer(50);
		obj.offer(30);

		System.out.println(obj);
               
		//offerFirst(E);
		//offerLast(E);
		obj.offerFirst(5);
		obj.offerLast(100);

		System.out.println(obj);

		//pollFirst();
		//pollLast();

		obj.pollFirst();
		obj.pollLast();

		System.out.println(obj);

		//peekFirst();
		//peekLast();

		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());

		System.out.println(obj);

		//iterator
                   
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//descendingIterator
	
		Iterator itr1=obj.descendingIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}


