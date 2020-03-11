package com.example.federicksolutions;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Spannable;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String federick = "banco.db";
    private static final int version = 1;


    public Conexao(@Nullable Context context) {
        super(context, federick,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table veiculo(id integer primary key autoincrement, " + "Destino varchar (50), PlacaVeiculo varchar (30), CPF varchar (20))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
