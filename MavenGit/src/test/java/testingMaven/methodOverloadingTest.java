package testingMaven;

public class methodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(socre(100 ,200));
		System.out.println(socre(100,200,300));
		System.out.println(socre(100,200,300,400));
		
		

	}
	
	public static int socre(int name, int number) {
		//System.out.println(name+number);
		return name+number;
	}
	
	public static int socre( int a, int b,int c) {
	return a+socre(b,c);
	}
	
	public static int socre( int a, int b,int c,int d) {
		return a+socre(b,c,d);
		}

}
