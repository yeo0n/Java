package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("여기도 항상 수행");
		}
		System.out.println("여기도 수행");
	}

}
