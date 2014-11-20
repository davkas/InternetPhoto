package com.bufoon.util;

import java.security.MessageDigest;


import sun.misc.BASE64Encoder;

/**
 * ͨ�ù�����
 */
public class Util {

	/**
	 * ���ַ����MD5����
	 * 
	 * @param str
	 * @return String
	 */
	public static String md5Encryption(String str) {
		String newStr = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder base = new BASE64Encoder();
			newStr = base.encode(md5.digest(str.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newStr;
	}
	

	/**
	 * �ж��ַ��Ƿ�Ϊ��
	 * 
	 * @param str
	 *            �ַ�
	 * @return true��Ϊ�գ� false���ǿ�
	 */
	public static boolean isNull(String str) {
		if (str != null && !str.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}
}