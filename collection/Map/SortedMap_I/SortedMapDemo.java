import java.util.*;
class SortedMapDemo{
	public static void main(String[]args){

		SortedMap sm=new TreeMap();

		sm.put("IND","India");
		sm.put("PAK","Pakistan");
		sm.put("AUS","Australia");
		sm.put("NZ","NewZealand");
		sm.put("BAN","Bangladesh");
		sm.put("SL","SriLanka");
		sm.put("CHIN","China");
		sm.put("RSA","South Africa");
		sm.put("WI","WestIndies");
		sm.put("ENG","England");

		System.out.println(sm);

		//subMap();
		System.out.println("subMap:" + sm.subMap("AUS","PAk"));

		//headMap();
		System.out.println("headMap:" + sm.headMap("PAK"));

		//tailMap();
		System.out.println("tailMAp:" + sm.tailMap("PAK"));

		//firstKey();
		System.out.println("firstKey:" + sm.firstKey());

		//lastKey();
		System.out.println("lastKey:" + sm.lastKey());

		//KeySet();
		System.out.println("KeySet:" + sm.keySet());

		//values();
		System.out.println("values:" + sm.values());

		//entrySet();
		System.out.println("entrySet:" + sm.entrySet());


	}
}
