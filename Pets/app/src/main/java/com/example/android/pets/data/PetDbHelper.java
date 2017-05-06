package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/*
    PetDbHelper class
    https://developer.android.com/training/basics/data-storage/databases.html#DbHelper
 */
public class PetDbHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "pet.db";

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "+ PetEntry.TABLE_NAME+" (" +
            PetEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            PetEntry.COLUMN_PET_NAME+" TEXT NOT NULL," +
            PetEntry.COLUMN_PET_BREED+" TEXT," +
            PetEntry.COLUMN_PET_GENDER+" INTEGER NOT NULL," +
            PetEntry.COLUMN_PET_WEIGHT+" INTEGER NOT NULL DEFAULT 0)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;

    public PetDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}