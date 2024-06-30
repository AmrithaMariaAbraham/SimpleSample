package acessmodifiers;
public class Modifiers 
{
	public void display1()
	{
		System.out.println("Public Method");
	}
	private void display2()
	{
		System.out.println("Private Method");
	}
	protected void display3()
	{
		System.out.println("Protected Method");
	}
	void display()
	{
		System.out.println("Default Method");
	}
	public static void main(String[] args) 
	{
		Modifiers obj=new Modifiers();
	    obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}
