package org.tnsif.capgemini.c2tc.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class IOExceptionDemo {

	public static void main(String[] args) throws Exception{
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\vani\\C# programs"));
			String data = " ";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
