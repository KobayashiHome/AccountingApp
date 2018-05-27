package com.example.linfa.accountingapp;

import android.util.Log;
import android.widget.Toast;

import java.util.UUID;

/**
 * @author skylinelin
 *         <p>
 *         编写数据结构
 * @date 2018/5/24
 */

public class RecordBean {
    public static String TAG = "RecordBean";

    public enum RecordType {
        RECORD_TYPE_EXPENSE, RECORD_TYPE_INCCOME;
    }

    /**
     * 消费类型
     */
    private double amount;
    /**
     * 消费类别
     */
    private RecordType type;
    /**
     * 消费类型
     */
    private String category;
    /**
     * 备注
     */
    private String remark;
    /**
     * 时间
     * 2018-5-24
     */
    private String date;
    /**
     * 时间戳
     */
    private long timeStamp;
    /**
     * UUID:通用唯一标识码，在一台机器上生成的数字，他表示在同一时空中的所有机器都是唯一的
     */
    private String uuid;

    /**
     * 构造方法
     * 当这个类被实例化后会主动运行这个构造方法
     */

    public RecordBean() {

        //生成唯一的uuid
        uuid = UUID.randomUUID().toString();
        Log.d(TAG, uuid);
        //unix系统时间
        timeStamp = System.currentTimeMillis();
        //初始化date
        Log.d(TAG,timeStamp+" "+DateUtil.getFormattedTime(timeStamp));
    }

}
