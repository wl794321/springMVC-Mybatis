package cn.com.wl.utils;

import java.security.MessageDigest;

/**
 * @author Mr.Wang
 */
public class MD5Utils {
    /**
     * 将字符串用MD5加密
     * @param str 传入的要加密的字符串
     * @return
     */
    public static String changeToMD5(String str) {
        StringBuffer sb = new StringBuffer();
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        byte[] bytes = str.getBytes();
        MessageDigest md = null;
        byte[] target = null;
        try {
            md = MessageDigest.getInstance("MD5");
            target= md.digest(bytes);
            for (byte b : target) {
                sb.append(ch[(b >> 4) & 0x0f]);
                sb.append(ch[b & 0x0f]);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
