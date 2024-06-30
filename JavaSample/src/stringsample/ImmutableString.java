package stringsample;
public class ImmutableString 
{
	public static void main(String[] args)
	{
		String s=" Java ";
		String s1="Program ";
		s=s.concat(" James Gosling ");
		String s2="Java James Gosling";
		String s3="pRoGrAm";
		String s4,s5,name,name1,str,s8;
		String s6=new String("Program");
        String s7="";//Empty String
        int index1,index2,index3,index4,index5,index6,index7,index8;
		char [] cha=new char[18];
		System.out.println(s);
		char ch=s.charAt(7);//Returns character for the indexed position
		System.out.println(ch);
		System.out.println("String compaterTo()");
	    System.out.println(s.compareTo(s1));
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s.compareTo(s2));
	    System.out.println("String Contains()");
	    System.out.println(s2.contains("James"));
	    System.out.println(s2.contains("Java"));
	    System.out.println(s2.contains("james"));
	    System.out.println("String endsWith()");
	    System.out.println(s2.endsWith("a"));
	    System.out.println(s2.endsWith("Gosling"));
	    System.out.println("String equals()");
	    System.out.println(s1.equals(s2));
	    System.out.println(s.equals(s1));
	    System.out.println(s.equals(s2));
	    System.out.println("String equalsIgnore()");
	    System.out.println(s.equalsIgnoreCase(s1));
	    System.out.println(s.equalsIgnoreCase(s2));
	    System.out.println(s1.equalsIgnoreCase(s3));
	    System.out.println("String format()");
	    name="Java";
	    name1=String.format("name is %s", name);
	    System.out.println(name1);
	    System.out.println("String getBytes()");//doubt
	    byte[] bar=s1.getBytes();//Converting string in to corresponding byte values
	    for(int i=0;i<bar.length;i++)
	    	System.out.println(bar[i]);
	    s4=new String(bar);//Converting back from byte value to initial string
	    System.out.println(s4);
	    System.out.println("String getChars()");//Copies content of a string in to a specified char array
	    try
	    {
	    	s2.getChars(0,18,cha,0);
	      	System.out.println(cha);
	    }
	    catch(Exception ex)
	    {
	    	System.out.println(ex);
	    }  
	    System.out.println("String indexOf()");
	    //passing substring
	    index1=s2.indexOf("James");
	    index2=s2.indexOf(" ");
	    System.out.println(index1+" "+index2);
	    //passing substring with from index
	    index3= s2.indexOf("James",5);//returns index of substring after 5th index
	    System.out.println(index3);
	    //passing char value
	    index4=s2.indexOf('J');//returns index value of j
	    System.out.println(index4);
	    System.out.println("String intern()");
        s5=s1.intern();//Assigning value of string s1 to s5
        System.out.println("S1:"+s1);
        System.out.println("S5:"+s5);
        System.out.println("S6:"+s6);
        System.out.println(s1==s5);//true because reference variables are pointing to same instance
        System.out.println(s6==s5);//false because reference variables are pointing to different instances
        System.out.println("String isEmpty()");
        System.out.println(s1.isEmpty());
        System.out.println(s7.isEmpty());
        System.out.println("String join()");
        str=String.join("-", "Welcome","to","Java","class");
        System.out.println(str);
        System.out.println("String lastIndexOf()");//doubt
        index5=s2.lastIndexOf('n');
        index6=s2.lastIndexOf("Java");
        //index7=s2.lastIndexOf(int ch, int fromindex);
        //index8=s2.lastIndexOf(str, fromindex);
        System.out.println(index5);
        System.out.println(index6);
        System.out.println("String length()");
        System.out.println("S1 length:"+s1.length());
        System.out.println("String replace()");
        String replaceString= s2.replace('a','e');
        String replaceString1=s3.replace("pRoGrAm","Program");
        System.out.println(replaceString);
        System.out.println(replaceString1);
        System.out.println("String replaceAll()");
        String replaceStringall= s2.replaceAll("a", "e");
        System.out.println(replaceStringall);
        //difference between replace and replace all
        System.out.println("String split()");//doubt
        String[] words=s2.split("\\s");
        for(String w:words)
        System.out.println(w);
        System.out.println("string startsWith()");
        System.out.println(s1.startsWith("Pro"));
        System.out.println(s3.startsWith("Java"));
        System.out.println(s1.startsWith("J",0));
        System.out.println(s.startsWith("J",0));   
        System.out.println("String subString()");
        System.out.println(s1.substring(2));
        System.out.println(s2.substring(2,10));
        System.out.println("String toCharArray()");
        char [] ch1=s1.toCharArray();
        for(int i=0;i<ch1.length;i++)
        	System.out.println(ch1[i]);
        System.out.println("String toLowerCase()");
        String s3Lower=s3.toLowerCase();
        System.out.println(s3Lower);
        System.out.println("String toUpperCase()");
        String s3upper=s3.toUpperCase();
        System.out.println(s3upper);
        System.out.println("String trim()");
        System.out.println(s+"Welcome");
        System.out.println(s.length());
        System.out.println(s.trim()+"Welcome");//doubt-->after trimming the trailing space,length doesnot changing
        System.out.println(s.length());
        System.out.println("String valueOf()");
        int a=20;
        s8=String.valueOf(a);
        System.out.println(s8+a);
	}
}