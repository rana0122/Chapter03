package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br =null;
		try {
			isr =new InputStreamReader( System.in,"utf-8");//키보드 입력받은 값을 읽어들인다.
			br = new BufferedReader(isr);
			while(true){
				System.out.print(">>");
				String input = br.readLine();
				
				if(input==null){
					break;
				}
				if("exit".equals(input)){
					break;
				}
				System.out.println(input);
				
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
