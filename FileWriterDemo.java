package fileDemo;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
//	FileWriter fw = new FileWriter("abc.txt",true);
//	fw.write(100);
//	fw.write("   \nsoftwaresolutions");
//	fw.write('\n');
//	char[] ch1= {'a','b','c'};
//	fw.write(ch1);
//	fw.write('\n');
//	fw.flush();
//	fw.close();
	File f= new File("abc.txt");
	FileReader fr= new FileReader(f);
	char[] ch= new char[(int)f.length()];
	fr.read(ch);
	for(char ch1:ch)
	{
		System.out.print(ch1);
	}
	
	System.out.println("*********************");

	FileReader fr1= new FileReader("abc.txt");
	int i=fr1.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=fr1.read();
	}

	}

}
