
import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args){
		InputStreamReader isr =null;
		
		try {
			isr= new InputStreamReader(new FileInputStream("./ms949.txt"),"ms949");
			
			int data=-1;
			while((data=isr.read())!=-1){
				System.out.print((char)data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				isr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		

	}

}
