
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class test {
	private static List<Boolean> l = new ArrayList<Boolean>();
	public static void main(String []args){
		//固定格式输出
		System.out.println(String.format("%03d", 3));// 结果为003，如果数字小于三位则前面用0填充，否则原样输出
		System.out.println(((Integer)0x10031).intValue()); //输出十六进制的十进制整数
		@SuppressWarnings("static-access")
		UUID uuid = UUID.randomUUID().randomUUID();
		System.out.println(uuid.toString().replaceAll("-", ""));
		String string = "Hello World!";
		for(int i=0;i<string.length();i++){
			System.out.write(string.charAt(i));
			//System.out.println(string.charAt(i));
		}
		System.out.flush();
		System.out.println(String.format("%03d", 999));
		List<Map<String, Boolean>> list = new ArrayList<Map<String,Boolean>>();
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("lxq", false);
		list.add(map);
		System.out.println(list.size()+":"+list.get(0).get("lxq"));
		list.get(0).put("lxq", true);
		System.out.println(list.size()+":"+list.get(0).get("lxq"));
		String string2 = "eb995";
		System.out.println(Integer.parseInt(string2.substring(2)));
		for(int i=0;i<10;i++)
			l.add(false);
		l.set(1, true);
		for(int i=0;i<10;i++)
			System.out.println(l.get(i));
		
		
		// 定义一些变量，用来格式化输出。
		double d = 345.678;
		String s = "你好！";
		int i = 1234;
		// "%"表示进行格式化输出，"%"之后的内容为格式的定义。
		System.out.printf("%f", d);// "f"表示格式化输出浮点数。
		System.out.println();
		System.out.printf("%9.2f", d);// "9.2"中的9表示输出的长度，2表示小数点后的位数。
		System.out.println();
		System.out.printf("%+9.2f", d);// "+"表示输出的数带正负号。
		System.out.println();
		System.out.printf("%-9.4f", d);// "-"表示输出的数左对齐（默认为右对齐）。
		System.out.println();
		System.out.printf("%+-9.3f", d);// "+-"表示输出的数带正负号且左对齐。
		System.out.println();
		System.out.printf("%d", i);// "d"表示输出十进制整数。
		System.out.println();
		System.out.printf("%o", i);// "o"表示输出八进制整数。
		System.out.println();
		System.out.printf("%x", i);// "d"表示输出十六进制整数。
		System.out.println();
		System.out.printf("%#x", i);// "d"表示输出带有十六进制标志的整数。
		System.out.println();
		System.out.printf("%s", s);// "d"表示输出字符串。
		System.out.println();
		System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s", d, i, s);
		// 可以输出多个变量，注意顺序。
		System.out.println();
		System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x", i, s);
		// "X$"表示第几个变量。
		
		System.out.println();
		
		//交換A和B的值
		int A = 1,B = 2;
		A = A^B;
		B = B^A;
		A = A^B;
		System.out.println(A+":"+B);

		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		
		System.out.println(System.getProperty("user.dir"));
		String str = "Hello";
		System.out.println(str.indexOf("a"));
		
	}

}
