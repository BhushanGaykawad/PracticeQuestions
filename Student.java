package javaLangDemo;

public class Student {
	String name;
	int rollno;
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object o)
	{
		try {
		String name1= name;
		int rollno1 = rollno;
		Student s=(Student)o;
		String name2= s.name;
		int rollno2=s.rollno;
		if(name1.equals(name2) && rollno==rollno2)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
		catch(ClassCastException e)
		{return false;}
		catch(NullPointerException e)
		{return false;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student("Durga",101);
		Student s2= new Student("Ravi",101);
		Student s3= new Student("Durga",101);
		Student s4= s1;
		System.out.println(s1.equals(null));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
