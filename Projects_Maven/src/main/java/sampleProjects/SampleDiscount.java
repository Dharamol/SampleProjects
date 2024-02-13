package sampleProjects;

public class SampleDiscount {
static float amount;
	public static void method(float rice,float soap, float pen) {
		amount=rice+soap+pen;
		if(amount>=5000)
		{
			System.out.println("eligible for discount");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	public static void method1()

	{
		System.out.println("total amount without discount:"+amount);	

		if(amount>5000) {
			double result=amount-(amount*20)/100;
			System.out.println("with discount:"+result);
			}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleDiscount.method(2000,1000,4100);
		SampleDiscount.method1();

	}

}
