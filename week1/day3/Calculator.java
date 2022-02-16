package week1.day3;

public class Calculator{
	public int d=30;
	public int u ;
	
int a=15;
int b=25;
int c=a+b;

	
	public void addTwonumber() {
		// TODO Auto-generated method stub

		int a=15;
		int b=25;
		int c=a+b;
		
				System.out.println(c);
		}
	public void subTwonumber() {
		// TODO Auto-generated method stub
		
		int a=15;
		int b=20;
		int c=d-a; 
		System.out.println(c);

	}
	public void mulTwonumber() {
		// TODO Auto-generated method stub
int a=15;
int b=25;
 int c=u*a;
System.out.println(c);

	}
	public void divideTwonumber(int a,int b) {
		// TODO Auto-generated method stub
//int a=15;
//int b=30;
 int c=b/a;
System.out.println(c);

	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.addTwonumber();
		calc.subTwonumber();
		calc.mulTwonumber();		
calc.divideTwonumber(15,30);
	}
	
}
