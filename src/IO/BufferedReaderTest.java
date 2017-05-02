package IO;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br =null;
		try {
			isr =new InputStreamReader( new FileInputStream("./src/io/BufferedReaderTest.java"),"utf-8");
			br = new BufferedReader(isr);
			
			int lineNumber=1;
			String line = null;
			
			while((line=br.readLine())!=null){
				System.out.println(lineNumber +" "+line);
				lineNumber++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				isr.close();
				System.out.println("-----------자원정리--------------");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
