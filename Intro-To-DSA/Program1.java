import java.util.*;
class ADD{
static int alladd(int num){
	int Sum=0;

	for(int i=1;i<=num;i++){
		Sum=Sum+i;
	}
	return Sum;
}
 public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
         
	 System.out.println("Enter Number");
	 int num=sc.nextInt();

	 int ret=alladd(num);

	 System.out.println(ret);
 }
}

