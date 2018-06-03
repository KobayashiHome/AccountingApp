package com.example.linfa.accountingapp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author skylinelin
 * @date 2018/5/24
 * 编写日期工具类
 */

public class DateUtil {

    /**
     * 转换方法
     * 将 Unix time —转化成—> HH:mm
     */
    public static String getFormattedTime(long timeStamp){

        //格式化时间方法 yyyy-MM-dd HH:mm:ss 分钟mm不要大写

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        return format.format(new Date(timeStamp));
    }
    /**
     * 得到今天时间
     * 例如：2018-5-24
     */
    public static String getFormattedDate(){

        SimpleDateFormat formatt = new SimpleDateFormat("yyyy-MM-dd");
        return formatt.format(new Date());
    }
}
