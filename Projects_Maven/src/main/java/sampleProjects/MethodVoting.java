package sampleProjects;

public class MethodVoting {
	static int number =19;
	public static boolean method()
	{
		
		if(number<=18)
		{
			return false;
		}
		else
		{
		return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MethodVoting.method());
	}

}

