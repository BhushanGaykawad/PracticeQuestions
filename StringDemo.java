package javaLangDemo;

public class StringDemo {

	public static void main(String[] args) {
//		String s1= new String("Hello");
//		String s2=new String("Hello");
//		System.out.println(s1==s2);
//		String s3= "Hello";
//		System.out.println(s1==s3);
//		String s4="Hello";
//		System.out.println(s3==s4);
//		String s5= "He"+"llo";
//		System.out.println(s3==s5);
//		String s6="He";
//		String s7=s6+"llo";
//		System.out.println(s3==s7);
//		final String s8="He";
//		String s9=s8+"llo";
//		System.out.println(s3==s9);
//		System.out.println(s6==s8);
		String s1= new String("durga");
		String s2= s1.intern();
		System.out.println(s1==s2);
		String s3="durga";
		System.out.println(s2==s3);


	}

}
