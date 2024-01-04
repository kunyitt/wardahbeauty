package com.example.finalproject

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null,
        DATABASE_VERSION) {
    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "DatabaseAkun"
        private val TABLE_CONTACTS = "TabelAkun"
        private val KEY_Gender = "gender"
        private val KEY_TglLahir = "tgllahir"
        private val KEY_Email = "email"
        private val KEY_NoHp = "nohp"
        private val KEY_GantiPw = "gantipw"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        //Membuat tabel
        val CREATE_CONTACTS_TABLE = ("CREATE TABLE " +
                TABLE_CONTACTS + "("
                + KEY_Gender + " TEXT," +
                KEY_TglLahir + " TEXT,"
                + KEY_Email + " TEXT," +
                KEY_NoHp + " TEXT," +
                KEY_GantiPw + " TEXT" + ")")
        db?.execSQL(CREATE_CONTACTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_CONTACTS")
        onCreate(db)
    }
}
