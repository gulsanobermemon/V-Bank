package com.example.krsaool.myvocabularybank.database;


import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.sql.language.Delete;

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public class AppDatabase{

    public static final String NAME = "VocabAppDatabase";
    public static final int VERSION = 1;

    public static void deleteDatabase() {
        deleteAllLogTables();
    }

    public static void deleteAllLogTables() {
        Delete.tables(
                //CardDeckModel.class,
                //QuestionModel.class,
                //TestModel.class,
                //UserProgressModel.class
                //WordItemTable.class
        );
    }

}