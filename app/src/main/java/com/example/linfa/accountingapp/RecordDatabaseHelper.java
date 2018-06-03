package com.example.linfa.accountingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.LinkedList;

/**
 * @date 2018/6/3
 * @author skylinelin
 */

public class RecordDatabaseHelper extends SQLiteOpenHelper {
    /**
     * 尿性使然，先写TAG
     */
    private static String TAG = "RecordDatabaseHelper";
    /**
     * 创建数据库名称
     */
    public static final String DB_NAME = "Record";
    /**
     * SQL语句
     */
    private static final String CREATE_RECORD_DB = "create table Record ("
            +"id integer primary key autoincrement,"
            +"uuid text,"
            +"type integer,"
            +"category text,"
            +"remark text,"
            +"time integer,"
            +"date date)";

    /**
     * 构造方法
     * 我们可以看到传入四个参数：上下文、数据库名称、第三个我们直接填入null即可、最后一个是数据库版本号
     */
    public RecordDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_RECORD_DB);

    }

    /**
     *升级数据库用
     * oldVersion：旧的版本号
     * newVersion：新的版本号
     * 升级数据库推荐使用switch语句
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    /**
     * 添加
     */
    public void addRecord(RecordBean bean){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("uuid",bean.getUuid());
        values.put("type",bean.getType());
        values.put("remark",bean.getRemark());
        values.put("amount",bean.getAmount());
        values.put("date",bean.getDate());
        values.put("time",bean.getTimeStamp());

        db.insert(DB_NAME,null,values);
    }

    /**
     * 删除
     */
    public void removeRecord(String uuid){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DB_NAME,"uuid = ?",new String[]{uuid});
    }
    /**
     * 编辑一笔账目
     */
    public void editRecord(String uuid,RecordBean bean){
        //将相应uuid相应的数据删除，然后替换一个新的相同的uuid
        removeRecord(uuid);
        bean.setUuid(uuid);
        addRecord(bean);
    }
    /**
     * 查询
     */
    public LinkedList<RecordBean> readRecords(String dateStr){
        SQLiteDatabase db = this.getWritableDatabase();

        return null;
    }
}
