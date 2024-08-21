package fileDemo;
import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("Software Solutions");
		bw.flush();
		bw.close();
		FileReader fr= new FileReader("abc.txt");
		BufferedReader br= new BufferedReader(fr);
		String line= br.readLine();
		while(line !=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		

	}

}
