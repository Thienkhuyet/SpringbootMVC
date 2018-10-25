package com.cmc.mvc.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
	/**
	 * @description: Encrypt Password
	 * @create_date: Oct 22, 2018
	 * @author: THNam2@cmc.com.vn
	 * @modify_date: Oct 22, 2018
	 * @modifier: Tran Huy Nam
	 * @param input
	 * @return
	 */
	public static String encryptPassword(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] messageDigest = md.digest(input.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < messageDigest.length; i++) {
				sb.append(Integer.toString((messageDigest[i] & 0xff) + 0x100, 16).substring(1));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
}
