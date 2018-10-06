package com.answer.framework.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class SerialNoUtils {

    private static final ThreadLocal<DateFormat> DATE_FORMAT_THREAD_LOCAL = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMddHHmmssSSS");
        }
    };

    private static final ThreadLocal<DateFormat> DATE_FORMAT_THREAD_LOCALA = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyMM");
        }
    };

    public static String getSerialNo(String start){
        return start + getSerialNo();
    }

    public static String getSerialNo() {
        StringBuffer sb = new StringBuffer(DATE_FORMAT_THREAD_LOCAL.get().format(new Date()));
        int nextInt = ThreadLocalRandom.current().nextInt(1000);
        sb.append(nextInt);
        int len = sb.length();

        for (int i = len; i < 20; i++) {
            sb = sb.append("0");
        }
        return sb.toString();
    }
}
