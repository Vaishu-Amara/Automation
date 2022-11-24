package corejava;

public class functions {
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=10+20;
		System.out.println("Sum is"+c);
	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Sub is"+c);
	}
	public int sub1(int a ,int b)
	{
		int c=a-b;
		return c;
	}
	public int add1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functions obj=new functions();
		obj.add();
		obj.sub(10, 5);
		System.out.println();
	}

}
