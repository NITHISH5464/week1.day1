package week1.day3;

public class Calculator2 {
	public void addTwonumber(int a,int b) {
		// TODO Auto-generated method stub
int c=a+b;
System.out.println(c);
		
	}
	public void subTwonumber(int a,int b) {
		// TODO Auto-generated method stub
int c=a-b;
System.out.println(c);
		
	}
	public void mulTwonumber(int a,int b) {
		// TODO Auto-generated method stub
int c=a*b;
System.out.println(c);
		
	}
	public void divideTwonumber(int a,int b) {
		// TODO Auto-generated method stub
int c=a/b;
System.out.println(c);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator2 any=new Calculator2();
any.addTwonumber(90, 20);
any.subTwonumber(40,75);
any.mulTwonumber(999,888);
any.divideTwonumber(555, 15);	}

}
