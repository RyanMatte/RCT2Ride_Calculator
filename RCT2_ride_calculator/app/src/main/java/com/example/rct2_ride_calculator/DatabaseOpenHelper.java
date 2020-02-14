package com.example.rct2_ride_calculator;

import android.content.Context;

public class DatabaseOpenHelper extends com.readystatesoftware.sqliteasset.SQLiteAssetHelper {
    public static final String DATABASE_NAME = "quiz.db";
    public static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}