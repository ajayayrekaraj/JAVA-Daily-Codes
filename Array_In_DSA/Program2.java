class ArrayDemo{
	public static void main(String[]args){
		int N=6;
		int count=0;

		int arr[]=new int[]{2,6,5,7,8,10};

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}

