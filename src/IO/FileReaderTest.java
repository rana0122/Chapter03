package IO;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./FileNew.txt");
			int data =-1;
			int count=0;
			while((data = fr.read())!=-1){
				System.out.print((char)data);
				count++;
			}
			System.out.println("");
			System.out.println("read count :"+count);
			FileInputStream fis = new FileInputStream("./FileNew.txt");
			data=-1;
			count=0;
			while((data= fis.read())!=-1){
				System.out.println((char)data);
				count++;
			}
			System.out.println("read count :"+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
