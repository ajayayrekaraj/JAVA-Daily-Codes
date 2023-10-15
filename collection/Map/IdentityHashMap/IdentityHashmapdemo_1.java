import java.util.*;
class IdentityHashMap_1{
	public static void main(String[]args){

		IdentityHashMap hm=new IdentityHashMap();

		hm.put(new Integer(10),"Ajay");
		hm.put(new Integer(12),"Karan");
		hm.put(new Integer(16),"Karthi");
		hm.put(new Integer(20),"Parth");

		System.out.println(hm);
	}
}
