package fileDemo;
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw= new FileWriter("abc.txt");
		PrintWriter out= new PrintWriter(fw);
		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("ABC");
		out.flush();
		out.close();
		
		
	}

}
