interface Maharashtra{
	String District();
}
class Mantri{
	public static void main(String[]args){
		Maharashtra Maha=()->{
			return "Latur/Dharashiv/Beed/Pune";
		};
		System.out.println(Maha.District());
	}
}

