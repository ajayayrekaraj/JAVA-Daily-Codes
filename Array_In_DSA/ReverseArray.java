import java.util.*;
class Array_Reverse_Demo{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size:");
		int Size=sc.nextInt();

		System.out.println("Enter array Elements:");
		int arr[]=new int[Size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
                
		System.out.println("Original array is:");
		for(int i=0;i<arr.length;i++){
			System.out.println(+arr[i]);
		}
                
		System.out.println("Reverse Array is:");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(+arr[i]);
		}
	}
}

