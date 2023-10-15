class demo{
	public static void main(String[]args){
		demo obj=new demo();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
//		obj.fun(true);
	}
	void fun(float X){
		System.out.println("In Fun");
		System.out.println(X);
	}
}

//Error 
