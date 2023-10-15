import java.io.*;
class PropertiesDemo{
	public static void main(String[]args)throws IOException{

		Properties obj=new Properties();

		FileInputStream fobj=new FileInputStream("friends.properties");

		obj.load(fobj);
		
		String name=obj.getProperty("Kailash");
		System.out.println(name);


	}
}

