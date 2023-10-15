interface Core2Web{
	String lang(int numCourse);
}
class Year2023{
	public static void main(String[]args){
		Core2Web c2w=(xyz)->"C/JAVA/Flutter" + ":" +xyz;
		System.out.println(c2w.lang(8));
	};
}
