package stringsample;
public class StringSample
{
	public static void main(String[] args) 
	{
		char a[]= {'h','e','l','l','o'};
		String s="Welcome";//Literal String
		System.out.println(s);
		String obj=new String("Java");//New Keyword String
		System.out.println(obj);
		String obj1=new String(a);//Convertion of array to String
	    System.out.println(obj1);	    
	}
}
