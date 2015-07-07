package Time;
/*
 * java对时间的操作
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OperateTime {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		String s = null;

		/** 输出格式: Mon May 05 15:23:58 CST 2014 */
		System.out.println(d);

		/** 输出格式: 2014-5-5 */
		s = DateFormat.getDateInstance().format(d);
		System.out.println(s);

		/** 输出格式: 2014-5-5 */
		s = DateFormat.getDateInstance(DateFormat.DEFAULT).format(d);
		System.out.println(s);

		/** 输出格式: 2014年5月5日 星期一 */
		s = DateFormat.getDateInstance(DateFormat.FULL).format(d);
		System.out.println(s);

		/** 输出格式: 2014-5-5 */
		s = DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		System.out.println(s);

		/** 输出格式: 14-5-5 */
		s = DateFormat.getDateInstance(DateFormat.SHORT).format(d);
		System.out.println(s);

		/** 输出格式: 2014-5-05 00:00:00 大写H为24小时制 */
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		s = sdf.format(d);
		System.out.println(s);

		/** 输出格式: 2014-5-05 00:00:00 小写h为12小时制 */
		DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		s = sdf2.format(d);
		System.out.println(s);

		/** 输出格式: 20140505000000 */
		DateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
		s = sdf3.format(d);
		System.out.println(s);

		/** 字符串转换城日期格式 */
		s = sdf.format(d);
		Date today = sdf.parse(s);
		System.out.println("字符串转成日期1：" + today);
		System.out.println("字符串转成日期2：" + sdf.format(today));

		/** 单独输出年月日时分秒等 */
		Calendar c = Calendar.getInstance();
		System.out.println("年: " + c.get(Calendar.YEAR));
		// 月份从0开始，加1校正
		System.out.println("月: " + (c.get(Calendar.MONTH) + 1) + "");
		System.out.println("日: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("时: " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("分: " + c.get(Calendar.MINUTE));
		System.out.println("秒: " + c.get(Calendar.SECOND));
		System.out.println("当前时间毫秒数：" + c.getTimeInMillis());
		System.out.println("当前时间: " + c.getTime());
		
		
		//method 1 
		Calendar nowtime = new GregorianCalendar(); 
		String strDateTime="["+String.format("%04d", nowtime.get(Calendar.YEAR))+"/"+ 
		String.format("%02d", nowtime.get(Calendar.MONTH))+"/" + 
		String.format("%02d", nowtime.get(Calendar.DATE))+" " + 
		String.format("%02d", nowtime.get(Calendar.HOUR))+":" + 
		String.format("%02d", nowtime.get(Calendar.MINUTE))+":" + 
		String.format("%02d", nowtime.get(Calendar.SECOND))+"." + 
		String.format("%03d", nowtime.get(Calendar.MILLISECOND))+"]"; 
		System.out.println(strDateTime); 

		//method 2 
		String msg=""; 
		Date date = new Date(); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS"); 
		msg+="["+sdf1.format(date)+"]"; 

		System.out.println(msg); 
	}
}
