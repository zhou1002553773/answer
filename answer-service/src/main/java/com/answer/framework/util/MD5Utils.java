package com.answer.framework.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    public static String encodingMd5(String text, String salt) {
        try {
            StringBuilder md5Code = new StringBuilder();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            text = text + "{" + salt + "}";
            byte[] digest = md5.digest(text.getBytes());
            for (byte b : digest) {
                md5Code = md5Code.append(byteToString(b));
            }
            return md5Code.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String byteToString(byte ss) {
        final String[] goal = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
        int temp;
        temp = ss < 0 ? ss + 256 : ss;
        return goal[temp / 16] + goal[temp % 16]; // 自己实现转化
    }
}
