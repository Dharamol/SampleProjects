package sampleProjects;

public class Assignment1 {
	static String name;
	static int age;
	public static void method1()
	{
	 name="gal";
	 age=2;
	}
	public static void method2()
	{
		System.out.println("the name is "+ name +" and age is :"+age);
	}

	public static void main(String[] args) {
		Assignment1.method1();
		Assignment1.method2();

	}

}
