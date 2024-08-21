package fileDemo;
import java.io.*;
public class MergingTwoFilesData {

	public static void main(String[] args) throws IOException {
//		PrintWriter pw= new PrintWriter("File3.txt");
//		BufferedReader br=new BufferedReader(new FileReader("File1.txt"));
//		String line=br.readLine();
//		while(line!=null)
//		{
//			pw.println(line);
//			line=br.readLine();
//		}
//		br= new BufferedReader(new FileReader("File2.txt"));
//		line =br.readLine();
//		while(line!=null)
//		{
//			pw.println(line);
//			line=br.readLine();
//		}
//		pw.flush();
//		br.close();
//		pw.close();
		
		PrintWriter pw= new PrintWriter("File3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));
		String line1= br1.readLine();
		String line2= br2.readLine();
		while((line1!=null) || (line2!=null))
		{
			if(line1 !=null)
			{
				pw.println(line1);
				line1= br1.readLine();
			}
			
			
			if(line2!=null)
			{
				pw.println(line1);
				line1= br1.readLine();
			}
		}
		pw.flush();
		pw.close();
		br1.close();
		br2.close();
		
		

	}

}
