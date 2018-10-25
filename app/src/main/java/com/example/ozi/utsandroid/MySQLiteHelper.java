package com.example.ozi.utsandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String NAMA_DB = "catalog.db";

    private static final String NAMA_TABEL = "db_car";

    private static final int VERSI_DB = 1;

    private static final String ID = "_id";
    private static final String JENISMOBIL = "jenismobil";
    private static final String NAMAMOBIL = "namamobil";
    private static final String TAHUNMOBIL = "tahunmobil";

    private static final String CREATE_TABLE =
            "CREATE TABLE "
                    +NAMA_TABEL
                    + " ("
                    + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + JENISMOBIL + " VARCHAR(255), "
                    + NAMAMOBIL + " VARCHAR(255), "
                    + TAHUNMOBIL + " VARCHAR(255), "
                    + ");";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + NAMA_TABEL;

    public MySQLiteHelper(Context context){
        super(context, NAMA_DB, null, VERSI_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1){
            db.execSQL(DROP_TABLE);
            onCreate(db);
        }
    }
}
