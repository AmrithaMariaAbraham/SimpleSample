package student;
public class Address 
{
	String address;
	Student stud;//Parent class and reference variable
	public Address(String address,Student stud)
	{	
		this.stud=stud;
		this.address=address;
	}
		public void display()
	{
		System.out.println(stud.name);
		System.out.println(stud.rollnum);
		System.out.println("Address:"+address);
	}
	public static void main(String[] args)
	{
		Student obj=new Student("Amritha",8);
		Address obj1=new Address("India", obj);
		obj1.display();
	}
}
