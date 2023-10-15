import java.util.*;
class Add{
	static int Allsum(int num){
		int sum=(num*(num+1))/2;
		return sum;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number:");
		int num=sc.nextInt();

		int ans=Allsum(num);

		System.out.println(ans);
	}
}

