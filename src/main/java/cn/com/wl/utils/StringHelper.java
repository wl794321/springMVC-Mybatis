package cn.com.wl.utils;

import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串处理工具类
 * 
 * @author Auger
 * @version 1.0
 */
public class StringHelper {

	/**
	 * 
	 * 将一个字符串进行 MD5 加密<BR/>
	 * 方法名：MD5<BR/>
	 * 创建人：auger <BR/>
	 * 
	 * @param securityStr
	 * @return String<BR/>
	 * @exception <BR/>
	 * @since 1.0.0
	 */
	public static String MD5(String securityStr) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = securityStr.getBytes();
			// 获得MD5摘要算法 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str).toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	 * 获取当前格式化时间（yyyy-MM-dd hh:mm:ss�?<BR/>
	 * 方法名：getCurrentFormatDate<BR/>
	 * 创建人：auger <BR/>
	 * 
	 * @return String<BR/>
	 * @exception <BR/>
	 * @since 1.0.0
	 */
	public static String getCurrentFormatDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String datetime = sdf.format(date);
		return datetime;
	}

	/**
	 * 
	 * 获取当前时间�?<BR/>
	 * 方法名：getCurrentTimeStamp<BR/>
	 * 创建人：auger <BR/>
	 * 
	 * @return long<BR/>
	 * @exception <BR/>
	 * @since 1.0.0
	 */
	public static long getCurrentTimeStamp() {
		return System.currentTimeMillis();
	}

	/**
	 * 
	 * 将时间戳转换成时间格式为 yyy-MM-dd hh:mm:ss 的时�?<BR/>
	 * 方法名：getDateByTimeStamp<BR/>
	 * 创建人：auger <BR/>
	 * 
	 * @param timestamp
	 * @return String<BR/>
	 * @exception <BR/>
	 * @since 1.0.0
	 */
	public static String getDateByTimeStamp(long timestamp) {
		if (timestamp != 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String date = sdf.format(new Date(timestamp));
			System.out.println(date);
			return date;
		} else {
			return "";
		}
	}

	/**
	 * 
	 * 将时间戳转换成时间格式为 yyy-MM-dd hh:mm:ss或�?�yyy-MM-dd 的时�?<BR/>
	 * 方法名：getDateByTimeStamp<BR/>
	 * 创建人：auger <BR/>
	 * 
	 * @param timestamp
	 * @param format
	 * @return String<BR/>
	 * @exception <BR/>
	 * @since 1.0.0
	 */
	public static String getDateByTimeStamp(long timestamp, String format) {
		if (timestamp != 0) {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			String date = sdf.format(new Date(timestamp));
			return date;
		} else {
			return "";
		}
	}

	/**
	 * 
	 * 将时间字符串转换成时间戳<BR/>
	 * 方法名：getTime<BR/>
	 * 创建人：auger <BR/>
	 * 
	 * @param user_time
	 * @return String<BR/>
	 * @throws ParseException
	 * @exception <BR/>
	 * @since 1.0.0
	 */
	public static Long getTime(String user_time) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date;
		try {
			date = simpleDateFormat.parse(user_time);
			Long timeStemp = date.getTime();
			return timeStemp;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0L;
	}
}
