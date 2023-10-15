import java.util.*;
class HashMapDemo_1{
	public static void main(String[]args){

		HashSet hs=new HashSet();

		hs.add("Parth");
		hs.add("Ajay");
		hs.add("Pratik");
		hs.add("Pranav");
		hs.add("Rohit");
		hs.add("Harsh");

		System.out.println(hs);

		HashMap hm=new HashMap();

		hm.put("Harsh","BitWise");
		hm.put("Rohit","Infosys");
		hm.put("Ajay","PTC");
		hm.put("Parth","Wipro");
		hm.put("Pranav","HCL");

		System.out.println(hm);
	}
}
