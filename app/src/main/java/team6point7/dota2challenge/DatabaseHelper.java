package team6point7.dota2challenge;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DB.db";
    public static final String TABLE_NAME1 = "user";
    public static final String TABLE_NAME2 = "hero";
    public static final String COL_1 = "ID1";
    public static final String COL_2 = "NAME1";
    public static final String COL_3 = "ID2";
    public static final String COL_4 = "NAME2";

    public  DatabaseHelper(Context context){super(context, DATABASE_NAME,null,1);}

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table " + TABLE_NAME1 + "(ID1 INTEGER PRIMARY KEY AUTOINCREMENT, NAME1 TEXT, MARKS INTEGER)");
        db.execSQL("create table " + TABLE_NAME2 + "(ID2 INTEGER PRIMARY KEY AUTOINCREMENT, NAME2 TEXT, MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(db);
    }

    public boolean insertData1(String Name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, Name);
        long result = db.insert(TABLE_NAME1, null, contentValues);
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }

    public boolean insertData2(String Name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_4, Name);
        long result = db.insert(TABLE_NAME2, null, contentValues);
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }

    public boolean updateData1(String id, String nama){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,nama);
        long result = db.update(TABLE_NAME1, contentValues, "ID1 = ?",new String[] { id });
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }

    public boolean updateData2(String id, String Name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_3,id);
        contentValues.put(COL_4,Name);
        long result = db.update(TABLE_NAME2, contentValues, "ID2 = ?",new String[] { id });
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }

    public Integer deleteData1 (String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME1,"ID1 = ?",new String[] {id});
    }

    public Integer deleteData2 (String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME2,"ID2 = ?",new String[] {id});
    }

    public Cursor getDataKoin(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME1, null);
        return res;
    }

    public Cursor getDataDosen(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME2, null);
        return res;
    }
}
