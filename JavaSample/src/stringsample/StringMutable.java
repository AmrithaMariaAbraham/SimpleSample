package stringsample;
public class StringMutable
{
	public static void main(String[] args)
	{
		StringBuffer obj=new StringBuffer("Mutable");
		System.out.println(obj);
		obj.insert(0,"String is ");
		System.out.println(obj);
		obj.replace(0,2,"Replace");
		System.out.println(obj);
		obj.delete(0, 10);
		System.out.println(obj);
		obj.reverse();
		System.out.println(obj);
	}
}
