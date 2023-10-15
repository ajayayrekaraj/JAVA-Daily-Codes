abstract class Parent{
	void Property(){
		System.out.println("Gold,Car,Home");
	}
	abstract void marry();
}
class Child extends Parent{
	void marry(){
		System.out.println("Deepika");
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.Property();
		obj.marry();
	}
}



