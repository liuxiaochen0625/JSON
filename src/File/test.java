package File;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class test {
	public static void appendFile(String file,Object content){
		BufferedWriter out = null;
		try{
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
			out.write(content.toString().replaceAll("\n", "\r\n"));
//			out.write("\r\n");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]){
		String str = new String("12345\n12345677\n");
		String str1 = new String("12345\n12345677\n");
		appendFile("D:\\1.txt", str);
		appendFile("D:\\1.txt", str1);
	}

}
