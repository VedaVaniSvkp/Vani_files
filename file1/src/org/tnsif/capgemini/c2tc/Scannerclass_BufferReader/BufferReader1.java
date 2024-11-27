package org.tnsif.capgemini.c2tc.Scannerclass_BufferReader;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\vani\\C# programs.txt"));
		String data="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();

	}

}
