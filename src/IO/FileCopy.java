package IO;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis= new FileInputStream("./송중기.png");
			fos = new FileOutputStream("./송중기2.png");
			
			int data=-1;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			//자원정리
			try {
				if(fis !=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
