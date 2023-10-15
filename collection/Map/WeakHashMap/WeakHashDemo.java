import java.util.*;
class WeakHashDemo_1{
	String str;
	WeakHashDemo_1(String str){
		this.str=str;
	}
	public String toString(){
		return str;
	}
	public void finalize(){
		System.out.println("Notify");
	}
}
class User{
	public static void main(String[]args){

		Demo obj1=new Demo("Core2Web");
		Demo obj2=new Demo("Biencaps");
		Demo obj3=new Demo("Incubator");

		WeakHashMap hm=new WeakHashMap();

		hm.put(obj1,2016);
		hm.put(obj2,2019);
		hm.put(obj3,2023);

		obj2=null;
		System.gc();

		System.out.println(hm);
	}
}

	
