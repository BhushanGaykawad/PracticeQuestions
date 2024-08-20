package javaLangDemo;

import java.lang.reflect.Method;

public class Test {
	int i;
	Test (int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}

	public static void main(String[] args) throws Exception
	{ 
//		int count=0;
//		Object o= new String("ANC");
//		Class c= o.getClass();
//		System.out.println(c.getName());
//		Method [] m =c.getDeclaredMethods();
//		for(Method m1:m)
//		{
//			count++;
//			System.out.println(m1);
//		}
//		System.out.println(count);
		
		String s1= new String("durga");
		String s2= s1.toUpperCase();
		String s3= s1.toLowerCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
	}

}
