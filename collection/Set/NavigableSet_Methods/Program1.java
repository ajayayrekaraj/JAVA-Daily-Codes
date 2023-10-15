import java.util.*;
class NavigableSetDemo{
	public static void main(String[]args){
		NavigableSet NS=new TreeSet();

		NS.add("Ajay");
		NS.add("Parth");
		NS.add("Rohan");
		NS.add("Govardhan");
		NS.add("Harsh");
		NS.add("NeW");

		System.out.println(NS);

//		System.out.println(NS.floor("Ajay"));

//		System.out.println(NS.ceiling("Govardhan"));

//		System.out.println(NS.pollFirst());

//		System.out.println(NS.pollLast());

//		System.out.println(NS.headSet("Govardhan"));

//		System.out.println(NS.tailSet("New"));

		System.out.println(NS.higher("Parth"));

		System.out.println(NS.tailSet("Govardhan",false));

		System.out.println(NS.headSet("Govardhan",true));


	}
}
