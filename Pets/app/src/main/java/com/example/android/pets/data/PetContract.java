package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    /*
    CREATE TABLE pets (
       _id INTEGER PRIMARY KEY AUTOINCREMENT,
       name TEXT NOT NULL,
       breed TEXT,
       gender INTEGER NOT NULL,
       weight INTEGER NOT NULL DEFAULT 0);

     */

    private PetContract() {}

    public static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}
