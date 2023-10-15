import java.util.*;
class Diff{
	static int diff(int num1,int num2){
		int alldiff=(num2-num1)+1;
		return alldiff;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter num1,num2:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		int Ans=diff(num1,num2);

		System.out.println("Difference between two numbers is"+ ":" +Ans);
	}
}

