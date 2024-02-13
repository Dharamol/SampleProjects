package sampleProjects;

public class MethodPalindorme {
	int a;
	int remainder;
	int reversenum;
	public void method1(int a)
	{
	this.a=a;
	while(a!=0)
	{
		remainder=a%10;
		 reversenum = reversenum*10+remainder;
		a=a/10;
			
		}

		System.out.println();	
	}
	public void method()
	{
		if(a==reversenum)
		{
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPalindorme obj =new MethodPalindorme();
		obj.method1(232);
		obj.method();
	}

}
