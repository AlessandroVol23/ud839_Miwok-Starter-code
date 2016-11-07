package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Arraylist with Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        //creating the words with translation
        words.add(new com.example.android.miwok.Word("father", "әpә"));
        words.add(new com.example.android.miwok.Word("mother", "әṭa"));
        words.add(new com.example.android.miwok.Word("son", "angsi"));
        words.add(new com.example.android.miwok.Word("daughter", "tune"));
        words.add(new com.example.android.miwok.Word("older brother", "taachi"));
        words.add(new com.example.android.miwok.Word("younger brother", "chalitti"));
        words.add(new com.example.android.miwok.Word("older sister", "teṭe"));
        words.add(new com.example.android.miwok.Word("younger sister", "kolliti"));
        words.add(new com.example.android.miwok.Word("grandmother", "ama"));
        words.add(new com.example.android.miwok.Word("grandfather", "paapa"));

        //creating a new WordAdapter Object with and give him context and word list
        WordAdapter adapter = new WordAdapter(this,words);
        //find the listview and set the adapter
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
