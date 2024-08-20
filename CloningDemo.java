package javaLangDemo;

class Cat
{
	int j;
	Cat(int i)
	{
		this.j=i;
	}
}
class Dog implements Cloneable
{
	Cat c;
	int i;
	Dog(Cat c, int i)
	{
		this.c=c;
		this.i=i;
	}
//	public Object Clone() throws CloneNotSupportedException
//	{
//		return super.clone();
//	}
	//deep cloning
	public Object Clone() throws CloneNotSupportedException
	{
		Cat c1= new Cat(c.j);
		Dog d2= new Dog(c1,i);
		return d2;
	}
	
}

public class CloningDemo {

	public static void main(String[] args) throws Exception{
		Cat c= new Cat(20);
		Dog d1= new Dog(c,10);
		System.out.println(d1.i+"..."+d1.c.j);
		Dog d2= (Dog)d1.Clone();
		
		d2.i=888;
		d2.c.j=999;
		System.out.println(d1.i+"....."+d1.c.j);
		System.out.println(d2.i+"....."+d2.c.j);


	}

}
