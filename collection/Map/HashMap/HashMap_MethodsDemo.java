import java.util.*;
class HashMapMethodsDemo{
	public static void main(String[]args){
		
		HashMap hm=new HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");
		hm.put("CPP",".cpp");
		hm.put("Javascript",".js");

		System.out.println(hm);
               
		//get();
		System.out.println(hm.get("CPP"));

		//keySet();
		System.out.println(hm.keySet());

		//values();
		System.out.println(hm.values());

		//entrySet();
		System.out.println(hm.entrySet());

		//remove();
		System.out.println(hm.remove("CPP"));

		System.out.println(hm);


	}
}

