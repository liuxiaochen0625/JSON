package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class readFile {
	//每次读取一个字节
	public void readFileByByte(String fileName){
		File file = new File(fileName);
		InputStream in = null;//定义输入流
		try{
			in = new FileInputStream(file);//文件输入流
			int tempbyte;
			while((tempbyte = in.read())!=-1){
				//每次仅读取一个字节
				System.out.write(tempbyte);
			}
		}catch(Exception e){
			
		}
		try{
			in.close();
		}catch(Exception e){
			
		}
	}
	
	//每次读取多个字节
	public void readFileByBytes(String fileName){
		File file = new File(fileName);
		InputStream in = null;
		try{
			int byteRead = 0;
			in = new FileInputStream(file);
			byte []tempByte = new byte[100];
			while((byteRead = in.read(tempByte))!=-1){
				System.out.write(tempByte,0,byteRead);
				System.out.println();
			}
		}catch(Exception e){
			
		}
		try{
			in.close();
		}catch(Exception e){
			
		}
		
	}
	
	//按字符读取文件，一次读取一个字符
	public void readFileByChar(String fileName){
		File file = new File(fileName);
		Reader reader = null;
		try{
			reader = new InputStreamReader(new FileInputStream(file));
			int tempChar;
			while((tempChar = reader.read())!=-1){
				if((char)tempChar != '\r')
					System.out.println((char)tempChar);
			}
		}catch(Exception e){
			
		}
		
		try{
			reader.close();
		}catch(Exception e){
			
		}
	}
	//按字符读取文件，每次读取多个字符
	public void readFileByChars(String fileName){
		File file = new File(fileName);
		Reader reader = null;
		try{
			char []chartemp = new char[100];
			reader = new InputStreamReader(new FileInputStream(file));
			int tempChar = 0;
			while((tempChar = reader.read(chartemp))!=-1){
				if(tempChar!=chartemp.length&&chartemp[chartemp.length-1]!='\r')
					System.out.println(chartemp);
				else{
					for(int i=0;i<tempChar;i++)
						if(chartemp[i]!='\r')//过滤掉\r
							System.out.print(chartemp[i]);
						else 
							continue;
				}
			}
		}catch(Exception e){
			
		}
		
		try{
			reader.close();
		}catch(Exception e){
			
		}
	}
	
	//按行读取文件
	public void readFileByLine(String fileName){
		File file = new File(fileName);
		BufferedReader reader = null;
		try{
			String str;
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
			while((str = reader.readLine())!=null){
				System.out.println(str);
			}
		}catch(Exception e){
			
		}
		try{
			reader.close();
		}catch(Exception e){
			
		}
	}
	
	public static void main(String []args){
		new readFile().readFileByBytes("D:\\1.txt");
	}

}
