interface Maharashtra{
	String District();
}
class Collector{
	public static void main(String[]args){
		Maharashtra Maha=()->"Latur/Dharashiv/Solapur";
		System.out.println(Maha.District());
	};
}

