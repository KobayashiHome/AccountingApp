package com.example.linfa.accountingapp;

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getType() {
        if(this.type == RecordType.RECORD_TYPE_EXPENSE){
            return 1;
        }else {
            return 2;
        }
    }

    public void setType(int type) {

        if (type == 1){
            this.type = RecordType.RECORD_TYPE_EXPENSE;
        }else {
            this.type = RecordType.RECORD_TYPE_INCCOME;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 构造方法
     * 当这个类被实例化后会主动运行这个构造方法
     */



    public RecordBean() {

        //生成唯一的uuid
        uuid = UUID.randomUUID().toString();
        //unix系统时间
        timeStamp = System.currentTimeMillis();
        date = DateUtil.getFormattedDate();

    }

}
